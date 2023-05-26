package interfaceGraphique ;

/**
 *
 * @author julesa
 */
public class ModifierUnAliment extends javax.swing.JFrame {
    /**
     * Bouton dans le menu de navigation qui redirige vers la page Liste 
     */
    private javax.swing.JButton listButton;
    /**
     * Bouton dans le menu de navigation qui redirige vers la page Stock 
     */
    private javax.swing.JButton stockButton;
    /**
     * Bouton dans le menu de navigation qui redirige vers la page Recette 
     */
    private javax.swing.JButton recetteButton;
    /**
     * Bouton qui permet de valider le retrait de quantite
     */
    private javax.swing.JButton validerButton;
    /**
     * Panel du menu de navigation a gauche
     */
    private javax.swing.JPanel Menu3;
    /**
     * Page de modifier un aliment
     */
    private javax.swing.JPanel pageModif;
    /**
     * Text du menu dans le menu de navigation
     */
    private javax.swing.JLabel menuText;
    /**
     * Correspond à tous les paliers du slider
     */
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    /**
     * Slider pour la quantite que l'on souhaite enleve
     */
    private javax.swing.JSlider Seuil;
    /**
     * JTextField pour la valeur du seuil
     */
    private javax.swing.JTextField Valeur;
    /**
     * Cree une nouvelle page
     */
    public ModifierUnAliment() {
        initComponents();
        this.addWindowListener(new FermetureFenetre());

    }

    private void initComponents() {

        Menu3 = new javax.swing.JPanel();
        menuText = new javax.swing.JLabel();
        stockButton = new javax.swing.JButton();
        recetteButton = new javax.swing.JButton();
        listButton = new javax.swing.JButton();
        pageModif = new javax.swing.JPanel();
        Seuil = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();
        validerButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        Valeur = new javax.swing.JTextField();

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

        pageModif.setBackground(new java.awt.Color(255, 204, 204));

        Seuil.setForeground(new java.awt.Color(153, 204, 255));
        Seuil.setOrientation(javax.swing.JSlider.VERTICAL);
        Seuil.setValue(100);
        Seuil.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                SeuilMouseMoved(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Nom Aliments");

        validerButton.setText("Valider");
        validerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validerButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("--------");

        jLabel3.setText("--");

        jLabel4.setText("--------");

        jLabel5.setText("--------");

        jLabel6.setText("---");

        jLabel7.setText("--");

        jLabel8.setText("---");

        jLabel9.setText("--");

        jLabel10.setText("---");

        jLabel11.setText("---");

        jLabel12.setText("--");

        jLabel13.setText("---");

        jLabel14.setText("--");

        jLabel15.setText("--");

        jLabel16.setText("---");

        jLabel17.setText("--");

        jLabel18.setText("---");

        jLabel19.setText("--------");

        jLabel20.setText("---");

        jLabel21.setText("--");

        jLabel22.setText("--------");

        Valeur.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Valeur.setText("100");
        Valeur.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ValeurKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout pageModifLayout = new javax.swing.GroupLayout(pageModif);
        pageModif.setLayout(pageModifLayout);
        pageModifLayout.setHorizontalGroup(
            pageModifLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pageModifLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(21, 21, 21))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pageModifLayout.createSequentialGroup()
                .addContainerGap(315, Short.MAX_VALUE)
                .addGroup(pageModifLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pageModifLayout.createSequentialGroup()
                        .addComponent(Valeur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(Seuil, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(pageModifLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22)
                            .addComponent(jLabel14)
                            .addComponent(jLabel21)
                            .addComponent(jLabel11)
                            .addComponent(jLabel19)
                            .addComponent(jLabel6)
                            .addComponent(jLabel15)
                            .addComponent(jLabel18)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel12)
                            .addComponent(jLabel8)
                            .addComponent(jLabel2)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)
                            .addComponent(jLabel7)
                            .addComponent(jLabel13)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel5)
                            .addComponent(jLabel20))
                        .addGap(366, 366, 366))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pageModifLayout.createSequentialGroup()
                        .addComponent(validerButton)
                        .addGap(406, 406, 406))))
        );
        pageModifLayout.setVerticalGroup(
            pageModifLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pageModifLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pageModifLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pageModifLayout.createSequentialGroup()
                        .addGap(318, 318, 318)
                        .addComponent(Valeur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pageModifLayout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addGroup(pageModifLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pageModifLayout.createSequentialGroup()
                                .addGap(303, 303, 303)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pageModifLayout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Seuil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(53, 53, 53)
                .addComponent(validerButton)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Menu3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pageModif, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Menu3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pageModif, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }
    /**
    * Permet d'ouvrir le menu stock
    * @param evt Click sur le bouton Stock
    */
    private void stockButtonActionPerformed(java.awt.event.ActionEvent evt) {
        MenuStock newPage = new MenuStock();
		newPage.setVisible(true);
        this.dispose();
    }
    /**
    * Permet d'ouvrir le menu recette
    * @param evt Click sur le bouton Recette
    */
    private void recetteButtonActionPerformed(java.awt.event.ActionEvent evt) {
        MenuRecette newPage = new MenuRecette();
		newPage.setVisible(true);
        this.dispose();
    }
    /**
     * Permet d'ouvrir le menu liste
     * @param evt Click sur le bouton Liste
     */
    private void listButtonActionPerformed(java.awt.event.ActionEvent evt) {
        /*MenuListe newPage = new MenuListe();
		newPage.setVisible(true);*/
    	Main.controller.ChangerPage("MenuListe",null,null,null);

        this.dispose();
    }
    /**
     * Permet d'ouvrir l'accueil
     * @param evt Click sur le text menu
     */
    private void menuTextMouseClicked(java.awt.event.MouseEvent evt) {
        Accueil newPage = new Accueil();
		newPage.setVisible(true);
        this.dispose();
    }

    private void validerButtonActionPerformed(java.awt.event.ActionEvent evt) {
        int p = Seuil.getValue();
           
    }

    private void SeuilMouseMoved(java.awt.event.MouseEvent evt) {
        int v = Seuil.getValue();
        String str = String.valueOf(v);
        Valeur.setText(str);
    }

    private void ValeurKeyPressed(java.awt.event.KeyEvent evt) {
        String str = Valeur.getText();
        try{
            int v = Integer.parseInt(str);
            Seuil.setValue(v);
        }
        catch (NumberFormatException ex){
            ex.printStackTrace();
        }
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
            java.util.logging.Logger.getLogger(ModifierUnAliment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModifierUnAliment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModifierUnAliment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModifierUnAliment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModifierUnAliment().setVisible(true);
            }
        });
    }
}
