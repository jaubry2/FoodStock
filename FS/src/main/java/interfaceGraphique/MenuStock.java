/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaceGraphique ;

import java.util.List;

import javax.swing.table.DefaultTableModel;

import modeleDeDonnees.AlimentStockes;

/**
 *
 * @author julesa
 */
public class MenuStock extends javax.swing.JFrame {
    private javax.swing.JButton AddButton;
    private javax.swing.JTextField AlimentChosi;
    private javax.swing.JButton FicheAlimentButton;
    private javax.swing.JPanel JPanel;
    private javax.swing.JButton ListButton;
    private javax.swing.JPanel Menu;
    private javax.swing.JLabel MenuText;
    private javax.swing.JButton RecetteButton;
    private javax.swing.JButton StockButton;
    private javax.swing.JToggleButton Viande;
    private javax.swing.JToggleButton Viande1;
    private javax.swing.JToggleButton Viande2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    
    /**
     * Creates new form MenuStock
     */
    public MenuStock() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    /*
     * Initialise tous les comoosants
     */
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Menu = new javax.swing.JPanel();
        MenuText = new javax.swing.JLabel();
        StockButton = new javax.swing.JButton();
        RecetteButton = new javax.swing.JButton();
        ListButton = new javax.swing.JButton();
        JPanel = new javax.swing.JPanel();
        AddButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        FicheAlimentButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Viande = new javax.swing.JToggleButton();
        Viande1 = new javax.swing.JToggleButton();
        Viande2 = new javax.swing.JToggleButton();
        AlimentChosi = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); 
        jLabel1.setText("MENU");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 153, 153));
        setMaximumSize(new java.awt.Dimension(1020, 768));
        setMinimumSize(new java.awt.Dimension(1020, 768));
        setPreferredSize(new java.awt.Dimension(1020, 768));

        Menu.setBackground(new java.awt.Color(153, 204, 255));
        Menu.setForeground(new java.awt.Color(51, 204, 255));

        MenuText.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); 
        MenuText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MenuText.setText("MENU");
        MenuText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuTextMouseClicked(evt);
            }
        });

        StockButton.setBackground(new java.awt.Color(153, 204, 255));
        StockButton.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); 
        StockButton.setText("Stock");
        StockButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StockButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                StockButtonMouseEntered(evt);
            }
        });
        StockButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StockButtonActionPerformed(evt);
            }
        });

        RecetteButton.setBackground(new java.awt.Color(153, 204, 255));
        RecetteButton.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); 
        RecetteButton.setText("Recette");
        RecetteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RecetteButtonMouseClicked(evt);
            }
        });
        RecetteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecetteButtonActionPerformed(evt);
            }
        });

        ListButton.setBackground(new java.awt.Color(153, 204, 255));
        ListButton.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); 
        ListButton.setText("Liste");
        ListButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListButtonMouseClicked(evt);
            }
        });
        ListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MenuLayout = new javax.swing.GroupLayout(Menu);
        Menu.setLayout(MenuLayout);
        MenuLayout.setHorizontalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(MenuText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ListButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RecetteButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                    .addComponent(StockButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        MenuLayout.setVerticalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MenuText)
                .addGap(18, 18, 18)
                .addComponent(StockButton)
                .addGap(18, 18, 18)
                .addComponent(RecetteButton)
                .addGap(18, 18, 18)
                .addComponent(ListButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JPanel.setBackground(new java.awt.Color(255, 204, 204));

        AddButton.setText("AJOUTER");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });
        List<AlimentStockes> stock = Main.stocks.getListFromMap("principal");
        Object[][] data = new Object[stock.size()][4];
        for (int i = 0; i < stock.size(); i++) {
            AlimentStockes alimentStocke = stock.get(i);
            data[i][0] = alimentStocke.getAliment().getNom();
            data[i][1] = alimentStocke.getDatePeremption();
            data[i][2] = alimentStocke.getQuantite();
            data[i][3] = alimentStocke.getAliment().getTypeAliment();
        }
        String[] columnNames = {"Aliment", "Date de Péremption", "Quantité", "Type"};
        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        jTable1.setModel(model);
        /*jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Aliment", "Date de Péremption", "Quantité", "Type"
            }
        ));*/

        jScrollPane1.setViewportView(jTable1);

        FicheAlimentButton.setText("Rechercher");
        FicheAlimentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FicheAlimentButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); 
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("STOCK");

        Viande.setText("Viande");

        Viande1.setText("Légumes");
        Viande1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Viande1ActionPerformed(evt);
            }
        });

        Viande2.setText("Fruit");
        Viande2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Viande2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPanelLayout = new javax.swing.GroupLayout(JPanel);
        JPanel.setLayout(JPanelLayout);
        JPanelLayout.setHorizontalGroup(
            JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelLayout.createSequentialGroup()
                        .addComponent(AddButton)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 714, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))))
            .addGroup(JPanelLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(Viande)
                .addGap(18, 18, 18)
                .addComponent(Viande1)
                .addGap(18, 18, 18)
                .addComponent(Viande2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(JPanelLayout.createSequentialGroup()
                .addGap(215, 215, 215)
                .addComponent(AlimentChosi, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(FicheAlimentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JPanelLayout.setVerticalGroup(
            JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AlimentChosi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FicheAlimentButton))
                .addGap(71, 71, 71)
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Viande, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Viande1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Viande2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(AddButton)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(JPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }
    /**
    * Permet d'ouvrir le menu stock
    * @param evt Click sur le bouton Stock
    */
    private void StockButtonActionPerformed(java.awt.event.ActionEvent evt) {
        Main.controller.ChangerPage("menuStock", null, null, null);
        this.dispose();
    }
    /**
    * Permet d'ouvrir le menu recette
    * @param evt Click sur le bouton Recette
    */
    private void RecetteButtonActionPerformed(java.awt.event.ActionEvent evt) {
        Main.controller.ChangerPage("menuRecette", null, null, null);
        this.dispose();
    }
    /**
     * Permet d'ouvrir le menu liste
     * @param evt Click sur le bouton Liste
     */
    private void ListButtonActionPerformed(java.awt.event.ActionEvent evt) {
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

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {
        Main.controller.ChangerPage("ajouterAliment", null, null, null);
        this.dispose();
    }

    private void Viande1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void Viande2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void FicheAlimentButtonActionPerformed(java.awt.event.ActionEvent evt) {
    	Main.controller.ChangerPage("ficheAliment", null, null, null);
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
            java.util.logging.Logger.getLogger(MenuStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {        
                new MenuStock().setVisible(true);
            }
        });
    }
}
