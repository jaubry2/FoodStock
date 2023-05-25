/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */


package interfaceGraphique;


import java.util.List;
import java.util.Set;

import baseDeDonnees.AlimentStockeService;
import baseDeDonnees.GestionnaireFichier;
import baseDeDonnees.AlimentService;
import baseDeDonnees.HibernateService;
import baseDeDonnees.RecetteService;
import modeleDeDonnees.AlimentStockes;
import modeleDeDonnees.EnsembleAliment;
import modeleDeDonnees.Ingredient;
import modeleDeDonnees.LivreRecettes;
import modeleDeDonnees.Recette;
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
        EnsembleAliment litAliments = new EnsembleAliment (AlimentService.importerTableAliment());
		/*List<AlimentStockes> list=AlimentStockeService.importerTableAlimentStock();*/
		/*stocks.remplirstock("principal",list );*/
		stock.afficherContenuStock();
		System.out.println("afficher Fiche nouv");

		GestionnaireFichier gs = new GestionnaireFichier();
		gs.ecrireIngredientsDansFichier( "src/main/resources/listeCourse.txt", livreRecette.getRecettes().iterator().next().getListIngredients());
		Set<Ingredient> test = gs.lireIngredientsDepuisFichier("src/main/resources/listeCourse.txt",litAliments );
		
		Accueil ac = new Accueil();
		ac.setVisible(true);
    }
}
