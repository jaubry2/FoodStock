/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package interfaceGraphique ;

import java.util.List;
import java.util.Set;

import baseDeDonnees.AlimentStockeService;
import baseDeDonnees.AlimentsService;
import baseDeDonnees.HibernateService;
import baseDeDonnees.RecetteService;
import modeleDeDonnees.AlimentStockes;
import modeleDeDonnees.Aliments;
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
    public static List<Aliments> listAliments;
    
    public static void main(String[] args) {
    	HibernateService.CreerConfig();
        // importation de la base 
        stocks = new Stock();
        listAliments = AlimentsService.importerTableAliment();
        Set SetRecette = RecetteService.importerTableRecette();
		List<AlimentStockes> list=AlimentStockeService.importerTableAlimentStock();
		stocks.remplirstock("principal",list );
		stocks.afficherContenuStock();
		
		Accueil ac = new Accueil();
		ac.setVisible(true);
    }
}
