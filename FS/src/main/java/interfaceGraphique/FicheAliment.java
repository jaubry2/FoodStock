/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaceGraphique ;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author julesa
 */
public class FicheAliment extends javax.swing.JFrame {
    /**
     * Nom de l'aliment recherche
     */
    public static String nomAliment;
    /**
     * Quantite de l'aliment recherche
     */
    public static String qteAliment;
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
    /**
     * Bouton dans le menu de navigation qui redirige vers la page Recette 
     */
    private javax.swing.JButton recetteButton;
    /**
     * Bouton dans le menu de navigation qui redirige vers la page Liste 
     */
    private javax.swing.JButton listButton;
    /**
     * Bouton dans le menu de navigation qui redirige vers la page Stock 
     */
    private javax.swing.JButton stockButton;
    /**
     * Bouton d'actualisation pour la page
     */
    private javax.swing.JButton searchButton;
    /**
     * Bouton qui ouvre la page de modification de quantie d'un aliment
     */
    private javax.swing.JButton modifierAlimButton;
    /**
     * JTextField ou l'on rentre le nom de l'aiment que l'on voir
     */
    private javax.swing.JTextField alimentChoisi;
    /**
     * Text du menu dans le menu de navigation
     */
    private javax.swing.JLabel menuText;
    /**
     * Nom de l'aliment que l'on affiche
     */
    private javax.swing.JLabel alimentName;
    /**
     * Date de peremption de l'aliment que l'on affiche
     */
    private javax.swing.JLabel DDP;
    /**
     * Moyen de stockage de l'aliment que l'on affiche
     */
    private javax.swing.JLabel MDS;
    /**
     * Quantite de l'aliment que l'on affiche
     */
    private javax.swing.JLabel Qte;
    /**
     * Type  de l'aliment que l'on affiche
     */
    private javax.swing.JLabel TA;
    /**
     * Text nom de l'aliment
     */
    private javax.swing.JLabel nomAlimentText;
    /**
     * Text date de peremption de l'aliment
     */
    private javax.swing.JLabel dateDePeremptionText;
    /**
     * Text date de peremption de l'aliment
     */
    private javax.swing.JLabel typeAlimentText;
    /**
     * Text moyen de stockage de l'aliment
     */
    private javax.swing.JLabel moyenDeStockageText;
    /**git
     * Text quantite de l'aliment
     */
    private javax.swing.JLabel quantiteText;
    /**
     * Text en haut de la page
     */
    private javax.swing.JLabel ficheAlimentText;
    /**
     * text au dessus de la table des recettes
     */
    private javax.swing.JLabel recetteAssocieText;
    /**
     * Panel du menu de navigation a gauche
     */
    private javax.swing.JPanel pageMenu;
    /**
     * Page Fiche aliment a droite
     */
    private javax.swing.JPanel pageFicheAliment;
    /**
     * 
     */
    private javax.swing.JPanel jPanel2;
    /**
     * ScrollPane de la table des recettes
     */
    private javax.swing.JScrollPane jScrollPane1;
    /**
     * Table des recette associé a l'aliment
     */
    private javax.swing.JTable TableRecette;

    /**
     * Cree une nouvelle page FicheAliment
     * @param nom Nom de l'aliment
     */
    public FicheAliment(String _nom, String _qte, String  _typeAliment, String _moyenDeStockage, String _dateDePeremption) {
        this.nomAliment = _nom;
        this.moyenDeStockageAliment = _moyenDeStockage;
        this.qteAliment = _qte;
        this.typeAliment = _typeAliment;
        this.dateDePeremptionAliment = _dateDePeremption;
        initComponents();
        this.addWindowListener(new FermetureFenetre());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        pageMenu = new javax.swing.JPanel();
        menuText = new javax.swing.JLabel();
        stockButton = new javax.swing.JButton();
        recetteButton = new javax.swing.JButton();
        listButton = new javax.swing.JButton();
        pageFicheAliment = new javax.swing.JPanel();
        nomAlimentText = new javax.swing.JLabel();
        alimentChoisi = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        ficheAlimentText = new javax.swing.JLabel();
        dateDePeremptionText = new javax.swing.JLabel();
        typeAlimentText = new javax.swing.JLabel();
        moyenDeStockageText = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableRecette = new javax.swing.JTable();
        recetteAssocieText = new javax.swing.JLabel();
        alimentName = new javax.swing.JLabel();
        Qte = new javax.swing.JLabel();
        MDS = new javax.swing.JLabel();
        TA = new javax.swing.JLabel();
        quantiteText = new javax.swing.JLabel();
        DDP = new javax.swing.JLabel();
        modifierAlimButton = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);  
        setMaximumSize(new java.awt.Dimension(1020, 768));
        setMinimumSize(new java.awt.Dimension(1020, 768));

