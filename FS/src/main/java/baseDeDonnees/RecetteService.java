package baseDeDonnees;

import jakarta.persistence.Query;
import modeleDeDonnees.Recette;
import modeleDeDonnees.Aliment;
import modeleDeDonnees.Ingredient;

import java.io.ObjectInputFilter.Config;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**

Cette classe gère les interactions avec la table "Recettes" de la base de données.
Elle hérite de la classe `HibernateService` pour utiliser les fonctionnalités d'Hibernate.
*/

public class RecetteService extends HibernateService {

    /**
     * Cette méthode permet de mettre à jour plusieurs recettes dans la table "Recettes" de la base de données.
     * @param setRecettes Le set des recettes à mettre à jour.
	 */

	
	
	/**Suppression Recette.
	 * on recherche identifiant technique en memoire 
	 * et on fait un selecte  des indentifiants qui ne sont pas dans la liste et on delete CASCADE ou ingredient d'abbord
	 * transaction commit 
	 **/
	/** Ajouter.
	 * ce qui ont pas d'id et j'ajoute ingredients puis recette
	 *
	 */
	/**
	 * supprimer indentifiant technique 
	 */
	public static void enregistrer(Set<Recette> setRecette) {
		supprimer(setRecette);
		ajouter(setRecette);
		
	}
	public static void ajouter(Set<Recette> setRecette) {

	    transaction = session.beginTransaction();
	    List listRecetteAjout = new ArrayList<>();
		for (Recette recette : setRecette ) {
			/*if (recette.getId() == null){
				session.persist(recette);
				
			}
			else {
				session.update(recette);
			}*/
			session.merge(recette);
		}
		transaction.commit();
		
	}
	public static void supprimer(Set<Recette> setRecette) {
        /*Configuration configRecette = new Configuration();
		 SessionFactory sessionFactory = configRecette.buildSessionFactory();
	     Session session = sessionFactory.openSession();*/
	    transaction = session.beginTransaction();
		List<Long> listIdPresent = new ArrayList<>();

        List<Recette> recetteBDDs = session.createNativeQuery("SELECT * FROM Recette",Recette.class).getResultList();
		for (Recette recette : setRecette ) {
			if (recette.getId() != null){
				listIdPresent.add(recette.getId());
			}
		}
		for (Recette recetteBDD : recetteBDDs ) {
			if (! listIdPresent.contains(recetteBDD.getId())) {
				String hqlIngredient = "DELETE FROM Ingredient i  WHERE i.recette_id = :idSupression "; 
				Query queryIngredient = session.createQuery(hqlIngredient);
		        queryIngredient.setParameter("idSupression",recetteBDD.getId());
		        int resultIngredient = queryIngredient.executeUpdate();
		        
		 		String hqlRecette = "DELETE FROM Recette WHERE id = :idSupression";
		 	    Query queryRecette = session.createQuery(hqlRecette);
		 	   queryRecette.setParameter("idSupression",recetteBDD.getId());
		        int resultRecette= queryRecette.executeUpdate();
			}
		}
		transaction.commit();
		
	}



 		/*String hqlRecette = "DELETE FROM Aliment WHERE id = :alimentId";
 	    Query queryRecette = session.createQuery(hqlRecette);
 	   queryRecette.setParameter("idSupression",listIdSuppression);*/


	
         
         /*Query query = session.createQuery(hql);
         query.setString("name","Product 1");
         int rowCount = query.executeUpdate();*/
			

	
	
	
	 	
    /*public static void mettreAJourTable(Set<Recette> setRecettes ) {
        transaction = session.beginTransaction();

        try {
        
    /*public static void mettreAJourTable(Set<Recette> setRecettes ) {
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

                
                
            } for (Recette recette : setRecettes) {
            	Set<Ingredient> setIngredient =recette.getListIngredients();
            	if(!setIngredient.isEmpty()) {
                	//IngredientService.mettreAJourTable(Ingredients);
            	        // Récupérer tous les RecetteAliment de la table avec HQL
            	        Set<Ingredient> setIngredientBDD = IngredientService.importerTableRecetteAliment();
            	        // Parcourir l'ensemble de la table et supprimer les RecetteAliment qui ne sont plus dans setRecetteAliment
            	        for (Ingredient ingredientBDD : setIngredientBDD) {
            	        	if (!setIngredient.contains(ingredientBDD)) {
	            	             String hql = "DELETE FROM Ingredient WHERE id = :IngredientId";
	            	             Query query2 = session.createQuery(hql);
	            	             query2.setParameter("IngredientId", ingredientBDD.getId());
	            	             int result = query2.executeUpdate();
            	        	}
            	        }
            	
            	

		            	for (Ingredient ingredient : setIngredient) {
		            	      session.merge(ingredient);
		            	}

            	   
            	   }


            	

                session.merge(recette);
            }
        } catch (Exception e) {
        	System.out.print(e.getMessage());
            // Gestion des exceptions
        }
        

        transaction.commit();
    }
    */
/*	public static void mettreAJourTable(Set<Recette> setRecettes) {
	    transaction = session.beginTransaction();

	    try {
	        // Récupérer toutes les recettes de la table avec HQL
	        Set<Recette> setBDD = importerTableRecette();

	        // Créer un ensemble pour stocker les ID des recettes à supprimer
	        Set<Long> recettesASupprimer = new HashSet<>();

	        // Parcourir le set de la table et ajouter les ID des recettes qui ne sont plus dans setRecettes
	        for (Recette recetteBDD : setBDD) {
	            if (!setRecettes.contains(recetteBDD)) {
	                recettesASupprimer.add(recetteBDD.getId());
	            }
	        }

	        // Supprimer les recettes qui ne sont plus présentes dans setRecettes
	        if (!recettesASupprimer.isEmpty()) {
	            String hqlRecette = "DELETE FROM Recette WHERE id IN :recetteIds";
	            Query queryRecette = session.createQuery(hqlRecette);
	            queryRecette.setParameter("recetteIds", recettesASupprimer);
	            int resultRecette = queryRecette.executeUpdate();

	            // Supprimer les ingrédients associés aux recettes supprimées
	            String hqlIngredient = "DELETE FROM Ingredient WHERE recette_id IN :recetteIds";
	            Query queryIngredient = session.createQuery(hqlIngredient);
	            queryIngredient.setParameter("recetteIds", recettesASupprimer);
	            int resultIngredient = queryIngredient.executeUpdate();
	        }

	        // Parcourir le setRecettes pour mettre à jour les recettes et les ingrédients
	        for (Recette recette : setRecettes) {
	            // Mettre à jour les ingrédients de la recette
	            Set<Ingredient> setIngredient = recette.getListIngredients();
	            if (!setIngredient.isEmpty()) {
	                for (Ingredient ingredient : setIngredient) {
	                    if (session.get(Ingredient.class, ingredient ) != null ) {
	                    	session.save(ingredient);
	                    }else {
	                    session.merge(ingredient);
	                }
	            }

	            // Fusionner (merge) la recette avec la session
	            session.merge(recette);
	        }
	        }
	    } catch (Exception e) {
	        System.out.print(e.getMessage());
	        // Gestion des exceptions
	    }

	    transaction.commit();
	}

 */   
    /**
     * Cette méthode permet d'importer la table "Recettes" de la base de données.
     * @return Le set des recettes importées.
     */
    public static Set<Recette> importerTableRecette() {
        List<Recette> recettes = session.createNativeQuery("SELECT * FROM Recette",Recette.class).getResultList();
        return new HashSet<>(recettes);
    }
}


