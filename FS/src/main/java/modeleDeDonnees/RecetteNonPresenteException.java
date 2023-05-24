package modeleDeDonnees;

public class RecetteNonPresenteException extends RuntimeException {
    public RecetteNonPresenteException(String nomAliment) {
        super("La recette '" + nomAliment + "' n'est pas présente.");
    }
}
