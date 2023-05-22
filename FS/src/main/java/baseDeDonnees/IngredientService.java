package baseDeDonnees;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import jakarta.persistence.Query;
import modeleDeDonnees.Recette;
import modeleDeDonnees.Ingredient;

/**

    Cette classe représente le service pour la gestion des RecetteAliment en base de données avec Hibernate.

    Elle contient des méthodes pour ajouter, mettre à jour et supprimer des éléments de la table RecetteAliment.
    */
    public class IngredientService extends HibernateService {

    /**

        Met à jour la table RecetteAliment en ajoutant, modifiant ou supprimant des éléments.

        @param setRecetteAliment l'ensemble de RecetteAliment à mettre à jour.
        */
        public static void mettreAJourTable(Set<Ingredient> setIngredient) {
        transaction = session.beginTransaction();
        try {
        // Récupérer tous les RecetteAliment de la table avec HQL
        Set<Ingredient> setBDD = IngredientService.importerTableRecetteAliment();

 

        // Parcourir l'ensemble de la table et supprimer les RecetteAliment qui ne sont plus dans setRecetteAliment
        for (Ingredient ingredientBDD : setBDD) {
        	if (!setIngredient.contains(ingredientBDD)) {
             String hql = "DELETE FROM Ingredient WHERE id = :IngredientId";
             Query query = session.createQuery(hql);
             query.setParameter("IngredientId", ingredientBDD.getId());
             int result = query.executeUpdate();
         }
     }

     for (Ingredient ingredient : setIngredient) {
         session.merge(ingredient);
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
    public static Set<Ingredient> importerTableRecetteAliment() {
        return session.createNativeQuery("SELECT * FROM Ingredient", Ingredient.class).getResultStream().collect(Collectors.toSet());

    }
}