/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */


package interfaceGraphique;


import java.util.List;
import java.util.Set;

import baseDeDonnees.AlimentStockeService;
import baseDeDonnees.AlimentService;
import baseDeDonnees.HibernateService;
import baseDeDonnees.RecetteService;
import modeleDeDonnees.AlimentStockes;
import modeleDeDonnees.LivreRecettes;
import modeleDeDonnees.Aliment;
import modeleDeDonnees.Stock;
import interfaceGraphique.Controller;
import interfaceGraphique.Accueil;



/**
 *
 * @author julesa et loicb
 */
public class Main {
	
	public static Stock stock;
	/**
     * Controleur qui permet de mettre à jour les informations
     */
    public static final Controller controller = new Controller();
    public static List<Aliment> listAliments;
    public static LivreRecettes livreRecette;
    
    public static void main(String[] args) {
    	HibernateService.CreerConfig();
        // importation de la base 
        stock = new Stock(AlimentStockeService.importerTableAlimentStock());
        livreRecette = new LivreRecettes(RecetteService.importerTableRecette());
        
        listAliments = AlimentService.importerTableAliment();
        Set SetRecette = RecetteService.importerTableRecette();
		/*List<AlimentStockes> list=AlimentStockeService.importerTableAlimentStock();*/
		/*stocks.remplirstock("principal",list );*/
		stock.afficherContenuStock();
		System.out.println("afficher Fiche nouv");

		
		Accueil ac = new Accueil();
		ac.setVisible(true);
    }
}
