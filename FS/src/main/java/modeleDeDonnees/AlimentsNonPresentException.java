package modeleDeDonnees;

/**
 * Exception levée lorsque l'aliment recherché n'est pas présent.
 */
public class AlimentsNonPresentException extends RuntimeException {

    /**
     * Constructeur de l'exception.
     *
     * @param nomAliment le nom de l'aliment non présent
     */
    public AlimentsNonPresentException(String nomAliment) {
        super("L'aliment '" + nomAliment + "' n'est pas présent.");
    }
}
