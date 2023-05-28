/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaceGraphique;

/**
 *
 * @author idruote
 */
public class AjouterRecette extends javax.swing.JFrame {

    /**
     * Creates new form AjouterRecette
     */
    public AjouterRecette() {
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

        pageAjouterRecette = new javax.swing.JPanel();
        nomRecette = new javax.swing.JTextField();
        dureeRecette = new javax.swing.JTextField();
        titreDureeRecette = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        TableIngredientsRecette = new javax.swing.JTable();
        boutonAjouter = new javax.swing.JButton();
        titreNomRecette = new javax.swing.JLabel();
        addStockButton = new javax.swing.JButton();
        titreRecette = new javax.swing.JLabel();
        titreTableIngredientsRecette = new javax.swing.JLabel();
        pageMenu = new javax.swing.JPanel();
        menuText = new javax.swing.JLabel();
        stockButton = new javax.swing.JButton();
        recetteButton = new javax.swing.JButton();
        listButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);  
        setBackground(new java.awt.Color(255, 153, 153));
        setMaximumSize(new java.awt.Dimension(1020, 768));
        setMinimumSize(new java.awt.Dimension(1020, 768));
        setPreferredSize(new java.awt.Dimension(1020, 768));



        pageAjouterRecette.setBackground(new java.awt.Color(255, 204, 204));

