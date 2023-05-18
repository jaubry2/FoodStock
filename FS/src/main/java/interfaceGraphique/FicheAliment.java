/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaceGraphique ;

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

    private javax.swing.JLabel NomAlimentText;
    private javax.swing.JLabel dateDePeremptionText;
    private javax.swing.JLabel TypeAlimentText;
    private javax.swing.JLabel MDSText;
    private javax.swing.JLabel QteText;

    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;

    private javax.swing.JPanel Menu3;
    private javax.swing.JPanel pageFicheAliment;
    private javax.swing.JPanel jPanel2;

    private javax.swing.JScrollPane jScrollPane1;

    private javax.swing.JTable TableRecette;

    /**
     * Cree une nouvelle page FicheAliment
     * @param nom Nom de l'aliment
     */
    public FicheAliment(String nom) {
        this.nomAliment = nom;
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
        Menu3 = new javax.swing.JPanel();
        menuText = new javax.swing.JLabel();
        stockButton = new javax.swing.JButton();
        recetteButton = new javax.swing.JButton();
        listButton = new javax.swing.JButton();
        pageFicheAliment = new javax.swing.JPanel();
        NomAlimentText = new javax.swing.JLabel();
        alimentChoisi = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        dateDePeremptionText = new javax.swing.JLabel();
        TypeAlimentText = new javax.swing.JLabel();
        MDSText = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableRecette = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        alimentName = new javax.swing.JLabel();
        Qte = new javax.swing.JLabel();
        MDS = new javax.swing.JLabel();
        TA = new javax.swing.JLabel();
        QteText = new javax.swing.JLabel();
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
        setLocation(new java.awt.Point(1020, 768));
        setMaximumSize(new java.awt.Dimension(1020, 768));
        setMinimumSize(new java.awt.Dimension(1020, 768));

        Menu3.setBackground(new java.awt.Color(153, 204, 255));
        Menu3.setForeground(new java.awt.Color(51, 204, 255));

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

        javax.swing.GroupLayout Menu3Layout = new javax.swing.GroupLayout(Menu3);
        Menu3.setLayout(Menu3Layout);
        Menu3Layout.setHorizontalGroup(
            Menu3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Menu3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Menu3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(menuText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(listButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(recetteButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                    .addComponent(stockButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        Menu3Layout.setVerticalGroup(
            Menu3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Menu3Layout.createSequentialGroup()
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

        NomAlimentText.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        NomAlimentText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NomAlimentText.setText("Nom Aliment :");

        alimentChoisi.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        searchButton.setText("Actualiser");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); 
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Fiche Aliment");

        dateDePeremptionText.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); 
        dateDePeremptionText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dateDePeremptionText.setText("Date de Péremption :");

        TypeAlimentText.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); 
        TypeAlimentText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TypeAlimentText.setText("Type d'Aliment :");

        MDSText.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); 
        MDSText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MDSText.setText("Moyen de Stockage :");

        QteText.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); 
        QteText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        QteText.setText("Quantite :");

        TableRecette.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TableRecette);

        jLabel2.setText("Recettes Associés");

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
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pageFicheAlimentLayout.createSequentialGroup()
                        .addGroup(pageFicheAlimentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pageFicheAlimentLayout.createSequentialGroup()
                                .addComponent(MDSText)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(MDS, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pageFicheAlimentLayout.createSequentialGroup()
                                .addComponent(TypeAlimentText)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TA, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pageFicheAlimentLayout.createSequentialGroup()
                                .addComponent(NomAlimentText)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(alimentName, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pageFicheAlimentLayout.createSequentialGroup()
                                .addComponent(dateDePeremptionText)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 179, Short.MAX_VALUE)
                                .addComponent(DDP, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pageFicheAlimentLayout.createSequentialGroup()
                                .addComponent(QteText)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Qte, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(352, 352, 352))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pageFicheAlimentLayout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(jLabel2)
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
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pageFicheAlimentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pageFicheAlimentLayout.createSequentialGroup()
                        .addGroup(pageFicheAlimentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(alimentChoisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchButton))
                        .addGap(51, 51, 51)
                        .addGroup(pageFicheAlimentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NomAlimentText)
                            .addComponent(alimentName))
                        .addGap(18, 18, 18)
                        .addGroup(pageFicheAlimentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Qte)
                            .addComponent(QteText))
                        .addGap(18, 18, 18)
                        .addGroup(pageFicheAlimentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TypeAlimentText)
                            .addComponent(TA))
                        .addGap(18, 18, 18)
                        .addGroup(pageFicheAlimentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MDSText)
                            .addComponent(MDS))
                        .addGap(18, 18, 18)
                        .addGroup(pageFicheAlimentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DDP)
                            .addComponent(dateDePeremptionText))
                        .addGap(147, 147, 147)
                        .addComponent(jLabel2)
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
                .addComponent(Menu3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pageFicheAliment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Menu3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        
        if (ac.equals("")){
            String erreur = "Le nom d'aliment n'existe pas";
            String conseil = "Veuillez changer le nom d'aliments";
            FenetreErreur fe = new FenetreErreur(erreur, conseil);
            fe.setVisible(true);
        }
        
        // On verifie si le nom de l'aliment est dans la base de donnée
     
        
        // Recuperer les valeurs dans la base de donnee
        String qte = "";
        String ta = "";
        String mds = "";
        String ddp = "";
        
        // Assigner les differentes valeurs au texte
        NomAlimentText.setText(ac);
        Qte.setText(qte);
        TA.setText(ta);
        MDS.setText(mds);
        DDP.setText(ddp);
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
                new FicheAliment(nomAliment).setVisible(true);
            }
        });
    }
}
