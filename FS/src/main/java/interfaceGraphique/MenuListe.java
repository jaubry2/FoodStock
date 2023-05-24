/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.foodstock;

/**
 *
 * @author julesa
 */
public class MenuListe extends javax.swing.JFrame {
    /**
     * Creates new form MenuListe
     */
    public MenuListe() {
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

        menu3 = new javax.swing.JPanel();
        titreMenu3 = new javax.swing.JLabel();
        StockButton3 = new javax.swing.JButton();
        RecetteButton3 = new javax.swing.JButton();
        ListButton3 = new javax.swing.JButton();
        pageMenuListe = new javax.swing.JPanel();
        titreMenuListe = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableListe = new javax.swing.JTable();
        ajoutRecetteListe = new javax.swing.JPanel();
        titreAjoutRecetteListe = new javax.swing.JLabel();
        choixRecetteListe = new javax.swing.JTextField();
        ajoutRecetteListeButton = new javax.swing.JButton();
        ajoutAlimentListe = new javax.swing.JPanel();
        titreAjoutAlimentListe = new javax.swing.JLabel();
        choixAlimentListe = new javax.swing.JTextField();
        imprimerListeButton = new javax.swing.JButton();
        ajoutAlimentListeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menu3.setBackground(new java.awt.Color(153, 204, 255));
        menu3.setForeground(new java.awt.Color(51, 204, 255));

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
        StockButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StockButton3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                StockButton3MouseEntered(evt);
            }
        });
        StockButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StockButton3ActionPerformed(evt);
            }
        });

        RecetteButton3.setBackground(new java.awt.Color(153, 204, 255));
        RecetteButton3.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        RecetteButton3.setText("Recette");
        RecetteButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RecetteButton3MouseClicked(evt);
            }
        });
        RecetteButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecetteButton3ActionPerformed(evt);
            }
        });

        ListButton3.setBackground(new java.awt.Color(153, 204, 255));
        ListButton3.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        ListButton3.setText("Liste");
        ListButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListButton3MouseClicked(evt);
            }
        });
        ListButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menu3Layout = new javax.swing.GroupLayout(menu3);
        menu3.setLayout(menu3Layout);
        menu3Layout.setHorizontalGroup(
            menu3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menu3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(titreMenu3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ListButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RecetteButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                    .addComponent(StockButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        menu3Layout.setVerticalGroup(
            menu3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titreMenu3)
                .addGap(18, 18, 18)
                .addComponent(StockButton3)
                .addGap(18, 18, 18)
                .addComponent(RecetteButton3)
                .addGap(18, 18, 18)
                .addComponent(ListButton3)
                .addContainerGap(363, Short.MAX_VALUE))
        );

        pageMenuListe.setBackground(new java.awt.Color(255, 204, 204));

        titreMenuListe.setFont(new java.awt.Font("Liberation Sans", 0, 36)); // NOI18N
        titreMenuListe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titreMenuListe.setText("Listes de course");

        tableListe.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tableListe);

        ajoutRecetteListe.setBackground(new java.awt.Color(153, 204, 255));

        titreAjoutRecetteListe.setText("Ajouter une recette :");

        ajoutRecetteListeButton.setText("Ajouter");
        ajoutRecetteListeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajoutRecetteListeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ajoutRecetteListeLayout = new javax.swing.GroupLayout(ajoutRecetteListe);
        ajoutRecetteListe.setLayout(ajoutRecetteListeLayout);
        ajoutRecetteListeLayout.setHorizontalGroup(
            ajoutRecetteListeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ajoutRecetteListeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titreAjoutRecetteListe)
                .addGap(18, 18, 18)
                .addComponent(choixRecetteListe, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ajoutRecetteListeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        ajoutRecetteListeLayout.setVerticalGroup(
            ajoutRecetteListeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ajoutRecetteListeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ajoutRecetteListeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(choixRecetteListe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ajoutRecetteListeButton)
                    .addComponent(titreAjoutRecetteListe))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ajoutAlimentListe.setBackground(new java.awt.Color(153, 204, 255));

        titreAjoutAlimentListe.setText("Ajouter un aliment:");

        javax.swing.GroupLayout ajoutAlimentListeLayout = new javax.swing.GroupLayout(ajoutAlimentListe);
        ajoutAlimentListe.setLayout(ajoutAlimentListeLayout);
        ajoutAlimentListeLayout.setHorizontalGroup(
            ajoutAlimentListeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ajoutAlimentListeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titreAjoutAlimentListe)
                .addGap(18, 18, 18)
                .addComponent(choixAlimentListe, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(145, 145, 145))
        );
        ajoutAlimentListeLayout.setVerticalGroup(
            ajoutAlimentListeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ajoutAlimentListeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ajoutAlimentListeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(choixAlimentListe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titreAjoutAlimentListe))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        imprimerListeButton.setText("imprimer");
        imprimerListeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimerListeButtonActionPerformed(evt);
            }
        });

        ajoutAlimentListeButton.setText("Ajouter");
        ajoutAlimentListeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajoutAlimentListeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pageMenuListeLayout = new javax.swing.GroupLayout(pageMenuListe);
        pageMenuListe.setLayout(pageMenuListeLayout);
        pageMenuListeLayout.setHorizontalGroup(
            pageMenuListeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pageMenuListeLayout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 26, Short.MAX_VALUE))
            .addGroup(pageMenuListeLayout.createSequentialGroup()
                .addGroup(pageMenuListeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ajoutRecetteListe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pageMenuListeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(pageMenuListeLayout.createSequentialGroup()
                            .addGap(250, 250, 250)
                            .addComponent(titreMenuListe)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(imprimerListeButton))
                        .addGroup(pageMenuListeLayout.createSequentialGroup()
                            .addGap(571, 571, 571)
                            .addComponent(ajoutAlimentListeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pageMenuListeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pageMenuListeLayout.createSequentialGroup()
                    .addGap(140, 140, 140)
                    .addComponent(ajoutAlimentListe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(59, Short.MAX_VALUE)))
        );
        pageMenuListeLayout.setVerticalGroup(
            pageMenuListeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pageMenuListeLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(pageMenuListeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titreMenuListe)
                    .addComponent(imprimerListeButton))
                .addGap(28, 28, 28)
                .addComponent(ajoutAlimentListeButton)
                .addGap(30, 30, 30)
                .addComponent(ajoutRecetteListe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(pageMenuListeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pageMenuListeLayout.createSequentialGroup()
                    .addGap(81, 81, 81)
                    .addComponent(ajoutAlimentListe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(397, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menu3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pageMenuListe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 341, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pageMenuListe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void titreMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titreMenu3MouseClicked
        Main.controller.ChangerPage("accueil", null, null, null);
        this.dispose();
    }//GEN-LAST:event_titreMenu3MouseClicked

    private void StockButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StockButton3MouseClicked
        //SUP
    }//GEN-LAST:event_StockButton3MouseClicked

    private void StockButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StockButton3MouseEntered
        //SUP
    }//GEN-LAST:event_StockButton3MouseEntered

    private void StockButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StockButton3ActionPerformed
        Main.controller.ChangerPage("menuStock", null, null, null);
        this.dispose();
    }//GEN-LAST:event_StockButton3ActionPerformed

    private void RecetteButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RecetteButton3MouseClicked
        //SUP
    }//GEN-LAST:event_RecetteButton3MouseClicked

    private void RecetteButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecetteButton3ActionPerformed
        Main.controller.ChangerPage("menuRecette", null, null, null);
        this.dispose();
    }//GEN-LAST:event_RecetteButton3ActionPerformed

    private void ListButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListButton3MouseClicked
        //SUP
    }//GEN-LAST:event_ListButton3MouseClicked

    private void ListButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListButton3ActionPerformed
        Main.controller.ChangerPage("menuListe", null, null, null);
        this.dispose();
    }//GEN-LAST:event_ListButton3ActionPerformed

    private void ajoutRecetteListeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajoutRecetteListeButtonActionPerformed
        Main.controller.ChangerPage("ficheAliment", null, null, choixRecetteListe.getText());
        this.dispose();
    }//GEN-LAST:event_ajoutRecetteListeButtonActionPerformed

    private void ajoutAlimentListeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajoutAlimentListeButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ajoutAlimentListeButtonActionPerformed

    private void imprimerListeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimerListeButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imprimerListeButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MenuListe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuListe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuListe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuListe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuListe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ListButton3;
    private javax.swing.JButton RecetteButton3;
    private javax.swing.JButton StockButton3;
    private javax.swing.JPanel ajoutAlimentListe;
    private javax.swing.JButton ajoutAlimentListeButton;
    private javax.swing.JPanel ajoutRecetteListe;
    private javax.swing.JButton ajoutRecetteListeButton;
    private javax.swing.JTextField choixAlimentListe;
    private javax.swing.JTextField choixRecetteListe;
    private javax.swing.JButton imprimerListeButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel menu3;
    private javax.swing.JPanel pageMenuListe;
    private javax.swing.JTable tableListe;
    private javax.swing.JLabel titreAjoutAlimentListe;
    private javax.swing.JLabel titreAjoutRecetteListe;
    private javax.swing.JLabel titreMenu3;
    private javax.swing.JLabel titreMenuListe;
    // End of variables declaration//GEN-END:variables
}
