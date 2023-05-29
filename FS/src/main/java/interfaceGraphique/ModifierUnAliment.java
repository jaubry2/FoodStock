package interfaceGraphique ;
import javax.swing.JOptionPane;
/**
 *
 * @author julesa
 */
public class ModifierUnAliment extends javax.swing.JFrame {
    /**
     * Aliment choisi
     */
    private static String aliment;
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
     * Bare séparatrice au milieu
     */
    private javax.swing.JPanel barreSep;
    /**
     * Text du menu dans le menu de navigation
     */
    private javax.swing.JLabel menuText;
    /**
     * Menu
     */
    private javax.swing.JLabel nomAliment;
    /**
     * Text proportion
     */
    private javax.swing.JLabel proportionText;
    /**
     * Text quantite
     */
    private javax.swing.JLabel quantiteText;
    /**
     * Correspond à tous les paliers du slider
     */
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
     * JTextField pour la valeurProp du seuil
     */
    private javax.swing.JTextField valeurProp;
    /**
     * JTextField pour la valeur quantite
     */
    private javax.swing.JTextField valeurQte;
    /**
     * CheckBox pour la proportion
     */
    private javax.swing.JCheckBox propCheckBox;
    /**
     * CheckBox pour la quantité
     */
    private javax.swing.JCheckBox qteCheckBox;
    /**
     * ComboBox unite de mesure
     */
    private javax.swing.JComboBox<String> uniteDeMesureComboBox;
    /**
     * Cree une nouvelle page
     */
    public ModifierUnAliment(String aliment) {
        initComponents();
        this.addWindowListener(new FermetureFenetre());
        this.aliment = aliment;
    }

    private void initComponents() {

        Menu3 = new javax.swing.JPanel();
        menuText = new javax.swing.JLabel();
        stockButton = new javax.swing.JButton();
        recetteButton = new javax.swing.JButton();
        listButton = new javax.swing.JButton();
        pageModif = new javax.swing.JPanel();
        Seuil = new javax.swing.JSlider();
        nomAliment = new javax.swing.JLabel();
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
        valeurProp = new javax.swing.JTextField();
        proportionText = new javax.swing.JLabel();
        barreSep = new javax.swing.JPanel();
        quantiteText = new javax.swing.JLabel();
        valeurQte = new javax.swing.JTextField();
        propCheckBox = new javax.swing.JCheckBox();
        qteCheckBox = new javax.swing.JCheckBox();
        uniteDeMesureComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(1020, 768));
        setMaximumSize(new java.awt.Dimension(1020, 768));
        setMinimumSize(new java.awt.Dimension(1020, 768));
        setResizable(false);

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