        nomRecette.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        nomRecette.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nomRecette.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomRecetteActionPerformed(evt);
            }
        });

        dureeRecette.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        dureeRecette.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dureeRecette.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dureeRecetteActionPerformed(evt);
            }
        });

        titreDureeRecette.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        titreDureeRecette.setText("Durée : ");

        TableIngredientsRecette.setModel(new javax.swing.table.DefaultTableModel(
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
        TableIngredientsRecette.setFocusable(false);
        TableIngredientsRecette.setRowHeight(25);
        TableIngredientsRecette.setSelectionBackground(new java.awt.Color(232, 57, 95));
        TableIngredientsRecette.getTableHeader().setReorderingAllowed(false);
        TableIngredientsRecette.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableIngredientsRecetteMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(TableIngredientsRecette);

        boutonAjouter.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        boutonAjouter.setText("AJOUTER");
        boutonAjouter.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        boutonAjouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonAjouterActionPerformed(evt);
            }
        });

        titreNomRecette.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        titreNomRecette.setText("Nom :");

        addStockButton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        addStockButton.setText("AJOUTER AU STOCK");
        addStockButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addStockButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStockButtonActionPerformed(evt);
            }
        });

        titreRecette.setFont(new java.awt.Font("PCMyungjo", 0, 24)); // NOI18N
        titreRecette.setForeground(new java.awt.Color(255, 0, 0));
        titreRecette.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titreRecette.setText("RECETTE");

        titreTableIngredientsRecette.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        titreTableIngredientsRecette.setText("Liste d'ingrédients : ");

        javax.swing.GroupLayout pageAjouterRecetteLayout = new javax.swing.GroupLayout(pageAjouterRecette);
        pageAjouterRecette.setLayout(pageAjouterRecetteLayout);
        pageAjouterRecetteLayout.setHorizontalGroup(
            pageAjouterRecetteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pageAjouterRecetteLayout.createSequentialGroup()
                .addGap(244, 244, 244)
                .addComponent(titreDureeRecette)
                .addGap(63, 63, 63)
                .addComponent(dureeRecette, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pageAjouterRecetteLayout.createSequentialGroup()
                .addGroup(pageAjouterRecetteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pageAjouterRecetteLayout.createSequentialGroup()
                        .addGroup(pageAjouterRecetteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pageAjouterRecetteLayout.createSequentialGroup()
                                .addGap(255, 255, 255)
                                .addComponent(titreNomRecette)
                                .addGap(48, 48, 48)
                                .addComponent(nomRecette, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pageAjouterRecetteLayout.createSequentialGroup()
                                .addGap(374, 374, 374)
                                .addGroup(pageAjouterRecetteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(boutonAjouter)
                                    .addComponent(addStockButton))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pageAjouterRecetteLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(titreRecette, javax.swing.GroupLayout.PREFERRED_SIZE, 923, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pageAjouterRecetteLayout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(titreTableIngredientsRecette)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4)))
                .addContainerGap())
        );
        pageAjouterRecetteLayout.setVerticalGroup(
            pageAjouterRecetteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pageAjouterRecetteLayout.createSequentialGroup()
                .addComponent(titreRecette, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(pageAjouterRecetteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomRecette, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titreNomRecette, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(44, 44, 44)
                .addGroup(pageAjouterRecetteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dureeRecette, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titreDureeRecette, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pageAjouterRecetteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titreTableIngredientsRecette, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(97, 97, 97)
                .addComponent(boutonAjouter, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 235, Short.MAX_VALUE)
                .addComponent(addStockButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

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
        stockButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stockButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                stockButtonMouseEntered(evt);
            }
        });
        stockButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockButtonActionPerformed(evt);
            }
        });

        recetteButton.setBackground(new java.awt.Color(153, 204, 255));
        recetteButton.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        recetteButton.setText("Recette");
        recetteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                recetteButtonMouseClicked(evt);
            }
        });
        recetteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recetteButtonActionPerformed(evt);
            }
        });

        listButton.setBackground(new java.awt.Color(153, 204, 255));
        listButton.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        listButton.setText("Liste");
        listButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listButtonMouseClicked(evt);
            }
        });
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
                .addContainerGap()
                .addComponent(pageMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pageAjouterRecette, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(941, 941, 941))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pageMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pageAjouterRecette, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomRecetteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomRecetteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomRecetteActionPerformed

    private void dureeRecetteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dureeRecetteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dureeRecetteActionPerformed

    private void boutonAjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonAjouterActionPerformed
       /* String nom;
        String quantite;
        int quantiteint;
        
       

        /* On recupere le nom de l'objet */
        /* try {
            nom = nomRecette.getText();
            /*}
        catch(NumberFormatException ex){
            /* Erreur si c'est pas un String */
            /*}

        /* On recupere la quantite*/
        /*quantite = dureeRecette.getText();

        try{
            quantiteint = Integer.parseInt(dureeRecette.getText());
        }
        catch (NumberFormatException ex){
            ex.printStackTrace();
        }*/

        /* Il faut verifier si le nom correspond à un aliment dans la base de donnee */
        /* Il faut ensuite recuperer le moyen de stockage et l'unite de mesure de l'aliment */
        /* On peut ensuite l'ajouter aux stocks */

        /* Définition de l'aliment */

        /* Ajouter un élement à la liste */
        /*listeAliment.add(A);*/

        /* Ajout à la Table */
       /* String[] ligne = new String[] {nom, quantite, ddp};
        d.addRow(ligne);*/
    }//GEN-LAST:event_boutonAjouterActionPerformed

    private void addStockButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStockButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addStockButtonActionPerformed

    private void menuTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuTextMouseClicked
        Main.controller.ChangerPage("accueil", null, null, null);
        this.dispose();
    }//GEN-LAST:event_menuTextMouseClicked

    private void stockButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stockButtonMouseClicked
        //SUP
    }//GEN-LAST:event_stockButtonMouseClicked

    private void stockButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stockButtonMouseEntered
        //SUP
    }//GEN-LAST:event_stockButtonMouseEntered

    private void stockButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockButtonActionPerformed
        Main.controller.ChangerPage("menuStock", null, null, null);
        this.dispose();
    }//GEN-LAST:event_stockButtonActionPerformed

    private void recetteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recetteButtonMouseClicked
        //SUP
    }//GEN-LAST:event_recetteButtonMouseClicked

    private void recetteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recetteButtonActionPerformed
        Main.controller.ChangerPage("menuRecette", null, null, null);
        this.dispose();
    }//GEN-LAST:event_recetteButtonActionPerformed

    private void listButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listButtonMouseClicked
        //SUP
    }//GEN-LAST:event_listButtonMouseClicked

    private void listButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listButtonActionPerformed
        Main.controller.ChangerPage("menuListe", null, null, null);
        this.dispose();
    }//GEN-LAST:event_listButtonActionPerformed

    private void TableIngredientsRecetteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableIngredientsRecetteMouseClicked
       /* selectedRow = TableIngredientsRecette.getSelectedRow();*/
    }//GEN-LAST:event_TableIngredientsRecetteMouseClicked

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
            java.util.logging.Logger.getLogger(AjouterRecette.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AjouterRecette.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AjouterRecette.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AjouterRecette.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AjouterRecette().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableIngredientsRecette;
    private javax.swing.JButton addStockButton;
    private javax.swing.JButton boutonAjouter;
    private javax.swing.JTextField dureeRecette;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton listButton;
    private javax.swing.JLabel menuText;
    private javax.swing.JTextField nomRecette;
    private javax.swing.JPanel pageAjouterRecette;
    private javax.swing.JPanel pageMenu;
    private javax.swing.JButton recetteButton;
    private javax.swing.JButton stockButton;
    private javax.swing.JLabel titreDureeRecette;
    private javax.swing.JLabel titreNomRecette;
    private javax.swing.JLabel titreRecette;
    private javax.swing.JLabel titreTableIngredientsRecette;
    // End of variables declaration//GEN-END:variables
}
