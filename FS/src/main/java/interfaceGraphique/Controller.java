/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaceGraphique;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import javax.swing.table.DefaultTableModel;

import modeleDeDonnees.AlimentStockes;
import modeleDeDonnees.Aliments;
import modeleDeDonnees.AlimentsNonPresentException;

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
        
        if (_page.equals("accueil")) {
            newPage = new Accueil();
           OuvrirPage(newPage);
        } else if (_page.equals("ajouterAliment")) {
            newPage = new AjouterAliment();
           OuvrirPage(newPage);
        } else if (_page.equals("fenetreErreur")) {
            newPage = new FenetreErreur(_erreur, _message);
           OuvrirPage(newPage);
        } else if (_page.equals("ficheAliment")) {
            newPage = new FicheAliment(_nomAliment);
            OuvrirPage(newPage);
        } else if (_page.equals("menuListe")) {
            newPage = new MenuListe();
           OuvrirPage(newPage);
        } else if (_page.equals("menuRecette")) {
            newPage = new MenuRecette();
            OuvrirPage(newPage);
        } else if (_page.equals("menuStock")) {
            newPage = new MenuStock();
            OuvrirPage(newPage);
        } else if (_page.equals("modifierUnAliment")) {
            newPage = new ModifierUnAliment();
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

		    	Aliments aliment = Main.stocks.getAlimentByName(Main.listAliments,nom);
		    	
		    	AlimentStockes alimentRajout= new AlimentStockes(aliment,quantite,datePeremption);
		    	    	listRajout.add(alimentRajout);
	    	} catch(AlimentsNonPresentException e) {
	    		e.getMessage();
	    	}

    	}
        Main.stocks.ajouterListe("principal",listRajout );
        Main.stocks.afficherContenuStock();
        
    };
    }
        

        

