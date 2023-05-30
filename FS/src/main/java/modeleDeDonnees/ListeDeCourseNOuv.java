package modeleDeDonnees;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import interfaceGraphique.Main;

import java.util.HashSet;

public class ListeDeCourseNOuv extends Observable{
  
    private Long id;

 
    private Set<Ingredient> ingredients;



	private Set<Ingredient> ingredientsReserve;


   

	public ListeDeCourseNOuv() {
    	this.ingredients = new HashSet<>();
    }
	
	
	 public ListeDeCourseNOuv(Set<Ingredient> ingredients) {
		 this.ingredientsReserve=new HashSet<>();
		 this.ingredients = ingredients;
	}


	public Set<Ingredient> getIngredients() {
			return ingredients;
		}

		public void setIngredients(Set<Ingredient> ingredients) {
			this.ingredients = ingredients;
		}

    /**
     * Ajoute un ingrédient à la liste de course.
     *
     * @param ingredient l'objet Ingredient à ajouter
     */
    public void ajouterIngredient(Ingredient ingredient) {
    	System.out.println("ajouter Aliment");
    	boolean alimentExiste = false;
        for (Ingredient ingredientListeCourse : ingredients) {
            if (ingredient.equals(ingredientListeCourse)) {
                // Ajouter la quantité nécessaire à la quantité existante dans la liste de course
                float quantiteExistante = ingredientListeCourse.getQuantite();
                ingredientListeCourse.setQuantite(quantiteExistante + ingredient.getQuantite());
                alimentExiste = true;
                break;
            }
           
        }

        // Si l'aliment n'existe pas, l'ajouter à la liste de course
        if (!alimentExiste) {
            ingredients.add(ingredient);
        }
        notifyObservers();

    }

    /**
     * Supprime un ingrédient de la liste de course.
     *
     * @param ingredient l'objet Ingredient à supprimer
     */
    public void supprimerIngredient(Ingredient ingredient) {
        ingredients.remove(ingredient);
        notifyObservers();

    }

    /**
     * Ajoute une recette à la liste de course.
     *
     * @param recette la recette à ajouter
     */
    public void ajouterRecette(Recette recette) {
        // Parcourir les ingrédients de la recette avec leurs quantités nécessaires
        for (Ingredient ingredient : recette.getListIngredients()) {
            Aliment aliment = ingredient.getAliment();
            float quantiteNecessaire = ingredient.getQuantite();

            // Vérifier si l'aliment est déjà présent dans la liste de course
            boolean alimentExiste = false;
            for (Ingredient ingredientListeCourse : ingredients) {
                if (ingredientListeCourse.getAliment().equals(aliment)) {
                    // Ajouter la quantité nécessaire à la quantité existante dans la liste de course
                    float quantiteExistante = ingredientListeCourse.getQuantite();
                    ingredientListeCourse.setQuantite(quantiteExistante + quantiteNecessaire);
                    alimentExiste = true;
                    break;
                }
               
            }

            // Si l'aliment n'existe pas, l'ajouter à la liste de course
            if (!alimentExiste) {
                Ingredient nouvelIngredient = new Ingredient(aliment, quantiteNecessaire);
                ingredients.add(nouvelIngredient);
            }
            //this.comparerStock(Main.stock);
            notifyObservers();

        }
    }

    /**
     * Compare la liste de course avec le stock pour générer la liste finale.
     *
     * @param stock le stock d'ingrédients disponible
     * @return la liste de course avec les ingrédients manquants et leurs quantités nécessaires
     */
    public void comparerStock(Stock stock) {
        Set<Ingredient> ingredientsNecessaire = new HashSet<>();

        for (Ingredient ingredient : ingredients) {
            float quantiteNecessaire = ingredient.getQuantite();
            float quantiteEnStock =stock.getQuantiteASNonPerime(ingredient.getAliment().getNom());
           float quantiteRestante = quantiteEnStock - quantiteNecessaire;
		   if (quantiteRestante < 0) {
		        ingredient.setQuantite(Math.abs(quantiteRestante));
		        ingredientsNecessaire.add(ingredient);
		    }

        }
    }
        
        public void comparerStock(Recette recette,Stock stock) {
        	System.out.println("comparerStock");

            Set<Ingredient> ingredientsRecette = recette.getListIngredients();
            for (Ingredient ingredient : ingredientsRecette) {
            	System.out.println("ingredientsRecette");

            	float quantiteReserve = getQuantite(ingredient,ingredientsReserve);
            	System.out.println(quantiteReserve);
                float quantiteNecessaire = ingredient.getQuantite();
            	System.out.println(quantiteNecessaire);
                float quantiteEnStock =stock.getQuantiteASNonPerime(ingredient.getAliment().getNom());
            	System.out.println(quantiteEnStock);

               float quantiteRestante = quantiteEnStock-quantiteReserve - quantiteNecessaire;
           	   System.out.println(quantiteRestante);

               if (quantiteRestante < 0) {
            	   
            	   System.out.println("<0");
               	   System.out.println(quantiteRestante);
    		        ingredient.setQuantite(Math.abs(quantiteRestante));
    		        ajouterIngredient(ingredient);

            }
    		   else {
            	   System.out.println(">0");
   		        	AjouterQuantiteReserve(ingredient);
   		        	

    		   }

    }


}
        public boolean isIngredient(Ingredient ingredientTest,Set<Ingredient> ingredients) {
            for (Ingredient ingredient : ingredients) {
            	if (ingredient.equals(ingredientTest)) {
            		return true;
            	}
            }
            return false;
        }
        public float getQuantite(Ingredient ingredientTest,Set<Ingredient> ingredients) {
            for (Ingredient ingredient : ingredients) {
            	if (ingredient.equals(ingredientTest)) {
            		return ingredient.getQuantite();
            	}
            }
            return 0;
        }
        public void AjouterQuantiteReserve(Ingredient ingredientAjout) {
            for (Ingredient ingredient : ingredientsReserve) {
            	if (ingredient.equals(ingredientAjout)) {
            		System.out.println("aa");
            		ingredient.setQuantite(ingredient.getQuantite()+ingredientAjout.getQuantite());
            	}
            	else {
            		System.out.println("bb");

            		ingredientsReserve.add(new Ingredient(ingredientAjout.getAliment(),ingredient.getQuantite()));
            	}
            }
        }
        
}
