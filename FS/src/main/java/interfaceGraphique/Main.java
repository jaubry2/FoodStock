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
import modeleDeDonnees.RecetteAliment;
import modeleDeDonnees.Aliment;
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
    public static List<Aliment> listAliments;
    
    public static void main(String[] args) {
    	HibernateService.CreerConfig();
        // importation de la base 
        stocks = new Stock();
        listAliments = AlimentService.importerTableAliment();
        Set SetRecette = RecetteService.importerTableRecette();
     // Obtenir l'itérateur pour parcourir les éléments du Set
        Iterator<Recette> iterator = SetRecette.iterator();

        // Vérifier s'il y a un élément suivant dans le Set
       /* if (iterator.hasNext()) {
            // Récupérer le premier élément du Set
            Recette recette = iterator.next();
            
            // Appeler la méthode changerQuantiteRecetteAliment sur la recette avec les paramètres appropriés
            recette.changerQuantiteRecetteAliment("tomate", 1);
            Iterator<RecetteAliment> iteratorRecetteAliment = recette.getRecetteAliments().iterator();
            // Vérifier s'il y a un élément suivant dans le Set
            if (iteratorRecetteAliment.hasNext()) {
                // Récupérer le premier élément du Set
            	RecetteAliment recetteAliment = iteratorRecetteAliment.next();
                
            recette.getRecetteAliments().remove(recetteAliment);
          
            }
        }    
        RecetteService.mettreAJourTable(SetRecette);
        SetRecette = RecetteService.importerTableRecette();*/

		List<AlimentStockes> list=AlimentStockeService.importerTableAlimentStock();
		stocks.remplirstock("principal",list );
		stocks.afficherContenuStock();
		listAliments.get(1).changerQuantiteRecetteAliment("pizza",2);
		Iterator<RecetteAliment> iteratorRecetteAliment = listAliments.get(1).getRecetteAliments().iterator();
        // Vérifier s'il y a un élément suivant dans le Set
        if (iteratorRecetteAliment.hasNext()) {
            // Récupérer le premier élément du Set
        	RecetteAliment recetteAliment = iteratorRecetteAliment.next();
            
        	listAliments.get(1).getRecetteAliments().remove(recetteAliment);
      
        }

		AlimentService.mettreAJourTable(listAliments);
        listAliments = AlimentService.importerTableAliment();
        
		Accueil ac = new Accueil();
		ac.setVisible(true);
    }
}
