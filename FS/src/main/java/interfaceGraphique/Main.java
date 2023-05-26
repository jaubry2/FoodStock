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
import modeleDeDonnees.ListeDeCourse;
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
    public static LivreRecettes livreRecette;
	public static GestionnaireFichier gestionnaireFichier;
	public static EnsembleAliment ensembleAliment;
	public static ListeDeCourse listeCourse;
	public static final String nomFichier = "src/main/resources/listeCourse.txt";
    
    
    public static void main(String[] args) {
    	HibernateService.CreerConfig();
        // importation de la base 
        stock = new Stock(AlimentStockeService.importerTableAlimentStock());
        livreRecette = new LivreRecettes(RecetteService.importerTableRecette());
        gestionnaireFichier = new GestionnaireFichier();
        ensembleAliment = new EnsembleAliment (AlimentService.importerTableAliment());
		Set<Ingredient> ingredients = gestionnaireFichier.lireIngredientsDepuisFichier(nomFichier,ensembleAliment );
        listeCourse = new ListeDeCourse(ingredients);
		GestionnaireFichier gs = new GestionnaireFichier();
		Accueil ac = new Accueil();
		ac.setVisible(true);
    }
}


