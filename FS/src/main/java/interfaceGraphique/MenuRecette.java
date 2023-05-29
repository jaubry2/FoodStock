/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaceGraphique;

import javax.swing.JButton;
import javax.swing.UnsupportedLookAndFeelException;

import modeleDeDonnees.CritereDureeRecette;

/**
 *
 * @author julesa
 */
public class MenuRecette extends javax.swing.JFrame {
    /**
     * Creates new form MenuReceqteAlimenttte
     */
	
	public static String nomRecette;
    /**
     * Quantite de l'aliment recherche
     */
    public static String quantite;
    /**
     * Type de l'aliment recherche
     */
    public static String typeAliment;
    /**
     * Moyen de stockage de l'aliment recherche
     */
    public static String moyenDeStockageAliment;
    /**
     * Date de peremption de l'aliment recherche
     */
    public static String dateDePeremptionAliment;
	private JButton ajoutRecetteButton;
    /**
     * Bouton dans le menu de navigation qui redirige vers la page Recette 
     */
    public MenuRecette() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        Menu3 = new javax.swing.JPanel();
        titreMenu3 = new javax.swing.JLabel();
        StockButton3 = new javax.swing.JButton();
        RecetteButton3 = new javax.swing.JButton();
        ListButton3 = new javax.swing.JButton();
        pageMenuRecettes = new javax.swing.JPanel();
        titreMenuRecettes = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableRecettes = new javax.swing.JTable();
        chercherIngredientRecettes = new javax.swing.JPanel();
        titreChercherIngredientRecettes = new javax.swing.JLabel();
        alimentChoisi = new javax.swing.JTextField();
        chercherIngredientRecettesButton = new javax.swing.JButton();
        chercherNomRecette = new javax.swing.JPanel();
        titreChercherNomRecettes = new javax.swing.JLabel();
        recetteChoisi = new javax.swing.JTextField();
        chercherNomRecettesButton = new javax.swing.JButton();
        Vitesses = new javax.swing.JPanel();
        rapideButton = new javax.swing.JButton();
        mediumButton = new javax.swing.JButton();
        longueButton = new javax.swing.JButton();
        favButton = new javax.swing.JButton();
        ajoutRecetteButton = new javax.swing.JButton();

        

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1020, 768));
        setMinimumSize(new java.awt.Dimension(1020, 768));
        setPreferredSize(new java.awt.Dimension(1020, 768));
        setSize(new java.awt.Dimension(1020, 768));
        setLocationRelativeTo(null);  
        setResizable(false);

        Menu3.setBackground(new java.awt.Color(153, 204, 255));
        Menu3.setForeground(new java.awt.Color(51, 204, 255));

        titreMenu3.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        titreMenu3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titreMenu3.setText("MENU");
        titreMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                titreMenu3MouseClicked(evt);
            }
        });

        StockButton3.setBackground(new java.awt.Color(153, 204, 255));
        StockButton3.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        StockButton3.setText("Stock");
        StockButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StockButton3ActionPerformed(evt);
            }
        });

        RecetteButton3.setBackground(new java.awt.Color(153, 204, 255));
        RecetteButton3.setFont(new java.awt.Font("Helvetica Neue", 0, 14));
        RecetteButton3.setText("Recette");
        RecetteButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecetteButton3ActionPerformed(evt);
            }
        });

        ListButton3.setBackground(new java.awt.Color(153, 204, 255));
        ListButton3.setFont(new java.awt.Font("Helvetica Neue", 0, 14));
        ListButton3.setText("Liste");
        ListButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Menu3Layout = new javax.swing.GroupLayout(Menu3);
        Menu3.setLayout(Menu3Layout);
        Menu3Layout.setHorizontalGroup(
            Menu3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Menu3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Menu3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(titreMenu3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ListButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RecetteButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                    .addComponent(StockButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        Menu3Layout.setVerticalGroup(
            Menu3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Menu3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titreMenu3)
                .addGap(18, 18, 18)
                .addComponent(StockButton3)
                .addGap(18, 18, 18)
                .addComponent(RecetteButton3)
                .addGap(18, 18, 18)
                .addComponent(ListButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pageMenuRecettes.setBackground(new java.awt.Color(255, 204, 204));

        titreMenuRecettes.setFont(new java.awt.Font("Liberation Sans", 0, 36)); // NOI18N
        titreMenuRecettes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titreMenuRecettes.setText("Recettes");

        tableRecettes.setModel(Main.controller.afficherRecette(Main.livreRecette));
        jScrollPane1.setViewportView(tableRecettes);

        chercherIngredientRecettes.setBackground(new java.awt.Color(153, 204, 255));

        titreChercherIngredientRecettes.setText("ingrédients :");

        chercherIngredientRecettesButton.setText("Rechercher");
        chercherIngredientRecettesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chercherIngredientRecettesButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout chercherIngredientRecettesLayout = new javax.swing.GroupLayout(chercherIngredientRecettes);
        chercherIngredientRecettes.setLayout(chercherIngredientRecettesLayout);
        chercherIngredientRecettesLayout.setHorizontalGroup(
            chercherIngredientRecettesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chercherIngredientRecettesLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(titreChercherIngredientRecettes)
                .addGap(18, 18, 18)
                .addComponent(alimentChoisi, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(chercherIngredientRecettesButton)
                .addContainerGap())
        );
        chercherIngredientRecettesLayout.setVerticalGroup(
            chercherIngredientRecettesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chercherIngredientRecettesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(chercherIngredientRecettesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alimentChoisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chercherIngredientRecettesButton)
                    .addComponent(titreChercherIngredientRecettes))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        chercherNomRecette.setBackground(new java.awt.Color(153, 204, 255));

        titreChercherNomRecettes.setText("nom :");

        chercherNomRecettesButton.setText("Rechercher");
        chercherNomRecettesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chercherNomRecettesButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout chercherNomRecetteLayout = new javax.swing.GroupLayout(chercherNomRecette);
        chercherNomRecette.setLayout(chercherNomRecetteLayout);
        chercherNomRecetteLayout.setHorizontalGroup(
            chercherNomRecetteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chercherNomRecetteLayout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(titreChercherNomRecettes)
                .addGap(33, 33, 33)
                .addComponent(recetteChoisi, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(chercherNomRecettesButton)
                .addContainerGap())
        );
        chercherNomRecetteLayout.setVerticalGroup(
            chercherNomRecetteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chercherNomRecetteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(chercherNomRecetteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(recetteChoisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chercherNomRecettesButton)
                    .addComponent(titreChercherNomRecettes))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Vitesses.setBackground(new java.awt.Color(153, 204, 255));

        rapideButton.setText("Rapide");
        rapideButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rapideButtonActionPerformed(evt);
            }
        });

        mediumButton.setText("Medium");
        mediumButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mediumButtonActionPerformed(evt);
            }
        });

        longueButton.setText("Longue");
        longueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                longueButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout VitessesLayout = new javax.swing.GroupLayout(Vitesses);
        Vitesses.setLayout(VitessesLayout);
        VitessesLayout.setHorizontalGroup(
            VitessesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VitessesLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(rapideButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 169, Short.MAX_VALUE)
                .addComponent(mediumButton)
                .addGap(178, 178, 178)
                .addComponent(longueButton)
                .addGap(25, 25, 25))
        );
        VitessesLayout.setVerticalGroup(
            VitessesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VitessesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(VitessesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rapideButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mediumButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(longueButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ajoutRecetteButton.setText("Ajouter une recette");
        ajoutRecetteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajoutRecetteButtonActionPerformed(evt);
            }
        });

        favButton.setText("favorites");

        javax.swing.GroupLayout pageMenuRecettesLayout = new javax.swing.GroupLayout(pageMenuRecettes);
        pageMenuRecettes.setLayout(pageMenuRecettesLayout);
        pageMenuRecettesLayout.setHorizontalGroup(
            pageMenuRecettesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pageMenuRecettesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pageMenuRecettesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pageMenuRecettesLayout.createSequentialGroup()
                        .addComponent(titreMenuRecettes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pageMenuRecettesLayout.createSequentialGroup()
                        .addGap(0, 153, Short.MAX_VALUE)
                        .addGroup(pageMenuRecettesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pageMenuRecettesLayout.createSequentialGroup()
                                .addComponent(chercherIngredientRecettes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pageMenuRecettesLayout.createSequentialGroup()
                                .addComponent(chercherNomRecette, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(242, 242, 242))))))
            .addGroup(pageMenuRecettesLayout.createSequentialGroup()
                .addGroup(pageMenuRecettesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pageMenuRecettesLayout.createSequentialGroup()
                        .addGap(371, 371, 371)
                        .addComponent(favButton))
                    .addGroup(pageMenuRecettesLayout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addGroup(pageMenuRecettesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Vitesses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pageMenuRecettesLayout.createSequentialGroup()
                        .addGap(345, 345, 345)
                        .addComponent(ajoutRecetteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pageMenuRecettesLayout.setVerticalGroup(
            pageMenuRecettesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pageMenuRecettesLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(titreMenuRecettes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chercherNomRecette, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(chercherIngredientRecettes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(favButton)
                .addGap(30, 30, 30)
                .addComponent(Vitesses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(ajoutRecetteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(129, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(Menu3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pageMenuRecettes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Menu3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pageMenuRecettes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    private void titreMenu3MouseClicked(java.awt.event.MouseEvent evt) {
        Main.controller.changerPage("accueil", null, null, null);
        this.dispose();
    }

    private void StockButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        Main.controller.changerPage("menuStock", null, null, null);
        this.dispose();
    }


    private void RecetteButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        Main.controller.changerPage("menuRecette", null, null, null);
        this.dispose();
    }

    private void ListButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        Main.controller.changerPage("menuListe", null, null, null);
        this.dispose();
    }

    private void chercherIngredientRecettesButtonActionPerformed(java.awt.event.ActionEvent evt) {
    	
        System.out.println("chercher ingredient");
    	System.out.println(alimentChoisi.getText());

    	tableRecettes.setModel(Main.controller.afficherRecetteFiltrerAliment(alimentChoisi.getText()));
    	
    }
    private void mediumButtonActionPerformed(java.awt.event.ActionEvent evt) {
    	System.out.println("bouton moyen");
    	tableRecettes.setModel(Main.controller.afficherRecetteFiltrerDuree(CritereDureeRecette.MEDIUM));

    }

    private void longueButtonActionPerformed(java.awt.event.ActionEvent evt) {
    	System.out.println("bouton long");

    	tableRecettes.setModel(Main.controller.afficherRecetteFiltrerDuree(CritereDureeRecette.LONG));
    }
    
    private void ajoutRecetteButtonActionPerformed(java.awt.event.ActionEvent evt) {
    	System.out.println("bouton ajout recette");
        Main.controller.changerPage("AjouterRecette", null, null, null);
        this.dispose();

    }

    private void rapideButtonActionPerformed(java.awt.event.ActionEvent evt) {
    	System.out.println("bouton rapide");

    	tableRecettes.setModel(Main.controller.afficherRecetteFiltrerDuree(CritereDureeRecette.RAPIDE));
    }

    private void chercherNomRecettesButtonActionPerformed(java.awt.event.ActionEvent evt) {
    	
    	System.out.println(recetteChoisi.getText());

        String[] infoRecette = Main.controller.afficherFicheRecette(recetteChoisi.getText());
        FicheRecette mR = new FicheRecette(infoRecette[0], infoRecette[1], infoRecette[2]);                                  
        mR.setVisible(true);
        this.dispose();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuRecette.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuRecette.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuRecette.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            java.util.logging.Logger.getLogger(MenuRecette.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
 catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuRecette().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ListButton3;
    private javax.swing.JPanel Menu3;
    private javax.swing.JButton RecetteButton3;
    private javax.swing.JButton StockButton3;
    private javax.swing.JPanel Vitesses;
    private javax.swing.JTextField alimentChoisi;
    private javax.swing.JTextField recetteChoisi;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JPanel chercherIngredientRecettes;
    private javax.swing.JButton chercherIngredientRecettesButton;
    private javax.swing.JPanel chercherNomRecette;
    private javax.swing.JButton chercherNomRecettesButton;
    private javax.swing.JButton favButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton longueButton;
    private javax.swing.JButton mediumButton;
    private javax.swing.JPanel pageMenuRecettes;
    private javax.swing.JButton rapideButton;
    private javax.swing.JTable tableRecettes;
    private javax.swing.JLabel titreChercherIngredientRecettes;
    private javax.swing.JLabel titreChercherNomRecettes;
    private javax.swing.JLabel titreMenu3;
    private javax.swing.JLabel titreMenuRecettes;


    // End of variables declaration//GEN-END:variables
}
