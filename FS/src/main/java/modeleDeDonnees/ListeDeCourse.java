import java.util.HashMap;
import java.util.Map;

public class ListeDeCourse {
    private Map<Aliment, Integer> ingredients;
    private Map<Aliment, Integer> recettes;

    public ListeDeCourse() {
        ingredients = new HashMap<>();
        recettes = new HashMap<>();
    }

    /**
     * Ajoute un aliment avec sa quantité à la liste de course.
     * @param aliment l'aliment à ajouter
     * @param quantite la quantité de l'aliment
     */
    public void ajouterIngredient(Aliment aliment, int quantite) {
        ingredients.put(aliment, quantite);
    }

    /**
     * Supprime un aliment de la liste de course.
     * @param aliment l'aliment à supprimer
     */
    public void supprimerIngredient(Aliment aliment) {
        ingredients.remove(aliment);
    }

    /**
     * Ajoute une recette à la liste de course.
     * @param recette la recette à ajouter
     */
    public void ajouterRecette(Recette recette) {
        for (Map.Entry<Aliment, Integer> entry : recette.getIngredients().entrySet()) {
            Aliment aliment = entry.getKey();
            int quantite = entry.getValue();
            recettes.put(aliment, recettes.getOrDefault(aliment, 0) + quantite);
        }
    }

    /**
     * Compare la liste de course avec le stock pour générer la liste finale.
     * @param stock le stock d'ingrédients disponible
     * @return la liste de course avec les ingrédients manquants
     */
    public Map<Aliment, Integer> comparerStock(Stock stock) {
        Map<Aliment, Integer> listeCourse = new HashMap<>(ingredients);

        for (Map.Entry<Aliment, Integer> entry : stock.getIngredients().entrySet()) {
            Aliment aliment = entry.getKey();
            int quantiteEnStock = entry.getValue();

            if (listeCourse.containsKey(aliment)) {
                int quantiteNecessaire = listeCourse.get(aliment);
                int quantiteRestante = quantiteEnStock - quantiteNecessaire;

                if (quantiteRestante >= 0) {
                    listeCourse.remove(aliment);
                } else {
                    listeCourse.put(aliment, Math.abs(quantiteRestante));
                }
            }
        }

        return listeCourse;
    }
}
