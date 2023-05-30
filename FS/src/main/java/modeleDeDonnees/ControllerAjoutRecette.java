package modeleDeDonnees;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.Set;

import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

import interfaceGraphique.AjouterRecette;
import interfaceGraphique.Main;
import interfaceGraphique.MenuListe;

/**
 * Contrôleur pour l'ajout d'une recette.
 */
public class ControllerAjoutRecette implements Observer {

    private LivreRecettes model;
    private AjouterRecette vue;

    /**
     * Constructeur du contrôleur pour l'ajout d'une recette.
     *
     * @param model le modèle de livre de recettes
     * @param vue   la vue pour l'ajout de recette
     */
    public ControllerAjoutRecette(LivreRecettes model, AjouterRecette vue) {
        this.model = model;
        this.vue = vue;

        model.addObserver(this);

        vue.getAddLivreButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
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
                String nomIngredient = vue.getNomIngredientTextField().getText();
                String qteIngredient = vue.getQteTextField().getText();
                String[] infoAliment = new String[3];
                int result;

                if (Main.ensembleAliment.isAliment(nomIngredient)){
                    /* Ajout à la Table */
                    String[] ligne = new String[] {nomIngredient, qteIngredient};
                    vue.getdTMAliment().addRow(ligne);
                } else {
                    infoAliment = Main.controller.popUpAliment(vue, nomIngredient);
                    result = JOptionPane.showConfirmDialog(vue, "Vous voulez ajoutez au stock : " + nomIngredient + " / " + infoAliment[0] + " / " + infoAliment[1] + " / " + infoAliment[2]);

                    if (result == JOptionPane.YES_OPTION & !infoAliment[0].equals("") & !infoAliment[1].equals("") & !infoAliment[2].equals("")) {
                        Aliment aliment = Main.controller.creerAliment(nomIngredient, UnitedeMesure.valueOf(infoAliment[0]), MoyendeConservation.valueOf(infoAliment[1]), TypeAliment.valueOf(infoAliment[2]));
                        Main.ensembleAliment.ajouterAliment(aliment);
                        String[] ligne = new String[] {nomIngredient, qteIngredient};
                        vue.getdTMAliment().addRow(ligne);
                        JOptionPane.showMessageDialog(vue, "L'aliment a été ajouté à l'ensemble d'aliment");
                    } else if (result == JOptionPane.NO_OPTION) {
                        JOptionPane.showMessageDialog(vue, "L'aliment n'a pas été ajouté à l'ensemble d'aliment");
                    }
                }

                vue.getTableIngredientsRecette().setModel(vue.getdTMAliment());
            }
        });

        vue.getBoutonSupprimer().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vue.getdTMAliment().removeRow(vue.getTableIngredientsRecette().getSelectedRow());
            }
        });

    }

    /**
     * Méthode appelée lors de la mise à jour du modèle.
     */
    public void update() {
        Main.controller.changerPage("Menu Recette", null, null, null);
    }
}
