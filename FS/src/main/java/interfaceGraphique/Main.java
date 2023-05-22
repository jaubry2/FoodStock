/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package interfaceGraphique ;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import baseDeDonnees.AlimentStockeService;
import baseDeDonnees.AlimentService;
import baseDeDonnees.HibernateService;
import baseDeDonnees.RecetteService;
import modeleDeDonnees.AlimentStockes;
import modeleDeDonnees.Recette;
import modeleDeDonnees.Ingredient;
import modeleDeDonnees.MoyendeConservation;
import modeleDeDonnees.Aliment;
import modeleDeDonnees.Stock;
import modeleDeDonnees.TypeAliment;
import modeleDeDonnees.UnitedeMesure;



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
    public static List<Aliment> listAliments;

    
    public static void main(String[] args) {
    	HibernateService.CreerConfig();
        // importation de la base 
        //stocks = new Stock();
        listAliments = AlimentService.importerTableAliment();
        /*Aliment poire =new Aliment("poire",UnitedeMesure.Unite,MoyendeConservation.Sachet
				,TypeAliment.Fruits_Legumes);
        listAliments.add(poire);
        listAliments.remove(listAliments.get(2));
        AlimentService.mettreAJourTable(listAliments);*/
        
        

        Set<Recette> setRecette = RecetteService.importerTableRecette();
        /*setRecette.remove(setRecette.iterator().next());
        Recette aligot = Recette.creerRecette("aligot",20,listAliments.get(1),300);
        setRecette.add(aligot);*/
        setRecette.iterator().next().changerQuantiteRecetteAliment("banane", 0);
        RecetteService.enregistrer(setRecette); 
        
        System.out.println("aa");
        
     // Obtenir l'itérateur pour parcourir les éléments du Set

        // Vérifier s'il y a un élément suivant dans le Set
        
        /*Iterator<Ingredient> iteratorRecetteAliment = null;
        for (Recette recetteP : SetRecette ) {
        	
	        if (recetteP.getNom().equals("Salade de pate")){
	            // Récupérer le premier élément du Set
	              iteratorRecetteAliment = recetteP.getListIngredients().iterator();
	              Ingredient recetteAliment = iteratorRecetteAliment.next();

	              recetteP.getListIngredients().remove(recetteAliment);
	              Ingredient pate = new Ingredient(listAliments.get(2),300);
	              recetteP.getListIngredients().add(pate);
	           
	    
	        }
             
        	
        }
         
         
          
          
         
         
            
        RecetteService.mettreAJourTable(SetRecette);
        SetRecette = RecetteService.importerTableRecette();*/

		/*List<AlimentStockes> list=AlimentStockeService.importerTableAlimentStock();
		stocks.remplirstock("principal",list);
		stocks.afficherContenuStock();*/
		
        
		/*RecetteService.mettreAJourTable(SetRecette);
        SetRecette = RecetteService.importerTableRecette();*/
        
		//Accueil ac = new Accueil();
		//ac.setVisible(true);
    }
}
