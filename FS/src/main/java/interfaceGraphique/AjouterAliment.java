package interfaceGraphique ;
/**
 * @author Jules Aubry
 */

import java.util.Date;
import javax.swing.table.DefaultTableModel;
import java.util.*;

public class AjouterAliment extends javax.swing.JFrame {

    /**
     * Bouton dans le menu de navigation qui redirige vers la page Liste 
     */
    private javax.swing.JButton listButton;
    /**
     * Bouton dans le menu de navigation qui redirige vers la page Recette 
     */
    private javax.swing.JButton recetteButton;
    /**
     * Bouton dans le menu de navigation qui redirige vers la page Stock 
     */
    private javax.swing.JButton stockButton;
    /**
     * Bouton qui permet d'ajouter au stock la table d'aliment
     */
    private javax.swing.JButton addStockButton;
    /**
     * Bouton qui permet d'ajouter a la table un ticket de caisse
     */
    private javax.swing.JButton addTicketButton;
    /**
     * Bouton qui permet d'ajouter un aliment a la table
     */
    private javax.swing.JButton boutonAjouter;
    /**
     * Bouton qui permet de modifier un aliment dans la table
     */
    private javax.swing.JButton modifierButton;
    /**
     * Bouton qui permet de supprimer un aliment dans la table
     */
    private javax.swing.JButton supprimerButton;
    /**
     * Panel du menu de navigation à gauche
     */
    private javax.swing.JPanel pageMenu;
    /**
     * Panel de la page Ajouter aliment
     */
    private javax.swing.JPanel pageAjouterAliment;
    /**
     * Text du menu dans le menu de navigation
     */
    private javax.swing.JLabel menuText;
    /**
     * Table ou l'on affiche les aliments que l'on va ajoiuter au stock
     */
    private javax.swing.JTable TableAliments;
    /**
     * Nom de la page
     */
    private javax.swing.JLabel pageNameText;
    /**
     * Text date de péremption
     */
    private javax.swing.JLabel ddpText;
    /**
     * Text quantite
     */
    private javax.swing.JLabel qteText;
    /**
     * Text nom aliment
     */
    private javax.swing.JLabel nomText;
    /**
     * JScrollPane de la table des aliments
     */
    private javax.swing.JScrollPane jScrollPane3;
    /**
     * JScrollPane de la table des aliments
     */
    private javax.swing.JScrollPane jScrollPane4;
    /**
     * Table des aliments
     */
    private javax.swing.JTable jTable2;
    /**
     * Combobox pour choisir l'annee de la date de peremption
     */
    private javax.swing.JComboBox<String> anneeComboBox;
    /**
     * Combobox pour choisir le jour de la date de peremption
     */
    private javax.swing.JComboBox<String> jourComboBox;
    /**
     * Combobox pour choisir le mois de la date de peremption
     */
    private javax.swing.JComboBox<String> moisComboBox;
    /**
     * TextField pour recuperer le nom de l'aliment
     */
    private javax.swing.JTextField nomTextField;
    /**
     * TextField pour recuperer la quantite de l'aliment
     */
    private javax.swing.JTextField qteTextField;
    /**
     * Ligne selcetionne dans la table
     */
    private int selectedRow;


    DefaultTableModel d = new DefaultTableModel();
    
    /**
     * Constructeur
     */
    public AjouterAliment() {
        initComponents();
        d = (DefaultTableModel) TableAliments.getModel();
        this.addWindowListener(new FermetureFenetre());

    }

    @SuppressWarnings("unchecked")
    /**
     * Initialise les composants JSwing
     */
    private void initComponents() {
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        pageAjouterAliment = new javax.swing.JPanel();
        pageNameText = new javax.swing.JLabel();
        nomTextField = new javax.swing.JTextField();
        qteTextField = new javax.swing.JTextField();
        jourComboBox = new javax.swing.JComboBox<>();
        qteText = new javax.swing.JLabel();
        ddpText = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        TableAliments = new javax.swing.JTable();
        boutonAjouter = new javax.swing.JButton();
        moisComboBox = new javax.swing.JComboBox<>();
        anneeComboBox = new javax.swing.JComboBox<>();
        nomText = new javax.swing.JLabel();
        supprimerButton = new javax.swing.JButton();
        addStockButton = new javax.swing.JButton();
        addTicketButton = new javax.swing.JButton();
        modifierButton = new javax.swing.JButton();
        pageMenu = new javax.swing.JPanel();
        menuText = new javax.swing.JLabel();
        stockButton = new javax.swing.JButton();
        recetteButton = new javax.swing.JButton();
        listButton = new javax.swing.JButton();
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jTable2);

        /*
         * On set les caracteristiques de la page
         */
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationRelativeTo(null); 
        setMaximumSize(new java.awt.Dimension(1020, 768));
        setMinimumSize(new java.awt.Dimension(1020, 768));
        setPreferredSize(new java.awt.Dimension(1020, 768));

        pageAjouterAliment.setBackground(new java.awt.Color(255, 204, 204));

        pageNameText.setFont(new java.awt.Font("PCMyungjo", 0, 24)); 
        pageNameText.setForeground(new java.awt.Color(255, 0, 0));
        pageNameText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pageNameText.setText("ALIMENT");

