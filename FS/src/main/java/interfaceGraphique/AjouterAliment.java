package interfaceGraphique ;
/**
 * @author Jules Aubry
 */

import java.util.Date;
import javax.swing.table.DefaultTableModel;
import java.util.*;

public class AjouterAliment extends javax.swing.JFrame {

    private javax.swing.JButton ListButton3;
    private javax.swing.JPanel Menu3;
    private javax.swing.JLabel MenuText;
    private javax.swing.JButton ModiferButton;
    private javax.swing.JButton RecetteButton3;
    private javax.swing.JButton StockButton3;
    private javax.swing.JButton SupprimerButton;
    private javax.swing.JTable TableAliments;
    private javax.swing.JButton boutonAjouter;
    private javax.swing.JLabel TitrePage;
    private javax.swing.JLabel DDPText;
    private javax.swing.JLabel QuantiteText;
    private javax.swing.JLabel NomAlimentText;
    private javax.swing.JPanel PageAjouterAliment;
    private javax.swing.JScrollPane jScrollPaneAliment;
    private javax.swing.JScrollPane ScrollPaneTableAliment;
    private javax.swing.JTable TableAliment;
    private javax.swing.JComboBox<String> txtAnnee;
    private javax.swing.JComboBox<String> txtJour;
    private javax.swing.JComboBox<String> txtMois;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtQte;

    DefaultTableModel d = new DefaultTableModel();
    
    /**
     * Constructeur
     */
    public AjouterAliment() {
        initComponents();
        d = (DefaultTableModel) TableAliments.getModel();
    }

    @SuppressWarnings("unchecked")
    /**
     * Initialise les composants JSwing
     */
    private void initComponents() {
        /*
         * JScrollPane des aliments
         */
    	jScrollPaneAliment = new javax.swing.JScrollPane();
        /*
         * Table des aliments
         */
    	TableAliment = new javax.swing.JTable();
        /*
         * Panel de la page ajouter aliment
         */
    	PageAjouterAliment = new javax.swing.JPanel();
        /*
         * Titre de la page
         */
    	TitrePage = new javax.swing.JLabel();
        /*
         * Text pour recuperer le nom de l'aliment
         */
        txtNom = new javax.swing.JTextField();
        /*
         * Text pour recuperer la quantite de l'aliment
         */
        txtQte = new javax.swing.JTextField();
        /*
         * Boite qui permet de recuperer le jour de la date de peremption
         */
        txtJour = new javax.swing.JComboBox<>();
        /*
         * Text quantite
         */
        QuantiteText = new javax.swing.JLabel();
        /*
         * Text date de peremption
         */
        DDPText = new javax.swing.JLabel();
        /*
         * ScrollPane de la table d'aliment
         */
        ScrollPaneTableAliment = new javax.swing.JScrollPane();
        /*
         * Table des aliments
         */
        TableAliments = new javax.swing.JTable();
        /*
         * Bouton ajouter à la table
         */
        boutonAjouter = new javax.swing.JButton();
        /*
         * Boite qui permet de recuperer le mois de la date de peremption
         */
        txtMois = new javax.swing.JComboBox<>();
        /*
         * Boite qui permet de recuperer l'annee de la date de peremption
         */
        txtAnnee = new javax.swing.JComboBox<>();
        /*
         * Text nom aliment
         */
        NomAlimentText = new javax.swing.JLabel();
        /*
         * Bouton supprimer
         */
        SupprimerButton = new javax.swing.JButton();
        /*
         * Bouton modifier
         */
        ModiferButton = new javax.swing.JButton();
        /*
    	 * Panel du menu
    	 */
        Menu3 = new javax.swing.JPanel();
        /*
    	 * Text Menu dans le menu
    	 */
        MenuText = new javax.swing.JLabel();
        /*
    	 * Bouton stock dans le menu
    	 */
        StockButton3 = new javax.swing.JButton();
        /*
    	 * Bouton recette dans le menu
    	 */
        RecetteButton3 = new javax.swing.JButton();
        /*
    	 * Bouton liste dans le menu
    	 */
        ListButton3 = new javax.swing.JButton();
        TableAliment.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPaneAliment.setViewportView(TableAliment);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(1020, 768));
        setMaximumSize(new java.awt.Dimension(1020, 768));
        setMinimumSize(new java.awt.Dimension(1020, 768));
        setPreferredSize(new java.awt.Dimension(1020, 768));

        PageAjouterAliment.setBackground(new java.awt.Color(255, 204, 204));

        TitrePage.setFont(new java.awt.Font("PCMyungjo", 0, 24)); 
        TitrePage.setForeground(new java.awt.Color(255, 0, 0));
        TitrePage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitrePage.setText("ALIMENT");

