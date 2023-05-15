package interfaceGraphique;

import java.util.List;

import baseDeDonnees.AlimentStockeService;
import baseDeDonnees.HibernateService;
import modeleDeDonnees.AlimentStockes;
import modeleDeDonnees.Stock;

public class MainNew {
	public static Stock stocks;
    
    public static void main(String[] args) {
    	HibernateService.CreerConfig();
        // importation de la base 
        stocks = new Stock();
		List<AlimentStockes> list=AlimentStockeService.importerTableAlimentStock();
		stocks.remplirstock("principal",list );
		FenetreAccueil ac = new FenetreAccueil();
		ac.setVisible(true);
    }

}
