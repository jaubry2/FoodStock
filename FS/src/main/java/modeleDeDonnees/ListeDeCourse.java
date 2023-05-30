package modeleDeDonnees;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import interfaceGraphique.Main;

import java.util.HashSet;

public class ListeDeCourse extends Observable {
  
    private Long id;
    private Set<Ingredient> ingredients;

    /**
     * Constructeur par défaut de la classe ListeDeCourse.
     * Initialise un nouvel ensemble d'ingrédients vide.
     */
    public ListeDeCourse() {
        this.ingredients = new HashSet<>();
    }
	
	/**
     * Constructeur de la classe ListeDeCourse.
     * Initialise l'ensemble d'ingrédients avec l'ensemble donné en paramètre.
     *
     * @param ingredients l'ensemble d'ingrédients à associer à la liste de course
     */
    public ListeDeCourse(Set<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    /**
     * Renvoie l'ensemble des ingrédients de la liste de course.
     *
     * @return l'ensemble des ingrédients de la liste de course
     */
    public Set<Ingredient> getIngredients() {
        return ingredients;
    }

    /**
     * Modifie l'ensemble des ingrédients de la liste de course.
     *
     * @param ingredients le nouvel ensemble d'ingrédients à associer à la liste de course
     */
    public void setIngredients(Set<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    /**
     * Ajoute un ingrédient à la liste de course.
     *
     * @param ingredient l'objet Ingredient à ajouter
     */
    public void ajouterIngredient(Ingredient ingredient) {
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
            Ingredient ingredientAjout = new Ingredient(ingredient.getAliment(), ingredient.getQuantite());
            ingredients.add(ingredientAjout);
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
            
            notifyObservers();
        }
    }

    /**
     * Compare la liste de course avec le stock pour générer la liste finale.
     *
     * @param stock le stock d'ingrédients disponible
     */
    public void comparerStock(Stock stock) {
        Set<Ingredient> ingredientsNecessaire = new HashSet<>();

        for (Ingredient ingredient : ingredients) {
            float quantiteNecessaire = ingredient.getQuantite();
            float quantiteEnStock = stock.getQuantiteASNonPerime(ingredient.getAliment().getNom());
            float quantiteRestante = quantiteEnStock - quantiteNecessaire;

            if (quantiteRestante < 0) {
                ingredient.setQuantite(Math.abs(quantiteRestante));
                ingredientsNecessaire.add(ingredient);
            }
        }
    }
    
    /**
     * Compare la liste de course avec le stock pour générer la liste finale.
     * Ajoute les ingrédients manquants à la liste de course.
     *
     * @param recette la recette pour laquelle comparer le stock
     * @param stock   le stock d'ingrédients disponible
     */
    public void comparerStock(Recette recette, Stock stock) {
        Set<Ingredient> ingredientsRecette = recette.getListIngredients();
        
        for (Ingredient ingredient : ingredientsRecette) {
            float quantiteNecessaire = ingredient.getQuantite();
            float quantiteEnStock = stock.getQuantiteASNonPerime(ingredient.getAliment().getNom());
            float quantiteRestante = quantiteEnStock - quantiteNecessaire;

            if (quantiteRestante < 0) {
                Ingredient nouvelIngredient = new Ingredient(ingredient.getAliment(), Math.abs(quantiteRestante));
                ajouterIngredient(nouvelIngredient);
            }
        }
    }
}
