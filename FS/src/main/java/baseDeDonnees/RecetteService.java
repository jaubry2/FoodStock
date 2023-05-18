package baseDeDonnees;

import jakarta.persistence.Query;
import modeleDeDonnees.Recette;
import modeleDeDonnees.RecetteAliment;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**

Cette classe gère les interactions avec la table "Recettes" de la base de données.
Elle hérite de la classe `HibernateService` pour utiliser les fonctionnalités d'Hibernate.
*/

public class RecetteService extends HibernateService {

    /**
     * Cette méthode permet de mettre à jour plusieurs recettes dans la table "Recettes" de la base de données.
     * @param setRecettes Le set des recettes à mettre à jour.
     */
    public static void mettreAJourTable(Set<Recette> setRecettes ) {
        transaction = session.beginTransaction();

        try {
            // Récupérer toutes les recettes de la table avec HQL
            Set<Recette> setBDD = importerTableRecette();

            // Parcourir le set de la table et supprimer les recettes qui ne sont plus dans setRecettes
            for (Recette recetteBDD : setBDD) {
                if (!setRecettes.contains(recetteBDD)) {
                    String hql = "DELETE FROM Recette WHERE id = :recetteId";
                    Query query = session.createQuery(hql);
                    query.setParameter("recetteId", recetteBDD.getId());
                    int result = query.executeUpdate();
                }
                else {
                	Recette recetteTrouvee = null;
                	for (Recette recette : setRecettes) {
                	    if (recette.equals(recetteBDD)) {
                	        recetteTrouvee = recette;
                	        break;
                	    }
                	}
                	for (RecetteAliment recetteAlimentBDD : recetteBDD.getRecetteAliments()) {
                
                        if (!recetteTrouvee.getRecetteAliments().contains(recetteAlimentBDD)) {
 
	                    // Suppression des associations RecetteAliment
                        	String deleteAssociationsQuery = "DELETE FROM RecetteAliment WHERE recette.id = :recetteId AND aliment.id = :alimentId";
                            Query query = session.createQuery(deleteAssociationsQuery);
                            query.setParameter("recetteId", recetteBDD.getId());
                            query.setParameter("alimentId", recetteAlimentBDD.getAliment().getId());
	                       int result = query.executeUpdate();
                        	}
                	}
                }
                
            } for (Recette recette : setRecettes) {
                session.merge(recette);
            }
        } catch (Exception e) {
            // Gestion des exceptions
        }

        transaction.commit();
    }

    /**
     * Cette méthode permet d'importer la table "Recettes" de la base de données.
     * @return Le set des recettes importées.
     */
    public static Set<Recette> importerTableRecette() {
        List<Recette> recettes = session.createNativeQuery("SELECT * FROM Recettes", Recette.class).getResultList();
        return new HashSet<>(recettes);
    }
}


