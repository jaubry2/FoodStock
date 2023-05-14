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
    private javax.swing.JTextField AlimentChoisi;
    private javax.swing.JLabel AlimentName;
    private javax.swing.JLabel DDP;
    private javax.swing.JButton ListButton3;
    private javax.swing.JLabel MDS;
    private javax.swing.JPanel Menu3;
    private javax.swing.JLabel MenuText;
    private javax.swing.JLabel NomAlimentText;
    private javax.swing.JLabel DDPText;
    private javax.swing.JLabel TypeAlimentText;
    private javax.swing.JLabel MDSText;
    private javax.swing.JLabel QteText;
    private javax.swing.JLabel Qte;
    private javax.swing.JButton RecetteButton3;
    private javax.swing.JButton SearchButton;
    private javax.swing.JButton StockButton3;
    private javax.swing.JLabel TA;
    private javax.swing.JButton ModifierAlimButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel pageFicheAliment;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable TableRecette;
    /*
     * Nom de l'aliment sur la fiche
     */
	public static String nomAliment;
    /**
     * Creates new form FicheAliment
     * @param nom Nom de l'aliment
     */
    public FicheAliment(String nom) {
        this.nomAliment = nom;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    /*
     * Initialise tous les composants
     */
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        Menu3 = new javax.swing.JPanel();
        MenuText = new javax.swing.JLabel();
        StockButton3 = new javax.swing.JButton();
        RecetteButton3 = new javax.swing.JButton();
        ListButton3 = new javax.swing.JButton();
        pageFicheAliment = new javax.swing.JPanel();
        NomAlimentText = new javax.swing.JLabel();
        AlimentChoisi = new javax.swing.JTextField();
        SearchButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        DDPText = new javax.swing.JLabel();
        TypeAlimentText = new javax.swing.JLabel();
        MDSText = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableRecette = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        AlimentName = new javax.swing.JLabel();
        Qte = new javax.swing.JLabel();
        MDS = new javax.swing.JLabel();
        TA = new javax.swing.JLabel();
        QteText = new javax.swing.JLabel();
        DDP = new javax.swing.JLabel();
        ModifierAlimButton = new javax.swing.JButton();

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

        MenuText.setFont(new java.awt.Font("Helvetica Neue", 0, 18));
        MenuText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MenuText.setText("MENU");
        MenuText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuTextMouseClicked(evt);
            }
        });

        StockButton3.setBackground(new java.awt.Color(153, 204, 255));
        StockButton3.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); 
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
                    .addComponent(MenuText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ListButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RecetteButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                    .addComponent(StockButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        Menu3Layout.setVerticalGroup(
            Menu3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Menu3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MenuText)
                .addGap(18, 18, 18)
                .addComponent(StockButton3)
                .addGap(18, 18, 18)
                .addComponent(RecetteButton3)
                .addGap(18, 18, 18)
                .addComponent(ListButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pageFicheAliment.setBackground(new java.awt.Color(255, 204, 204));

        NomAlimentText.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); 
        NomAlimentText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NomAlimentText.setText("Nom Aliment :");

        AlimentChoisi.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        SearchButton.setText("Actualiser");
        SearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); 
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Fiche Aliment");

        DDPText.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); 
        DDPText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DDPText.setText("Date de Péremption :");

        TypeAlimentText.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); 
        TypeAlimentText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TypeAlimentText.setText("Type d'Aliment :");

        MDSText.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); 
        MDSText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MDSText.setText("Moyen de Stockage :");

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

        AlimentName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AlimentName.setText(nomAliment);

        Qte.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Qte.setText("...");

        MDS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MDS.setText("...");

        TA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TA.setText("...");

        QteText.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); 
        QteText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        QteText.setText("Quantite :");

        DDP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DDP.setText("...");

        ModifierAlimButton.setText("Supprimer Quantite");
        ModifierAlimButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModifierAlimButtonActionPerformed(evt);
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
                                .addComponent(AlimentName, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pageFicheAlimentLayout.createSequentialGroup()
                                .addComponent(DDPText)
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
                .addComponent(ModifierAlimButton)
                .addGap(33, 33, 33))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pageFicheAlimentLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AlimentChoisi, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(SearchButton)
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
                            .addComponent(AlimentChoisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SearchButton))
                        .addGap(51, 51, 51)
                        .addGroup(pageFicheAlimentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NomAlimentText)
                            .addComponent(AlimentName))
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
                            .addComponent(DDPText))
                        .addGap(147, 147, 147)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pageFicheAlimentLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(ModifierAlimButton)))
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
    }

    private void MenuTextMouseClicked(java.awt.event.MouseEvent evt) {
    	Main.controller.ChangerPage("accueil", null, null, null);
        this.dispose();
    }


    private void StockButton3ActionPerformed(java.awt.event.ActionEvent evt) {
    	Main.controller.ChangerPage("menuStock", null, null, null);
        this.dispose();
    }


    private void RecetteButton3ActionPerformed(java.awt.event.ActionEvent evt) {
    	Main.controller.ChangerPage("menuRecette", null, null, null);
        this.dispose();
    }

    private void ListButton3ActionPerformed(java.awt.event.ActionEvent evt) {
    	Main.controller.ChangerPage("menuListe", null, null, null);
        this.dispose();
    }

    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {
        String ac;
        
        ac = AlimentChoisi.getText();
        
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

    private void ModifierAlimButtonActionPerformed(java.awt.event.ActionEvent evt) {
    	Main.controller.ChangerPage("modifierUnAliment", null, null, null);
        this.dispose();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FicheAliment(nomAliment).setVisible(true);
            }
        });
    }
}
