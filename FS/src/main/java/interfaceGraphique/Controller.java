/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaceGraphique;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;


import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.JOptionPane;
import javax.swing.JFrame;

import baseDeDonnees.GestionnaireFichier;
import modeleDeDonnees.AlimentStockes;
import modeleDeDonnees.Aliment;
import modeleDeDonnees.AlimentsNonPresentException;
import modeleDeDonnees.ControllerAjoutRecette;
import modeleDeDonnees.ControllerListeCourse;
import modeleDeDonnees.CritereDureeRecette;
import modeleDeDonnees.Ingredient;
import modeleDeDonnees.LivreRecettes;
import modeleDeDonnees.MoyendeConservation;
import modeleDeDonnees.Recette;
import modeleDeDonnees.Stock;
import modeleDeDonnees.TypeAliment;
import modeleDeDonnees.UnitedeMesure;


/**
 *
 * @author julesa
 */
public class Controller {
    
    
	public Controller() {};
	
	public void OuvrirPage(javax.swing.JFrame _page){
        _page.setVisible(true);
    }
    public void ChangerPage(String _page, String _erreur, String _message, String _nomAliment){
        javax.swing.JFrame newPage = null;
        System.out.println("changer page");
        
        if (_page.equals("accueil")) {
            newPage = new Accueil();
           OuvrirPage(newPage);
        } else if (_page.equals("ajouterAliment")) {
            newPage = new AjouterAliment();
           OuvrirPage(newPage);
        } else if (_page.equals("ficheAliment")) {
            newPage = new FicheAliment(_nomAliment,"","","","");
            OuvrirPage(newPage);
        } else if (_page.equals("menuListe")) {
        	DefaultTableModel model = this.afficherListeCourse();
            newPage = new MenuListe(model);
            System.out.println("aazz");
            ControllerListeCourse cLdC = new ControllerListeCourse(Main.listeCourse ,(MenuListe) newPage);
           OuvrirPage(newPage);
           
        } else if (_page.equals("menuRecette")) {
            newPage = new MenuRecette();
            OuvrirPage(newPage);
        } else if (_page.equals("menuStock")) {
            newPage = new MenuStock();
            OuvrirPage(newPage);
        } else if (_page.equals("modifierUnAliment")) {
            newPage = new ModifierUnAliment(_nomAliment);
           OuvrirPage(newPage);
        } else if (_page.equals("AjouterRecette")) {
        	
        	System.out.println("zaza");
        	newPage = new AjouterRecette();
            ControllerAjoutRecette cAR = new ControllerAjoutRecette(Main.livreRecette ,(AjouterRecette) newPage);

        	OuvrirPage(newPage);
        } else {
            // Erreur
        }

            
        }
 public void AjouterStock(DefaultTableModel d) {
    	
    	List<AlimentStockes> listRajout= new ArrayList<>();
    	
    	for (int ligne = 0; ligne < d.getRowCount(); ligne++) {
    		
	    	try {
	
		    	String nom = (String) d.getValueAt(ligne, 0);
		 
		    	int quantite = Integer.parseInt( (String) d.getValueAt(ligne, 1));
		    	
		    	LocalDate datePeremption = LocalDate.parse((String) d.getValueAt(ligne, 2),DateTimeFormatter.ofPattern("dd/MM/yyyy"));

		    	Aliment aliment = Stock.getAlimentByName(Main.ensembleAliment.getListAliments(), nom);
		    	
		    	AlimentStockes alimentRajout= new AlimentStockes(aliment,quantite,datePeremption);
		    	    	listRajout.add(alimentRajout);
	    	} catch(AlimentsNonPresentException e) {
	    		e.getMessage();
	    	}

    	}
        Main.stock.ajouterListe(listRajout );
        Main.stock.afficherContenuStock();
        
    };
    
public String[] AfficherFicheAliment(String nom ) {
	System.out.println("afficher Fiche");
	System.out.println(nom);
	AlimentStockes alimentFiche = Main.stock.getAlimentStockesByName(nom);
	String[] infoAliment = new String[5];
	infoAliment[0] = alimentFiche.getAliment().getNom();
	infoAliment[1]= String.valueOf(Main.stock.getQuantiteASNonPerime(alimentFiche.getAliment().getNom()));	
	infoAliment[2] = alimentFiche.getAliment().getTypeAliment().toString();
	infoAliment[3] = alimentFiche.getAliment().getMoyenConservation().toString();
	infoAliment[4] = Main.stock.getDatePlusRecente(nom).toString();
	
	return infoAliment;
}
public DefaultTableModel afficherRecetteLieAliment(String nom) {
	
	 Aliment aliment= Stock.getAlimentByName(Main.ensembleAliment.getListAliments(), nom);
	 LivreRecettes livreRecetteFiltre = Main.livreRecette.FiltrerParAliment(aliment);
	 
     Object[][] data = new Object[livreRecetteFiltre.getRecettes().size()][2];
     int i=0;
     for (Recette recette : livreRecetteFiltre.getRecettes()) {
    	 
         data[i][0] = recette.getNom();
         data[i][1] = recette.getQuantite(aliment);
        i++;
     }
     String[] columnNames = {"Recette", "Quantite"};
     DefaultTableModel model = new DefaultTableModel(data, columnNames);
     return model;
}
	public DefaultTableModel afficherStock(List<AlimentStockes> stock) {
		Object[][] data = new Object[stock.size()][4];
		for (int i = 0; i < stock.size(); i++) {
		    AlimentStockes alimentStocke = stock.get(i);
		    data[i][0] = alimentStocke.getAliment().getNom();
		    data[i][1] = alimentStocke.getDatePeremption();
		    data[i][2] = alimentStocke.getQuantite();
		    data[i][3] = alimentStocke.getAliment().getTypeAliment();
		}
		String[] columnNames = {"Aliment", "Date de Péremption", "Quantité", "Type"};
		DefaultTableModel model = new DefaultTableModel(data, columnNames);
		return model;
	}
	
