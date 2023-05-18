package baseDeDonnees;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import jakarta.persistence.Query;
import modeleDeDonnees.Recette;
import modeleDeDonnees.RecetteAliment;

/**

    Cette classe représente le service pour la gestion des RecetteAliment en base de données avec Hibernate.

    Elle contient des méthodes pour ajouter, mettre à jour et supprimer des éléments de la table RecetteAliment.
    */
    public class RecetteAlimentService extends HibernateService {

    /**

        Met à jour la table RecetteAliment en ajoutant, modifiant ou supprimant des éléments.

        @param setRecetteAliment l'ensemble de RecetteAliment à mettre à jour.
        */
        public static void mettreAJourTable(Set<RecetteAliment> setRecetteAliment) {
        transaction = session.beginTransaction();
        try {
        // Récupérer tous les RecetteAliment de la table avec HQL
        Set<RecetteAliment> setBDD = RecetteAlimentService.importerTableRecetteAliment();

 

     // Parcourir l'ensemble de la table et supprimer les RecetteAliment qui ne sont plus dans setRecetteAliment
     for (RecetteAliment recetteAlimentBDD : setBDD) {
         if (!setRecetteAliment.contains(recetteAlimentBDD)) {
             String hql = "DELETE FROM RecetteAliment WHERE id = :recetteAlimentId";
             Query query = session.createQuery(hql);
             query.setParameter("recetteAlimentId", recetteAlimentBDD.getId());
             int result = query.executeUpdate();
         }
     }

     for (RecetteAliment recetteAliment : setRecetteAliment) {
         session.merge(recetteAliment);
     }

    } catch (Exception e) {
    // Gérer l'exception
    }

    transaction.commit();
    }

/**

    Cette méthode permet d'importer les données de la table recetteAliment de la base de données en les transformant en ensemble d'objets RecetteAliment.

    @return Un ensemble d'objets RecetteAliment importés depuis la base de données.
    */
    public static Set<RecetteAliment> importerTableRecetteAliment() {
        return session.createNativeQuery("SELECT * FROM RecetteAliment", RecetteAliment.class).getResultStream().collect(Collectors.toSet());

    }
}