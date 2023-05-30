package modeleDeDonnees;

import java.util.List;

public class EnsembleAliment {

    private List<Aliment> listAliments;

    /**
     * Constructeur de la classe EnsembleAliment.
     *
     * @param listAliments la liste d'aliments à initialiser
     */
    public EnsembleAliment(List<Aliment> listAliments) {
        this.listAliments = listAliments;
    }

    /**
     * Retourne la liste d'aliments.
     *
     * @return la liste d'aliments
     */
    public List<Aliment> getListAliments() {
        return listAliments;
    }

    /**
     * Modifie la liste d'aliments.
     *
     * @param listAliments la nouvelle liste d'aliments
     */
    public void setListAliments(List<Aliment> listAliments) {
        this.listAliments = listAliments;
    }

    /**
     * Retourne l'aliment correspondant au nom donné.
     *
     * @param nom le nom de l'aliment à rechercher
     * @return l'aliment correspondant au nom donné
     * @throws AlimentsNonPresentException si aucun aliment correspondant au nom n'est trouvé
     */
    public Aliment getAlimentByName(String nom) throws AlimentsNonPresentException {
        for (Aliment aliment : listAliments) {
            if (aliment.getNom().equals(nom)) {
                return aliment;
            }
        }
        throw new AlimentsNonPresentException(nom);
    }

    /**
     * Ajoute un aliment à la liste d'aliments.
     *
     * @param aliment l'aliment à ajouter
     */
    public void ajouterAliment(Aliment aliment) {
        listAliments.add(aliment);
    }

    /**
     * Vérifie si un aliment avec le nom donné existe dans la liste d'aliments.
     *
     * @param nom le nom de l'aliment à vérifier
     * @return true si un aliment correspondant au nom existe, sinon false
     */
    public boolean isAliment(String nom) {
        for (Aliment aliment : listAliments) {
            if (aliment.getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }
}
