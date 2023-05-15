package interfaceGraphique ;
/**
 * @author Jules Aubry
 */

import java.util.Date;
import javax.swing.table.DefaultTableModel;
import java.util.*;

public class AjouterAliment extends javax.swing.JFrame {


    private javax.swing.JButton ListButton3;
    private javax.swing.JButton AddStockButton;
    private javax.swing.JButton AddTicketButton;
    private javax.swing.JPanel Menu3;
    private javax.swing.JLabel MenuText;
    private javax.swing.JButton ModiferButton;
    private javax.swing.JButton RecetteButton3;
    private javax.swing.JButton StockButton3;
    private javax.swing.JButton SupprimerButton;
    private javax.swing.JTable TableAliments;
    private javax.swing.JButton boutonAjouter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable2;
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
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNom = new javax.swing.JTextField();
        txtQte = new javax.swing.JTextField();
        txtJour = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        TableAliments = new javax.swing.JTable();
        boutonAjouter = new javax.swing.JButton();
        txtMois = new javax.swing.JComboBox<>();
        txtAnnee = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        SupprimerButton = new javax.swing.JButton();
        AddStockButton = new javax.swing.JButton();
        AddTicketButton = new javax.swing.JButton();
        ModiferButton = new javax.swing.JButton();
        Menu3 = new javax.swing.JPanel();
        MenuText = new javax.swing.JLabel();
        StockButton3 = new javax.swing.JButton();
        RecetteButton3 = new javax.swing.JButton();
        ListButton3 = new javax.swing.JButton();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(1020, 768));
        setMaximumSize(new java.awt.Dimension(1020, 768));
        setMinimumSize(new java.awt.Dimension(1020, 768));
        setPreferredSize(new java.awt.Dimension(1020, 768));

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setFont(new java.awt.Font("PCMyungjo", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ALIMENT");

        txtNom.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        txtNom.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomActionPerformed(evt);
            }
        });

        txtQte.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        txtQte.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtQte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQteActionPerformed(evt);
            }
        });

        txtJour.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        txtJour.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Jour--", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        txtJour.setName(""); // NOI18N
        txtJour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJourActionPerformed(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Quantité :");

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Date de Péremption :");

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

        boutonAjouter.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        boutonAjouter.setText("AJOUTER");
        boutonAjouter.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        boutonAjouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonAjouterActionPerformed(evt);
            }
        });

        txtMois.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        txtMois.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Mois--", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", " " }));
        txtMois.setName(""); // NOI18N
        txtMois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMoisActionPerformed(evt);
            }
        });

        txtAnnee.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        txtAnnee.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Annee--", "2023", "2024", "2025", "2026", " " }));
        txtAnnee.setName(""); // NOI18N
        txtAnnee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnneeActionPerformed(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Nom :");

        SupprimerButton.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        SupprimerButton.setText("SUPPRIMER");
        SupprimerButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        ModiferButton.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        ModiferButton.setText("MODIFIER");
        ModiferButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        AddStockButton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        AddStockButton.setText("AJOUTER AU STOCK");
        AddStockButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        AddStockButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddStockButtonActionPerformed(evt);
            }
        });

        AddTicketButton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        AddTicketButton.setText("AJOUTER TICKET");
        AddTicketButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        AddTicketButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddTicketButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(jLabel4)
                        .addGap(63, 63, 63)
                        .addComponent(txtQte, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68)
                                .addComponent(txtJour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(txtMois, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(AddTicketButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(boutonAjouter)
                                .addGap(97, 97, 97)
                                .addComponent(ModiferButton)))
                        .addGap(82, 82, 82)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtAnnee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SupprimerButton))))
                .addGap(279, 279, 279))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 923, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 716, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(jLabel5)
                        .addGap(48, 48, 48)
                        .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(366, 366, 366)
                        .addComponent(AddStockButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtJour, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMois, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAnnee, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boutonAjouter, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SupprimerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ModiferButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(AddTicketButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
                .addComponent(AddStockButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        ;

        txtJour.getAccessibleContext().setAccessibleName("");
        txtJour.getAccessibleContext().setAccessibleDescription("");

        Menu3.setBackground(new java.awt.Color(153, 204, 255));
        Menu3.setForeground(new java.awt.Color(51, 204, 255));

        MenuText.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        MenuText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MenuText.setText("MENU");
        MenuText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuTextMouseClicked(evt);
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
        RecetteButton3.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        RecetteButton3.setText("Recette");
        RecetteButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecetteButton3ActionPerformed(evt);
            }
        });

        ListButton3.setBackground(new java.awt.Color(153, 204, 255));
        ListButton3.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
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
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Menu3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1040, 490));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void boutonAjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonAjouterActionPerformed
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
    }//GEN-LAST:event_boutonAjouterActionPerformed

    private void txtJourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJourActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJourActionPerformed

    private void txtQteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQteActionPerformed

    private void txtNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomActionPerformed

    private void txtMoisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMoisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMoisActionPerformed

    private void txtAnneeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnneeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnneeActionPerformed
    /**
    * Permet d'ouvrir le menu stock
    * @param evt Click sur le bouton Stock
    */
    private void StockButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        Stock newPage = new Stock();
		newPage.setVisible(true);
        this.dispose();
    }
    /**
    * Permet d'ouvrir le menu recette
    * @param evt Click sur le bouton Recette
    */
    private void RecetteButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        MenuRecette newPage = new MenuRecette();
		newPage.setVisible(true);
        this.dispose();
    }
    /**
     * Permet d'ouvrir le menu liste
     * @param evt Click sur le bouton Liste
     */
    private void ListButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        MenuListe newPage = new MenuListe();
		newPage.setVisible(true);
        this.dispose();
    }
    /**
     * Permet d'ouvrir l'accueil
     * @param evt Click sur le text menu
     */
    private void MenuTextMouseClicked(java.awt.event.MouseEvent evt) {
        Accueil newPage = new Accueil();
		newPage.setVisible(true);
        this.dispose();
    }

    private void AddStockButtonActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

    private void AddTicketButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
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
