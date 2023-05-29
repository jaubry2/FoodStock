package modeleDeDonnees;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Set;

import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

import interfaceGraphique.Main;
import interfaceGraphique.MenuListe;

public class ControllerListeCourse implements Observer{


	     ListeDeCourse model;

	     MenuListe vue;

	    public ControllerListeCourse(ListeDeCourse model, MenuListe vue) {
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
	            	String nomIngredient = vue.getChoixAlimentListe().getText();
	    	        String[] infoAliment = new String[3];
	    	        int result;

	    	        if (!Main.ensembleAliment.isAliment(nomIngredient)){
	    	            /* Ajout à la Table */
	    	  
	    	                infoAliment = Main.controller.popUpAliment(vue, nomIngredient);
	    	                result = JOptionPane.showConfirmDialog(vue, "Vous voulez ajoutez au stock : " + nomIngredient + " / " + infoAliment[0] + " / " + infoAliment[1] + " / " + infoAliment[2]);
	    	            
	    	            if (result == JOptionPane.YES_OPTION & !infoAliment[0].equals("") & !infoAliment[1].equals("") & !infoAliment[2].equals("")){
	    	                Aliment aliment = Main.controller.creerAliment(nomIngredient, UnitedeMesure.valueOf(infoAliment[0]), MoyendeConservation.valueOf(infoAliment[1]), TypeAliment.valueOf(infoAliment[2]));
	    	                Main.ensembleAliment.ajouterAliment(aliment);
	    	                JOptionPane.showMessageDialog(vue, "L'aliment a été ajouté à l'ensemble d'aliment");
	    	            } else if(result == JOptionPane.NO_OPTION) {
	    	                JOptionPane.showMessageDialog(vue, "L'aliment n'a pas été ajouté à l'ensemble d'aliment");
	    	            }
	    	        }
	            	Aliment alimentIngredient = Main.ensembleAliment.getAlimentByName(nomIngredient);
	            	model.ajouterIngredient( new Ingredient(alimentIngredient,quantite));
	            }
	        });
	        
	        vue.getAjoutRecetteListeButton().addActionListener(new ActionListener() { 
	            @Override
	            public void actionPerformed(ActionEvent e) {
	            	System.out.println("button");
	        		Recette recetteAjout = Main.livreRecette.getRecetteByName(vue.getChoixRecetteListe().getText());
	                model.comparerStock(recetteAjout,Main.stock);
	            }
	        });
	        vue.getSuprAlimentListeButton().addActionListener(new ActionListener() { 
	            @Override
	            public void actionPerformed(ActionEvent e) {

	            	float quantite = Float.parseFloat(vue.getChoixQuantiteeListe().getText());
	            	Aliment aliment = Main.ensembleAliment.getAlimentByName(vue.getChoixAlimentListe().getText());
	                model.ajouterIngredient(new Ingredient(aliment, -quantite));
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