        nomTextField.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); 
        nomTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);


        qteTextField.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); 
        qteTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jourComboBox.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); 
        jourComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Jour--", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jourComboBox.setName(""); // NOI18N

        qteText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        qteText.setText("Quantité :");

        ddpText.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); 
        ddpText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ddpText.setText("Date de Péremption :");

        TableAliments.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nom", "Qte", "DDP"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TableAliments.setFocusable(false);
        TableAliments.setRowHeight(25);
        TableAliments.setSelectionBackground(new java.awt.Color(232, 57, 95));
        TableAliments.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(TableAliments);

        boutonAjouter.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); 
        boutonAjouter.setText("AJOUTER");
        boutonAjouter.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        boutonAjouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonAjouterActionPerformed(evt);
            }
        });

        moisComboBox.setFont(new java.awt.Font("Helvetica Neue", 0, 12));
        moisComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Mois--", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", " " }));
        moisComboBox.setName(""); // NOI18N

        anneeComboBox.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); 
        anneeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Annee--", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040" }));
        anneeComboBox.setName(""); 

        nomText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        nomText.setText("Nom :");

        supprimerButton.setFont(new java.awt.Font("Helvetica Neue", 1, 13));
        supprimerButton.setText("SUPPRIMER");
        supprimerButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        modifierButton.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); 
        modifierButton.setText("MODIFIER");
        modifierButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        addStockButton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); 
        addStockButton.setText("AJOUTER AU STOCK");
        addStockButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addStockButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStockButtonActionPerformed(evt);
            }
        });

        addTicketButton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); 
        addTicketButton.setText("AJOUTER TICKET");
        addTicketButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addTicketButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTicketButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(pageAjouterAliment);
        pageAjouterAliment.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(qteText)
                        .addGap(63, 63, 63)
                        .addComponent(qteTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(ddpText, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68)
                                .addComponent(jourComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(moisComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(addTicketButton)
                                .addGap(79, 79, 79)
                                .addComponent(boutonAjouter)
                                .addGap(90, 90, 90)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(anneeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(modifierButton)
                                .addGap(70, 70, 70)))))
                .addGap(32, 32, 32)
                .addComponent(supprimerButton)
                .addGap(165, 165, 165))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pageNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 923, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(nomText)
                        .addGap(48, 48, 48)
                        .addComponent(nomTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 716, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(366, 366, 366)
                        .addComponent(addStockButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pageNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qteTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qteText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jourComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(moisComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anneeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ddpText))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boutonAjouter, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(supprimerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modifierButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addTicketButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(addStockButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jourComboBox.getAccessibleContext().setAccessibleName("");
        jourComboBox.getAccessibleContext().setAccessibleDescription("");

        pageMenu.setBackground(new java.awt.Color(153, 204, 255));
        pageMenu.setForeground(new java.awt.Color(51, 204, 255));

        menuText.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); 
        menuText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuText.setText("MENU");
        menuText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuTextMouseClicked(evt);
            }
        });

        stockButton.setBackground(new java.awt.Color(153, 204, 255));
        stockButton.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); 
        stockButton.setText("Stock");
        stockButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockButtonActionPerformed(evt);
            }
        });

        recetteButton.setBackground(new java.awt.Color(153, 204, 255));
        recetteButton.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); 
        recetteButton.setText("Recette");
        recetteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recetteButtonActionPerformed(evt);
            }
        });

        listButton.setBackground(new java.awt.Color(153, 204, 255));
        listButton.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); 
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pageMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pageAjouterAliment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pageAjouterAliment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pageMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1040, 490));
        setLocationRelativeTo(null);
    }

    private void boutonAjouterActionPerformed(java.awt.event.ActionEvent evt) {
        String nom;
        String quantite;
        Date DDP;
        int quantiteint;
        /* On récuperre la date de peremption */
        String jour = (String)jourComboBox.getSelectedItem();
        String mois = (String)moisComboBox.getSelectedItem();
        String annee = (String)anneeComboBox.getSelectedItem();
        String ddp = jour + "/" + mois + "/" + annee;

        try{
            int jourint = Integer.parseInt(jour);
            int moisint = Integer.parseInt(mois);
            int anneeint = Integer.parseInt(annee);
            DDP = new Date(anneeint, moisint, jourint);
        }
        catch (NumberFormatException ex){
            ex.printStackTrace();
        }

        /* On recupere le nom de l'objet */
        /* try {*/
            nom = nomTextField.getText();
            /*}
        catch(NumberFormatException ex){
            /* Erreur si c'est pas un String */
            /*}

        /* On recupere la quantite*/
        quantite = qteTextField.getText();

        try{
            quantiteint = Integer.parseInt(qteTextField.getText());
        }
        catch (NumberFormatException ex){
            ex.printStackTrace();
        }



        /* Ajout à la Table */
        String[] ligne = new String[] {nom, quantite, ddp};
        d.addRow(ligne);
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
        MenuListe newPage = new MenuListe();
		newPage.setVisible(true);
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

    private void addStockButtonActionPerformed(java.awt.event.ActionEvent evt) {                                               
    	Main.controller.AjouterStock(d);
    }                                              

    private void addTicketButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
    } 

    private void SupprimerButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                
        d.removeRow(selectedRow);
    } 
    
    private void TableAlimentsMouseClicked(java.awt.event.MouseEvent evt) {                                           
        selectedRow = TableAliments.getSelectedRow();
    } 
    
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AjouterAliment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AjouterAliment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AjouterAliment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AjouterAliment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Cree et affiche une nouvelle page */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AjouterAliment().setVisible(true);
            }
        });
    }
}
