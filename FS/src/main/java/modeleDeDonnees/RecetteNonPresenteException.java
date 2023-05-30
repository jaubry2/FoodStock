package modeleDeDonnees;

/**
 * Exception levée lorsque la recette n'est pas présente.
 */
public class RecetteNonPresenteException extends RuntimeException {

    /**
     * Constructeur de l'exception avec le nom de la recette manquante.
     *
     * @param nomRecette Le nom de la recette manquante.
     */
    public RecetteNonPresenteException(String nomRecette) {
        super("La recette '" + nomRecette + "' n'est pas présente.");
    }
}