        txtNom.setFont(new java.awt.Font("Helvetica Neue", 0, 12));
        txtNom.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtQte.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); 
        txtQte.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtJour.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); 
        txtJour.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Jour--", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        txtJour.setName(""); // NOI18N

        QuantiteText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        QuantiteText.setText("Quantité :");

        DDPText.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); 
        DDPText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        DDPText.setText("Date de Péremption :");

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
        ScrollPaneTableAliment.setViewportView(TableAliments);

        boutonAjouter.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); 
        boutonAjouter.setText("AJOUTER");
        boutonAjouter.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        boutonAjouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonAjouterActionPerformed(evt);
            }
        });

        txtMois.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); 
        txtMois.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Mois--", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", " " }));
        txtMois.setName(""); 
 

        txtAnnee.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); 
        txtAnnee.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Annee--", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032" }));
        txtAnnee.setName(""); 

        NomAlimentText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        NomAlimentText.setText("Nom :");

        SupprimerButton.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); 
        SupprimerButton.setText("SUPPRIMER");
        SupprimerButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        ModiferButton.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); 
        ModiferButton.setText("MODIFIER");
        ModiferButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout PageAjouterAlimentLayout = new javax.swing.GroupLayout(PageAjouterAliment);
        PageAjouterAliment.setLayout(PageAjouterAlimentLayout);
        PageAjouterAlimentLayout.setHorizontalGroup(
            PageAjouterAlimentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PageAjouterAlimentLayout.createSequentialGroup()
                .addGroup(PageAjouterAlimentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PageAjouterAlimentLayout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(QuantiteText)
                        .addGap(63, 63, 63)
                        .addComponent(txtQte, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PageAjouterAlimentLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PageAjouterAlimentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PageAjouterAlimentLayout.createSequentialGroup()
                                .addComponent(DDPText, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68)
                                .addComponent(txtJour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(txtMois, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PageAjouterAlimentLayout.createSequentialGroup()
                                .addComponent(boutonAjouter)
                                .addGap(97, 97, 97)
                                .addComponent(ModiferButton)))
                        .addGap(82, 82, 82)
                        .addGroup(PageAjouterAlimentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtAnnee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SupprimerButton))))
                .addGap(279, 279, 279))
            .addGroup(PageAjouterAlimentLayout.createSequentialGroup()
                .addGroup(PageAjouterAlimentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TitrePage, javax.swing.GroupLayout.PREFERRED_SIZE, 923, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PageAjouterAlimentLayout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(ScrollPaneTableAliment, javax.swing.GroupLayout.PREFERRED_SIZE, 716, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PageAjouterAlimentLayout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(NomAlimentText)
                        .addGap(48, 48, 48)
                        .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PageAjouterAlimentLayout.setVerticalGroup(
            PageAjouterAlimentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PageAjouterAlimentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TitrePage, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PageAjouterAlimentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NomAlimentText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25)
                .addGroup(PageAjouterAlimentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(QuantiteText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(PageAjouterAlimentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtJour, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMois, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAnnee, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DDPText))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(PageAjouterAlimentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boutonAjouter, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SupprimerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ModiferButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(ScrollPaneTableAliment, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        txtJour.getAccessibleContext().setAccessibleName("");
        txtJour.getAccessibleContext().setAccessibleDescription("");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Menu3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PageAjouterAliment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PageAjouterAliment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Menu3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1040, 490));
        setLocationRelativeTo(null);
    }
    /**
     * Ajouter un aliment à la table
     * @param evt Click de la souris sur le bouton
     */
    private void boutonAjouterActionPerformed(java.awt.event.ActionEvent evt) {
        String nom;
        String quantite;
        Date DDP;
        int quantiteint;
        /* On récuperre la date de peremption */
        String jour = (String)txtJour.getSelectedItem();
        String mois = (String)txtMois.getSelectedItem();
        String annee = (String)txtAnnee.getSelectedItem();
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
            nom = txtNom.getText();
            /*}
        catch(NumberFormatException ex){
            /* Erreur si c'est pas un String */
            /*}

        /* On recupere la quantite*/
        quantite = txtQte.getText();

        try{
            quantiteint = Integer.parseInt(txtQte.getText());
        }
        catch (NumberFormatException ex){
            ex.printStackTrace();
        }

        /* Il faut verifier si le nom correspond à un aliment dans la base de donnee */
        /* Il faut ensuite recuperer le moyen de stockage et l'unite de mesure de l'aliment */
        /* On peut ensuite l'ajouter aux stocks */

        /* Définition de l'aliment */

        /* Ajouter un élement à la liste */
        /*listeAliment.add(A);*/

        /* Ajout à la Table */
        String[] ligne = new String[] {nom, quantite, ddp};
        d.addRow(ligne);
    }
    /**
    * Permet d'ouvrir le menu stock
    * @param evt Click sur le bouton Stock
    */
    private void StockButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        Main.controller.ChangerPage("menuStock", null, null, null);
        this.dispose();
    }
    /**
    * Permet d'ouvrir le menu recette
    * @param evt Click sur le bouton Recette
    */
    private void RecetteButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        Main.controller.ChangerPage("menuRecette", null, null, null);
        this.dispose();
    }
    /**
     * Permet d'ouvrir le menu liste
     * @param evt Click sur le bouton Liste
     */
    private void ListButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        Main.controller.ChangerPage("menuListe", null, null, null);
        this.dispose();
    }
    /**
     * Permet d'ouvrir l'accueil
     * @param evt Click sur le text menu
     */
    private void MenuTextMouseClicked(java.awt.event.MouseEvent evt) {
        Main.controller.ChangerPage("accueil", null, null, null);
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
            java.util.logging.Logger.getLogger(AjouterAliment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AjouterAliment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AjouterAliment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AjouterAliment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AjouterAliment().setVisible(true);
            }
        });
    }
}
