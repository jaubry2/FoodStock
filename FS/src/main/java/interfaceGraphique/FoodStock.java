/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package interfaceGraphique ;

import java.util.List;

import baseDeDonnees.AlimentStockeService;
import baseDeDonnees.HibernateService;
import modeleDeDonnees.AlimentStockes;
import modeleDeDonnees.Stock;

/**
 *
 * @author julesa et loicb
 */
public class FoodStock {
	
	public static Stock stocks;
	
	
    
    public static void main(String[] args) {
    	HibernateService.CreerConfig();
        // importation de la base 
        stocks = new Stock();
		List<AlimentStockes> list=AlimentStockeService.importerTableAlimentStock();
		stocks.remplirstock("principal",list );
        Accueil mA = new Accueil();
        mA.setVisible(true);
    }
}
