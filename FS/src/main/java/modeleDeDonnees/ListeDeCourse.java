package modeleDeDonnees;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import interfaceGraphique.Main;

import java.util.HashSet;

public class ListeDeCourse extends Observable{
  
    private Long id;

 
    private Set<Ingredient> ingredients;

  

   

	public ListeDeCourse() {
    	this.ingredients = new HashSet<>();
    }
	
	
	 public ListeDeCourse(Set<Ingredient> ingredients) {
		 this.ingredients=ingredients;
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
        ingredients.add(ingredient);
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
            this.comparerStock(Main.stock);
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

        this.ingredients = ingredientsNecessaire;
    }

}
