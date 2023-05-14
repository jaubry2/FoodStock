package interfaceGraphique ;

import java.util.List;

import javax.swing.table.DefaultTableModel;

import modeleDeDonnees.AlimentStockes;
import modeleDeDonnees.TypeAliment;

/**
 * @author julesa
 */
public class Accueil extends javax.swing.JFrame {
	/*
	 * Bouton Liste dans le menu
	 */
    private javax.swing.JButton ListButton3;
    /*
	 * Panel du menu
	 */
    private javax.swing.JPanel Menu3;
    /*
	 * Text Menu dans le menu
	 */
    private javax.swing.JLabel MenuText;
    /*
	 * Bouton Recette dans le menu
	 */
    private javax.swing.JButton RecetteButton3;
    /*
     * Bouton Stock dans le menu
     */
    private javax.swing.JButton StockButton3;
    /*
     * Nom de l'entreprise 
     */
    private javax.swing.JLabel CorpName;
    /*
     * Text au dessus de la table des aliments perimes
     */
    private javax.swing.JLabel textTablePerime;
    /*
     * 
     */
    private javax.swing.JMenu jMenu1;
    /*
     * Panel de la page d'accueil
     */
    private javax.swing.JPanel pageAccueil;
    /*
     * Table des aliments perime
     */
    private javax.swing.JScrollPane jScrollPane1;
    /*
     * Table des aliments perime
     */
    private javax.swing.JTable jTable1;
	/**
     * Creates new form Accueil
     */
    public Accueil() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    /*
     * Initialise tous nos composants
     */
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        Menu3 = new javax.swing.JPanel();
        MenuText = new javax.swing.JLabel();
        StockButton3 = new javax.swing.JButton();
        RecetteButton3 = new javax.swing.JButton();
        ListButton3 = new javax.swing.JButton();
        pageAccueil = new javax.swing.JPanel();
        CorpName = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        textTablePerime = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 255));
        setBounds(new java.awt.Rectangle(1020, 768, 1020, 768));
        setMaximumSize(new java.awt.Dimension(1020, 768));
        setMinimumSize(new java.awt.Dimension(1020, 768));
        setPreferredSize(new java.awt.Dimension(1020, 768));

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
                .addContainerGap(436, Short.MAX_VALUE))
        );

        pageAccueil.setBackground(new java.awt.Color(255, 204, 204));

        CorpName.setFont(new java.awt.Font("Helvetica Neue", 0, 48)); 
        CorpName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CorpName.setText("FOODSTOCK");

        /*jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));*/
        List<AlimentStockes> stock = Main.stocks.filtrerDate("principal",4);
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
        jScrollPane1.setViewportView(jTable1);

        textTablePerime.setText("Aliments bientôt périmés");

        javax.swing.GroupLayout pageAccueilLayout = new javax.swing.GroupLayout(pageAccueil);
        pageAccueil.setLayout(pageAccueilLayout);
        pageAccueilLayout.setHorizontalGroup(
            pageAccueilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CorpName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pageAccueilLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(pageAccueilLayout.createSequentialGroup()
                .addGap(358, 358, 358)
                .addComponent(textTablePerime)
                .addContainerGap(365, Short.MAX_VALUE))
        );
        pageAccueilLayout.setVerticalGroup(
            pageAccueilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pageAccueilLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CorpName)
                .addGap(29, 29, 29)
                .addComponent(textTablePerime)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Menu3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pageAccueil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Menu3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pageAccueil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
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
            java.util.logging.Logger.getLogger(Accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Creer et affiche la page */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Accueil().setVisible(true);
            }
        });
    }
}