        pageMenu.setBackground(new java.awt.Color(153, 204, 255));
        pageMenu.setForeground(new java.awt.Color(51, 204, 255));

        menuText.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        menuText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuText.setText("MENU");
        menuText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuTextMouseClicked(evt);
            }
        });

        stockButton.setBackground(new java.awt.Color(153, 204, 255));
        stockButton.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        stockButton.setText("Stock");

        stockButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockButtonActionPerformed(evt);
            }
        });

        recetteButton.setBackground(new java.awt.Color(153, 204, 255));
        recetteButton.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        recetteButton.setText("Recette");

        recetteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recetteButtonActionPerformed(evt);
            }
        });

        listButton.setBackground(new java.awt.Color(153, 204, 255));
        listButton.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        listButton.setText("Liste");
        listButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pageMenuLayout = new javax.swing.GroupLayout(pageMenu);
        pageMenu.setLayout(pageMenuLayout);
        pageMenuLayout.setHorizontalGroup(
            pageMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pageMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pageMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(menuText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(listButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(recetteButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                    .addComponent(stockButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pageMenuLayout.setVerticalGroup(
            pageMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pageMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menuText)
                .addGap(18, 18, 18)
                .addComponent(stockButton)
                .addGap(18, 18, 18)
                .addComponent(recetteButton)
                .addGap(18, 18, 18)
                .addComponent(listButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pageFicheAliment.setBackground(new java.awt.Color(255, 204, 204));

        nomAlimentText.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        nomAlimentText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nomAlimentText.setText("Nom Aliment :");

        alimentChoisi.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        searchButton.setText("Actualiser");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        ficheAlimentText.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); 
        ficheAlimentText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ficheAlimentText.setText("Fiche Aliment");

        dateDePeremptionText.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); 
        dateDePeremptionText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dateDePeremptionText.setText("Date de Péremption :");

        typeAlimentText.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); 
        typeAlimentText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        typeAlimentText.setText("Type d'Aliment :");

        moyenDeStockageText.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); 
        moyenDeStockageText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        moyenDeStockageText.setText("Moyen de Stockage :");

        quantiteText.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); 
        quantiteText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quantiteText.setText("Quantite :");

        TableRecette.setModel(Main.controller.afficherRecetteLieAliment(nomAliment));
            
        jScrollPane1.setViewportView(TableRecette);

        recetteAssocieText.setText("Recettes Associés");

        alimentName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        alimentName.setText(nomAliment);

        Qte.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Qte.setText(qteAliment);

        MDS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MDS.setText(moyenDeStockageAliment);

        TA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TA.setText(typeAliment);

        DDP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DDP.setText(dateDePeremptionAliment);

        modifierAlimButton.setText("Supprimer Quantite");
        modifierAlimButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifierAlimButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pageFicheAlimentLayout = new javax.swing.GroupLayout(pageFicheAliment);
        pageFicheAliment.setLayout(pageFicheAlimentLayout);
        pageFicheAlimentLayout.setHorizontalGroup(
            pageFicheAlimentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pageFicheAlimentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pageFicheAlimentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ficheAlimentText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pageFicheAlimentLayout.createSequentialGroup()
                        .addGroup(pageFicheAlimentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pageFicheAlimentLayout.createSequentialGroup()
                                .addComponent(moyenDeStockageText)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(MDS, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pageFicheAlimentLayout.createSequentialGroup()
                                .addComponent(typeAlimentText)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TA, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pageFicheAlimentLayout.createSequentialGroup()
                                .addComponent(nomAlimentText)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(alimentName, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pageFicheAlimentLayout.createSequentialGroup()
                                .addComponent(dateDePeremptionText)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 179, Short.MAX_VALUE)
                                .addComponent(DDP, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pageFicheAlimentLayout.createSequentialGroup()
                                .addComponent(quantiteText)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Qte, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(352, 352, 352))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pageFicheAlimentLayout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(recetteAssocieText)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pageFicheAlimentLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(modifierAlimButton)
                .addGap(33, 33, 33))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pageFicheAlimentLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(alimentChoisi, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(searchButton)
                .addGap(240, 240, 240))
        );
        pageFicheAlimentLayout.setVerticalGroup(
            pageFicheAlimentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pageFicheAlimentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ficheAlimentText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pageFicheAlimentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pageFicheAlimentLayout.createSequentialGroup()
                        .addGroup(pageFicheAlimentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(alimentChoisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchButton))
                        .addGap(51, 51, 51)
                        .addGroup(pageFicheAlimentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nomAlimentText)
                            .addComponent(alimentName))
                        .addGap(18, 18, 18)
                        .addGroup(pageFicheAlimentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Qte)
                            .addComponent(quantiteText))
                        .addGap(18, 18, 18)
                        .addGroup(pageFicheAlimentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(typeAlimentText)
                            .addComponent(TA))
                        .addGap(18, 18, 18)
                        .addGroup(pageFicheAlimentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(moyenDeStockageText)
                            .addComponent(MDS))
                        .addGap(18, 18, 18)
                        .addGroup(pageFicheAlimentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DDP)
                            .addComponent(dateDePeremptionText))
                        .addGap(147, 147, 147)
                        .addComponent(recetteAssocieText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pageFicheAlimentLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(modifierAlimButton)))
                .addGap(82, 82, 82))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pageMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pageFicheAliment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pageMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pageFicheAliment, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuTextMouseClicked(java.awt.event.MouseEvent evt) {
    	Accueil newPage = new Accueil();
		newPage.setVisible(true);
        this.dispose();
    }


    private void stockButtonActionPerformed(java.awt.event.ActionEvent evt) {
    	MenuStock newPage = new MenuStock();
		newPage.setVisible(true);
        this.dispose();
    }


    private void recetteButtonActionPerformed(java.awt.event.ActionEvent evt) {
    	MenuRecette newPage = new MenuRecette();
		newPage.setVisible(true);
        this.dispose();
    }

    private void listButtonActionPerformed(java.awt.event.ActionEvent evt) {
    	MenuListe newPage = new MenuListe();
		newPage.setVisible(true);
        this.dispose();
    }

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {
        String ac;
        
        ac = alimentChoisi.getText();
        
        //je savais pas si je le passais dans le controlleur;
        if (ac.equals("")){
            String erreur = "Le nom d'aliment n'existe pas";
            String conseil = "Veuillez changer le nom d'aliments";
            FenetreErreur fe = new FenetreErreur(erreur, conseil);
            fe.setVisible(true);
        }
        
       String[] infoAliment =Main.controller.AfficherFicheAliment(ac);
       DefaultTableModel recette =Main.controller.afficherRecetteLieAliment(ac);

       

        
        
        // Assigner les differentes valeurs au texte
        alimentName.setText(infoAliment[0]);
        Qte.setText(infoAliment[1]);
        TA.setText(infoAliment[2]);
        MDS.setText(infoAliment[3]);
        DDP.setText(infoAliment[4]);
        TableRecette.setModel(recette);
    }

    private void modifierAlimButtonActionPerformed(java.awt.event.ActionEvent evt) {
    	ModifierUnAliment newPage = new ModifierUnAliment();
		newPage.setVisible(true);
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
            java.util.logging.Logger.getLogger(FicheAliment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FicheAliment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FicheAliment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FicheAliment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FicheAliment(nomAliment, qteAliment, typeAliment, moyenDeStockageAliment, dateDePeremptionAliment).setVisible(true);
            }
        });
    }
}
