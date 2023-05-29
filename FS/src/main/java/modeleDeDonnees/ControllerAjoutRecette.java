package modeleDeDonnees;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.Set;

import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

import interfaceGraphique.AjouterRecette;
import interfaceGraphique.Main;
import interfaceGraphique.MenuListe;

public class ControllerAjoutRecette implements Observer {

    private LivreRecettes model;
    private AjouterRecette vue;

    public ControllerAjoutRecette(LivreRecettes model, AjouterRecette vue) {
        System.out.println("controlleur");
        this.model = model;
        this.vue = vue;

        model.addObserver(this);

        vue.getAddLivreButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("recette boutton");
                String nom = vue.getNomRecette().getText();
                int duree = Integer.parseInt(vue.getDureeRecette().getText());
                Set<Ingredient> ingredientsRecette = new HashSet<>();
                for (int ligne = 0; ligne < vue.getdTMAliment().getRowCount(); ligne++) {
                    String nomIngredient = (String) vue.getdTMAliment().getValueAt(ligne, 0);
                    Aliment aliment = Main.ensembleAliment.getAlimentByName(nomIngredient);
                    float quantite = Float.parseFloat((String) vue.getdTMAliment().getValueAt(ligne, 1));
                    Ingredient ingredient = new Ingredient(aliment, quantite);
                    ingredientsRecette.add(ingredient);
                }
                model.ajouterRecette(new Recette(nom, duree, ingredientsRecette));
            }
        });

        vue.getBoutonAjouter().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Ajoute une nouvelle ligne vide au modèle de table
            	System.out.println("aa");
                vue.getdTMAliment().addRow(new Object[]{"", ""});
            }
        });
    }

    public void update() {
        System.out.println("update");
        Main.controller.ChangerPage("Menu Recette", null, null, null);
    }
}
