package modeleDeDonnees;

import java.util.List;

public class EnsembleAliment {
	
	private List<Aliment> listAliments;
	
	public EnsembleAliment(List<Aliment> listAliments) {
	 this.listAliments = listAliments;
	}
	
    public  Aliment getAlimentByName(String nom) {
        for (Aliment aliment : listAliments) {
            if (aliment.getNom().equals(nom)) {
                return aliment;
            }
        }
        throw new AlimentsNonPresentException(nom);
    }

}
