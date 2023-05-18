package baseDeDonnees;

import java.util.List;
import jakarta.persistence.Query;
import modeleDeDonnees.AlimentStockes;
import modeleDeDonnees.Recette;
import modeleDeDonnees.RecetteAliment;
import modeleDeDonnees.Aliment;

/**

Cette classe gère les interactions avec la table "Aliment" de la base de données.
Elle hérite de la classe HibernateService pour utiliser les fonctionnalités d'Hibernate.
*/

public class AlimentService extends HibernateService  {
	
	

	/**
	 * Cette méthode permet de mettre à jour plusieurs aliments dans la table "Aliment" de la base de données.
	 * @param ListAliments La liste des aliments à mettre à jour.
	 */
	public static void mettreAJourTable(List<Aliment> ListAliments) {
		
        transaction = session.beginTransaction();
        
        try {
     // Récupérer tous les AlimentStockes de la table avec HQL
		List<Aliment> listBDD = importerTableAliment();

        // Parcourir la liste de la table et supprimer les AlimentStockes qui ne sont plus dans ListAlimentStockes
        for (Aliment alimentsBDD : listBDD) {
            if (!ListAliments.stream().anyMatch(aliments -> alimentsBDD.getId() == aliments.getId())) {
            	String hql = "DELETE FROM Aliments WHERE id = :alimentId";
            	Query query = session.createQuery(hql);
            	query.setParameter("alimentId", alimentsBDD.getId());
            	int result = query.executeUpdate();
            }
            else {
            	Aliment alimentTrouvee = null;
            	for (Aliment aliment : ListAliments) {
            	    if (aliment.equals(alimentsBDD)) {
            	    	alimentTrouvee = aliment;
            	        break;
            	    }
            	}
            	for (RecetteAliment recetteAlimentBDD : alimentsBDD.getRecetteAliments()) {
            
                    if (!alimentTrouvee.getRecetteAliments().contains(recetteAlimentBDD)) {

                    // Suppression des associations RecetteAliment
                       String deleteAssociationsQuery = "DELETE FROM RecetteAliment WHERE aliment.id = :alimentId AND recette.id = :recetteId ";
                       Query query = session.createQuery(deleteAssociationsQuery);
                       query.setParameter("alimentId", alimentsBDD.getId());
                       query.setParameter("recetteId", recetteAlimentBDD.getRecette().getId());

                       int result = query.executeUpdate();
                    }
            	}
            }
        }

		
			for (Aliment aliments : ListAliments) {
				session.merge(aliments);

			}
		}
		catch (Exception e) {
			
		}
		
		transaction.commit();
	}
	/**
	 * Cette méthode permet d'importer la table "Aliments" de la base de données.
	 * @return La liste des aliments importés.
	 */
	public static List<Aliment> importerTableAliment(){
		return session.createNativeQuery("SELECT * FROM Aliment", Aliment.class).getResultList();
	}
	/**
	 * Cette méthode permet de chercher un aliment par son nom dans la table "Aliments" de la base de données.
	 * @param nom Le nom de l'aliment cherché.
	 * @return L'aliment cherché.
	 */
	public static Aliment findByName(String nom) {
		try {
		    Query query = session.createQuery("FROM Aliment WHERE nom = :nom");
		    query.setParameter("nom", nom);
		    return (Aliment) query.getSingleResult();

		}
		catch (Exception e) {
	    	return null;
		}
	}
	/**
	 * Cette méthode permet de chercher un aliment par son identifiant dans la table "Aliments" de la base de données.
	 * @param idAliment L'identifiant de l'aliment cherché.
	 * @return L'aliment cherché.
	 */
	public static Aliment getById(Long idAliment) {
	    Query query = session.createQuery("FROM Aliment WHERE id = :id");
	    query.setParameter("id", idAliment);
	    return (Aliment) query.getSingleResult();
	}

}