        nomAliment.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); 
        nomAliment.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nomAliment.setText("Nom Aliments");

        validerButton.setText("Valider");
        validerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validerButtonActionPerformed(evt);
            }
        });

        proportionText.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); 
        proportionText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        proportionText.setText("Proportion");

        quantiteText.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); 
        quantiteText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quantiteText.setText("Quantité");
        
        propCheckBox.setMaximumSize(new java.awt.Dimension(30, 30));
        propCheckBox.setMinimumSize(new java.awt.Dimension(30, 30));
        propCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                propCheckBoxActionPerformed(evt);
            }
        });

        qteCheckBox.setMaximumSize(new java.awt.Dimension(30, 30));
        qteCheckBox.setMinimumSize(new java.awt.Dimension(30, 30));
        qteCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qteCheckBoxActionPerformed(evt);
            }
        });

        uniteDeMesureComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--- Unité de Mesure", "gramme", "cL", "unité", " " }));

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

        valeurProp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        valeurProp.setText("100");
        valeurProp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ValeurKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout barreSepLayout = new javax.swing.GroupLayout(barreSep);
        barreSep.setLayout(barreSepLayout);
        barreSepLayout.setHorizontalGroup(
            barreSepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 11, Short.MAX_VALUE)
        );
        barreSepLayout.setVerticalGroup(
            barreSepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 523, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pageModifLayout = new javax.swing.GroupLayout(pageModif);
        pageModif.setLayout(pageModifLayout);
        pageModifLayout.setHorizontalGroup(
            pageModifLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pageModifLayout.createSequentialGroup()
                .addComponent(nomAliment, javax.swing.GroupLayout.DEFAULT_SIZE, 880, Short.MAX_VALUE)
                .addGap(21, 21, 21))
            .addGroup(pageModifLayout.createSequentialGroup()
                .addGroup(pageModifLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pageModifLayout.createSequentialGroup()
                        .addGap(362, 362, 362)
                        .addComponent(validerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pageModifLayout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(pageModifLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(proportionText, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pageModifLayout.createSequentialGroup()
                                .addGroup(pageModifLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(pageModifLayout.createSequentialGroup()
                                        .addComponent(valeurProp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(62, 62, 62)
                                        .addComponent(Seuil, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pageModifLayout.createSequentialGroup()
                                        .addComponent(propCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(8, 8, 8)))
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
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel9))))
                        .addGap(121, 121, 121)
                        .addComponent(barreSep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(pageModifLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pageModifLayout.createSequentialGroup()
                                .addGap(155, 155, 155)
                                .addComponent(quantiteText, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pageModifLayout.createSequentialGroup()
                                .addGap(206, 206, 206)
                                .addComponent(qteCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pageModifLayout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addComponent(valeurQte, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(uniteDeMesureComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pageModifLayout.setVerticalGroup(
            pageModifLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pageModifLayout.createSequentialGroup()
                .addComponent(nomAliment, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pageModifLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pageModifLayout.createSequentialGroup()
                        .addComponent(proportionText, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(propCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addGroup(pageModifLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pageModifLayout.createSequentialGroup()
                                .addGap(154, 154, 154)
                                .addComponent(valeurProp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pageModifLayout.createSequentialGroup()
                                .addGap(303, 303, 303)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Seuil, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(barreSep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pageModifLayout.createSequentialGroup()
                        .addComponent(quantiteText, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(qteCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(190, 190, 190)
                        .addGroup(pageModifLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(valeurQte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(uniteDeMesureComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(validerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
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

        float valq = Float.valueOf(valeurQte.getText());
        float valp = Seuil.getValue();

        if (Main.stock.getQuantiteASNonPerime(aliment) < valq)
        {
            JOptionPane.showMessageDialog(this, "La quantité choisie est trop élévé \n comparé a votre stock");
        } else {
            if (propCheckBox.isSelected()){
                Float v = Main.stock.getQuantiteASNonPerime(aliment) * (valp/100);
                Main.stock.retirerQuantiteStock(aliment,  v);  
                String[] infoAliment = Main.controller.AfficherFicheAliment(aliment);
                FicheAliment mF = new FicheAliment(infoAliment[0], infoAliment[1], infoAliment[2], infoAliment[3], infoAliment[4]);                                   ;
                mF.setVisible(true);
                this.dispose();    
            } else if(qteCheckBox.isSelected()){
                String udm = (String)uniteDeMesureComboBox.getSelectedItem();
                if(udm.equals("--- Unité de Mesure")){
                    JOptionPane.showMessageDialog(this, "Selectionnez une unité \n de mesure");
                } else{
                Main.stock.retirerQuantiteStock(aliment,  valq);
                String[] infoAliment = Main.controller.AfficherFicheAliment(aliment);
                FicheAliment mF = new FicheAliment(infoAliment[0], infoAliment[1], infoAliment[2], infoAliment[3], infoAliment[4]);                                   ;
                mF.setVisible(true);
                this.dispose();
                }
            } else{
                JOptionPane.showMessageDialog(this, "Selectionnez une option \n avant de valider");
            }
        }
    }

    private void SeuilMouseMoved(java.awt.event.MouseEvent evt) {
        int v = Seuil.getValue();
        String str = String.valueOf(v);
        valeurProp.setText(str);
    }

    private void ValeurKeyPressed(java.awt.event.KeyEvent evt) {
        String str = valeurProp.getText();
        try{
            int v = Integer.parseInt(str);
            Seuil.setValue(v);
        }
        catch (NumberFormatException ex){
            ex.printStackTrace();
        }
    }
    /**
     * Change la valeur de la CheckBox proportion de l'autre possibilité a faux
     * @param evt Cliquer sur le bouton
     */
    private void qteCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {                                            
        propCheckBox.setSelected(false);
    }                                           
    /**
     * Change la valeur de la CheckBox quantite de l'autre possibilité a faux
     * @param evt Cliquer sur le bouton
     */
    private void propCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {                                             
        qteCheckBox.setSelected(false);
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
                new ModifierUnAliment(aliment).setVisible(true);
            }
        });
    }
}