	public DefaultTableModel afficherStockFiltre(int duree) {
		return afficherStock(Main.stock.filtrerDate(duree));
		
	}
	public DefaultTableModel afficherStockFiltre(TypeAliment typeAliment) {
		return afficherStock(Main.stock.filtrerType(typeAliment));
		
	}
	
	public DefaultTableModel afficherRecette(LivreRecettes livreRecette) {
		
		 
	     Object[][] data = new Object[livreRecette.getRecettes().size()][2];
	     int i=0;
	     for (Recette recette : livreRecette.getRecettes()) {
	    	 
	         data[i][0] = recette.getNom();
	         data[i][1] = recette.getDuree();
	        i++;
	     }
	     String[] columnNames = {"Recette", "Durée"};
	     DefaultTableModel model = new DefaultTableModel(data, columnNames);
	     return model;
	}
	public DefaultTableModel afficherRecetteFiltrerDuree(CritereDureeRecette cdr) {
		
		return afficherRecette(Main.livreRecette.FiltrerParDuree(cdr));
	}
	public DefaultTableModel afficherRecetteFiltrerAliment(String nom) {
		Aliment alimentFitre = Stock.getAlimentByName(Main.ensembleAliment.getListAliments(), nom);
		return afficherRecette(Main.livreRecette.FiltrerParAliment(alimentFitre));
	}

	    private DefaultTableModel afficherIngredient(Set<Ingredient> listIngredients) {
		// TODO Auto-generated method stub
		System.out.println("aaa");

	
		Object[][] data = new Object[listIngredients.size()][2];

	    int i=0;
	    for (Ingredient ingredient : listIngredients) {
	    	
	    	 
	         data[i][0] = ingredient.getAliment().getNom();
	         System.out.println(data[i][0]);
	         data[i][1] = ingredient.getQuantite();
	        i++;
	     }
	    String[] columnNames = {"Nom", "Quantite"};
	    DefaultTableModel model = new DefaultTableModel(data, columnNames);
	    return model;
	}
	    
		public 	DefaultTableModel afficherIngredientRecette(String nom ) {
			
			Recette recetteFiche = Main.livreRecette.getRecetteByName(nom);
			return afficherIngredient(recetteFiche.getListIngredients());
		}
	
	public String[] afficherFicheRecette(String nom ) {
		
		Recette recetteFiche = Main.livreRecette.getRecetteByName(nom);		
		String[] infoRecette = new String[3];
		infoRecette[0] = recetteFiche.getNom();
		infoRecette[1]= String.valueOf(recetteFiche.getDuree());	
		infoRecette[2] = null;
		
		return infoRecette;
	}

	public DefaultTableModel afficherListeCourse() {
		return afficherIngredient(Main.listeCourse.getIngredients());
	}

	public void ModifierListeFichier() {
		Main.gestionnaireFichier.ecrireIngredientsDansFichier(Main.nomFichier,Main.listeCourse.getIngredients());
		
	}

	public void ajouterListe(String nom, float quantite) {
		Aliment alimentAjout = Main.ensembleAliment.getAlimentByName(nom);
		Ingredient ingredientAjout = new Ingredient(alimentAjout,quantite);
		Main.listeCourse.ajouterIngredient(ingredientAjout);
		
	}	
	public void ajouterRecette(String nom) {
		Recette recetteAjout = Main.livreRecette.getRecetteByName(nom);
		Main.listeCourse.ajouterRecette(recetteAjout);
		
	}
	public Aliment creerAliment(String _nom, UnitedeMesure _udm, MoyendeConservation _mdc, TypeAliment _ta){
		return new Aliment(_nom, _udm, _mdc, _ta) ;
	}	
	public String[] popUpAliment(JFrame _frame, String _nom){
		String[] infoAliment = new String[3];
		JOptionPane.showMessageDialog(_frame, "L'aliment n'existe pas dans le stock \n Remplissez les informations suivantes");
		try{
		infoAliment[2] = JOptionPane.showInputDialog(this, "Rentrez le type d'aliments parmi les possibilités suivantes : \n ( respectez bien l'orthographe et les majuscules ) \n Fruits_Legumes, Viande_Poisson, ProduitsLaitiers, \n Céreales, Surgeles, Boissons, Snacks");
		infoAliment[1] = JOptionPane.showInputDialog(this, "Rentrez le moyen de conservation parmi les possibilités suivantes : \n ( respectez bien l'orthographe et les majuscules ) \n Vrac, Bouteille, Conserve, Sachet ");
		infoAliment[0] = JOptionPane.showInputDialog(this, "Rentrez l'unité de mesure parmi les possibilités suivantes : \n ( respectez bien l'orthographe et les majuscules ) \n Gramme, Unite, Litre ");
		}
		catch (IllegalArgumentException e){
			JOptionPane.showMessageDialog(_frame, "Vous vous êtes trompez en remplissant le formulaire");
			popUpAliment(_frame, _nom);
		}
		return infoAliment;
	}
}
        

        

