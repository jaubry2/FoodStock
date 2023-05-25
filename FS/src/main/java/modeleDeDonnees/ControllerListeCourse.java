package modeleDeDonnees;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Set;

import javax.swing.table.DefaultTableModel;

import interfaceGraphique.Main;
import interfaceGraphique.MenuListe;

public class ControllerListeCourse implements Observer{


	     ListeDeCourse model;

	     MenuListe vue;

	    public ControllerListeCourse(ListeDeCourse model, MenuListe vue) {
	        this.model = model;
	        this.vue = vue;

	        model.addObserver(this);

	        vue.getAjoutAlimentListeButton().addActionListener(new ActionListener() { 
	            @Override
	            public void actionPerformed(ActionEvent e) {
	            	System.out.println("button");

	               // model.ajouterIngredient(vue.getChoixAlimentListe().getText());
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
	        
	        
	    }

	    public void update() {
	    	ListeDeCourse listeDeCourse =model.comparerStock(Main.stock);
	    	Set<Ingredient> listIngredient = listeDeCourse.getIngredients();
	    	Object[][] data = new Object[listIngredient.size()][2];

		    int i=0;
		    for (Ingredient ingredient : listIngredient) {
		    	
		    	 
		         data[i][0] = ingredient.getAliment().getNom();
		         System.out.println(data[i][0]);
		         data[i][1] = ingredient.getQuantite();
		        i++;
		     }
		    String[] columnNames = {"Nom", "Quantite"};
		    DefaultTableModel tableModel = new DefaultTableModel(data, columnNames);
	        vue.getTableListe().setModel(tableModel);;
	    }
		


}
