package modeleDeDonnees;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Set;

import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

import interfaceGraphique.Main;
import interfaceGraphique.MenuListe;

public class ControllerAjoutRecette implements Observer{


	     ListeDeCourse model;

	     MenuListe vue;

	    public ControllerAjoutRecette(ListeDeCourse model, MenuListe vue) {
	    	System.out.println("controlleur");
	        this.model = model;
	        this.vue = vue;

	        model.addObserver(this);

	        vue.getAjoutAlimentListeButton().addActionListener(new ActionListener() { 
	            @Override
	            public void actionPerformed(ActionEvent e) {

	            	System.out.println("aliment boutton");
	            	System.out.println(vue.getChoixQuantiteeListe().getText());
	            	float quantite = Float.parseFloat(vue.getChoixQuantiteeListe().getText());
	            	Aliment aliment = Main.ensembleAliment.getAlimentByName(vue.getChoixAlimentListe().getText());
	                model.ajouterIngredient( new Ingredient(aliment,quantite));
	            }
	        });
	        
	        vue.getAjoutRecetteListeButton().addActionListener(new ActionListener() { 
	            @Override
	            public void actionPerformed(ActionEvent e) {
	            	System.out.println("button");
	        		Recette recetteAjout = Main.livreRecette.getRecetteByName(vue.getChoixRecetteListe().getText());
	                model.ajouterRecette(recetteAjout);
	            }
	        });
	        vue.getSuprAlimentListeButton().addActionListener(new ActionListener() { 
	            @Override
	            public void actionPerformed(ActionEvent e) {

	            	float quantite = Float.parseFloat(vue.getChoixQuantiteeListe().getText());
	            	Aliment aliment = Main.ensembleAliment.getAlimentByName(vue.getChoixAlimentListe().getText());
	                model.supprimerIngredient(new Ingredient(aliment, quantite));
	            }
	        });
	        
	    }

	    public void update() {
	    	System.out.println("update");
	    	Set<Ingredient> listIngredient = model.getIngredients();
	    	Object[][] data = new Object[listIngredient.size()][2];

		    int i=0;
		    for (Ingredient ingredient : listIngredient) {
		    	
		    	 System.out.println("update");
 
		    	System.out.println(ingredient.getAliment().getNom());
		         data[i][0] = ingredient.getAliment().getNom();
		         data[i][1] = ingredient.getQuantite();
		        i++;
		     }
		    String[] columnNames = {"Nom", "Quantite"};
		    vue.setTableListeModel(new DefaultTableModel(data, columnNames));
		     vue.getTableListeModel().fireTableDataChanged();
		     vue.getTableListe().setModel(new DefaultTableModel(data, columnNames));

	    }
		


}
