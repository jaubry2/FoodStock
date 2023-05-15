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
public class Main {
	
	public static Stock stocks;
	/**
     * Controleur qui permet de mettre à jour les informations
     */
    public static final Controller controller = new Controller();
	
    
    public static void main(String[] args) {
    	HibernateService.CreerConfig();
        // importation de la base 
        stocks = new Stock();
		List<AlimentStockes> list=AlimentStockeService.importerTableAlimentStock();
		stocks.remplirstock("principal",list );
		Accueil ac = new Accueil();
		ac.setVisible(true);
    }
}
