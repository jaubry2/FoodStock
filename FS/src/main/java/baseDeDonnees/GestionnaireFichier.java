package baseDeDonnees;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import modeleDeDonnees.Aliment;
import modeleDeDonnees.EnsembleAliment;
import modeleDeDonnees.Ingredient;

/**
 * Cette classe contient une méthode pour écrire les ingrédients dans un fichier texte.
 */
public class GestionnaireFichier {

    /**
     * Écrit les ingrédients dans un fichier texte.
     *
     * @param ingredients   L'ensemble d'ingrédients à écrire.
     * @param cheminFichier Le chemin et le nom du fichier de sortie.
     */
    public void ecrireIngredientsDansFichier(String cheminFichier, Set<Ingredient> ingredients ) {
        try {
            File fichier = new File(cheminFichier);

            // Vérifier si le fichier existe, sinon le créer
            if (!fichier.exists()) {
                fichier.createNewFile();
            }

            BufferedWriter writer = new BufferedWriter(new FileWriter(fichier));

            for (Ingredient ingredient : ingredients) {
                Aliment aliment = ingredient.getAliment();
                int quantite = ingredient.getQuantite();
                String nomAliment = aliment.getNom();

                writer.write("Quantité : " + quantite + ", Nom : " + nomAliment);
                writer.newLine();
            }

            writer.close();

            System.out.println("Les ingrédients ont été écrits dans le fichier avec succès !");
        } catch (IOException e) {
            System.err.println("Une erreur s'est produite lors de l'écriture dans le fichier : " + e.getMessage());
        }
    }


        public Set<Ingredient> lireIngredientsDepuisFichier(String cheminFichier , EnsembleAliment listAliments) {
            Set<Ingredient> ingredients = new HashSet<>();

            try (BufferedReader reader = new BufferedReader(new FileReader(cheminFichier))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    // Supposons que chaque ligne du fichier a le format "Quantité : <quantite>, Nom : <nom>"
                    int indexQuantite = line.indexOf("Quantité : ") + "Quantité : ".length();
                    int indexNom = line.indexOf(", Nom : ") + ", Nom : ".length();

                    String quantiteStr = line.substring(indexQuantite, indexNom - ", Nom : ".length());
                    String nom = line.substring(indexNom);
                    Aliment aliment = listAliments.getAlimentByName(nom);
                    

                    int quantite = Integer.parseInt(quantiteStr);

                    Ingredient ingredient = new Ingredient(aliment, quantite);

                    ingredients.add(ingredient);
                }
            } catch (IOException e) {
                System.err.println("Une erreur s'est produite lors de la lecture du fichier : " + e.getMessage());
            }

            return ingredients;
        }


}

