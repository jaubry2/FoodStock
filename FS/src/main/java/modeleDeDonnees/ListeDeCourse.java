import java.util.HashMap;
import java.util.Map;

public class ListeDeCourse {
  
    private Long id;

 
    private Set<RecetteAliment> ingredients;

  
    private Set<Recette> recettes;

    public ListeDeCourse() {
    	this.ingredients = new HashSet<>();
        this.recettes = new HashSet<>();
    }

    /**
     * Ajoute un ingrédient à la liste de course.
     *
     * @param recetteAliment l'objet RecetteAliment à ajouter
     */
    public void ajouterIngredient(RecetteAliment recetteAliment) {
        ingredients.add(recetteAliment);
    }

    /**
     * Supprime un ingrédient de la liste de course.
     *
     * @param recetteAliment l'objet RecetteAliment à supprimer
     */
    public void supprimerIngredient(RecetteAliment recetteAliment) {
        ingredients.remove(recetteAliment);
    }

    /**
     * Ajoute une recette à la liste de course.
     *
     * @param recette la recette à ajouter
     */
    public void ajouterRecette(Recette recette) {
        // Parcourir les ingrédients de la recette avec leurs quantités nécessaires
        for (RecetteAliment recetteAliment : recette.getRecetteAliments()) {
            Aliment aliment = recetteAliment.getAliment();
            int quantiteNecessaire = recetteAliment.getQuantite();

            // Vérifier si l'aliment est déjà présent dans la liste de course
            boolean alimentExiste = false;
            for (RecetteAliment ingredient : ingredients) {
                if (ingredient.getAliment().equals(aliment)) {
                    // Ajouter la quantité nécessaire à la quantité existante dans la liste de course
                    int quantiteExistante = ingredient.getQuantite();
                    ingredient.setQuantite(quantiteExistante + quantiteNecessaire);
                    alimentExiste = true;
                    break;
                }
            }

            // Si l'aliment n'existe pas, l'ajouter à la liste de course
            if (!alimentExiste) {
                RecetteAliment nouvelIngredient = new RecetteAliment(aliment, quantiteNecessaire);
                ingredients.add(nouvelIngredient);
            }
        }
    }

    /**
     * Compare la liste de course avec le stock pour générer la liste finale.
     *
     * @param stock le stock d'ingrédients disponible
     * @return la liste de course avec les ingrédients manquants et leurs quantités nécessaires
     */
    public Map<RecetteAliment, Integer> comparerStock(Stock stock) {
        Map<RecetteAliment, Integer> listeCourse = new HashMap<>();

        for (RecetteAliment recetteAliment : ingredients) {
            int quantiteNecessaire = recetteAliment.getQuantite();
            int quantiteEnStock = stock.getQuantite(recetteAliment.getAliment());
            int quantiteRestante = quantiteEnStock - quantiteNecessaire;

            if (quantiteRestante < 0) {
                listeCourse.put(recetteAliment, Math.abs(quantiteRestante));
            }
        }

        return listeCourse;
    }

}
