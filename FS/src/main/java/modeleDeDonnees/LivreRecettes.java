package modeleDeDonnees;

import java.util.HashSet;
import java.util.Set;

public class LivreRecettes extends Observable {
    private Set<Recette> recettes;

    /**
     * Constructeur par défaut de la classe LivreRecettes.
     * Initialise un nouvel ensemble de recettes vide.
     */
    public LivreRecettes() {
        this.recettes = new HashSet<>();
    }

    /**
     * Constructeur de la classe LivreRecettes.
     * Initialise l'ensemble de recettes avec l'ensemble donné en paramètre.
     *
     * @param recettes l'ensemble de recettes à associer au livre de recettes
     */
    public LivreRecettes(Set<Recette> recettes) {
        this.recettes = recettes;
    }

    /**
     * Renvoie l'ensemble des recettes du livre de recettes.
     *
     * @return l'ensemble des recettes du livre de recettes
     */
    public Set<Recette> getRecettes() {
        return recettes;
    }

    /**
     * Modifie l'ensemble des recettes du livre de recettes.
     *
     * @param recettes le nouvel ensemble de recettes à associer au livre de recettes
     */
    public void setRecettes(Set<Recette> recettes) {
        this.recettes = recettes;
    }

    /**
     * Ajoute une recette au livre de recettes.
     *
     * @param recette la recette à ajouter
     */
    public void ajouterRecette(Recette recette) {
        recettes.add(recette);
        notifyObservers();
    }

    /**
     * Enlève une recette du livre de recettes.
     *
     * @param recette la recette à enlever
     */
    public void enleverRecette(Recette recette) {
        recettes.remove(recette);
    }

    /**
     * Affiche les noms des recettes du livre de recettes.
     */
    public void afficherNomRecettes() {
        for (Recette r : this.recettes) {
            System.out.println(r.getNom());
        }
    }

    /**
     * Affiche les ingrédients et leurs quantités respectives pour une recette donnée.
     *
     * @param r la recette pour laquelle afficher les ingrédients
     */
    public void afficherIngredients(Recette r) {
        r.afficherIngredient();
    }

    /**
     * Filtre les recettes du livre de recettes en fonction de la durée de préparation.
     *
     * @param cdr le critère de durée de recette à utiliser pour le filtrage
     * @return un nouveau livre de recettes contenant les recettes filtrées
     */
    public LivreRecettes FiltrerParDuree(CritereDureeRecette cdr) {
        LivreRecettes recettesFiltre = new LivreRecettes();

        for (Recette recette : recettes) {
            if (cdr.estDansLaPlage(recette.getDuree())) {
                recettesFiltre.ajouterRecette(recette);
            }
        }

        return recettesFiltre;
    }

    /**
     * Filtre les recettes du livre de recettes en fonction d'un aliment donné.
     *
     * @param aliment l'aliment à utiliser comme critère de filtrage
     * @return un nouveau livre de recettes contenant les recettes filtrées
     */
    public LivreRecettes FiltrerParAliment(Aliment aliment) {
        LivreRecettes recettesFiltre = new LivreRecettes();

        for (Recette recette : recettes) {
            if (recette.isAliment(aliment)) {
                recettesFiltre.ajouterRecette(recette);
            }
        }

        return recettesFiltre;
    }

    /**
     * Récupère une recette du livre de recettes en fonction de son nom.
     *
     * @param nom le nom de la recette à récupérer
     * @return la recette correspondant au nom donné
     * @throws RecetteNonPresenteException si aucune recette avec le nom donné n'est présente dans le livre de recettes
     */
    public Recette getRecetteByName(String nom) throws RecetteNonPresenteException {
        for (Recette recette : recettes) {
            if (recette.getNom().equals(nom)) {
                return recette;
            }
        }
        throw new RecetteNonPresenteException(nom);
    }
}
