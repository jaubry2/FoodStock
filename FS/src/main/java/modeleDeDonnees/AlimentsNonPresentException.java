package modeleDeDonnees;

public class AlimentsNonPresentException extends RuntimeException {
    public AlimentsNonPresentException(String nomAliment) {
        super("L'aliment '" + nomAliment + "' n'est pas présent.");
    }
}
