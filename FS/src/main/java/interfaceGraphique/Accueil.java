package interfaceGraphique ;

import java.util.List;

import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

import modeleDeDonnees.AlimentStockes;
import modeleDeDonnees.TypeAliment;

/**
 * @author julesa
 */
public class Accueil extends javax.swing.JFrame {
    /**
     * Bouton dans le menu de navigation qui redirige vers la page Liste 
     */
    private javax.swing.JButton ListButton;
    /**
     * Bouton dans le menu de navigation qui redirige vers la page Recette 
     */
    private javax.swing.JButton RecetteButton;
    /**
     * Bouton dans le menu de navigation qui redirige vers la page Stock 
     */
    private javax.swing.JButton StockButton;
    /**
     * Panel du menu de navigation à gauche
     */
    private javax.swing.JPanel PageMenu;
    /**
     * Panel de la page d'accueil à droite
     */
    private javax.swing.JPanel PageAccueil;
    /**
     * Text du menu dans le menu de navigation
     */
    private javax.swing.JLabel MenuText;
    /**
     * Nom de l'application sur la page
     */
    private javax.swing.JLabel CorpNameText;
    /**
     * Text au dessus de la table des aliments bientôt perimes
     */
    private javax.swing.JLabel TablePerimeText;
    /**
     * 
     */
    private javax.swing.JMenu jMenu1;
    /**
     * Scroll Pane des aliments perimes
     */
    private javax.swing.JScrollPane ScrollPaneAlimentPerime;
    /**
     * Table ou l'on affiche les aliments bientot perimes
     */
    private javax.swing.JTable TableAlimentPerime;
    /**
     * Creer une nouvelle forme d'accueil
     */
    public Accueil() {
        initComponents();
        this.addWindowListener(new FermetureFenetre());
    }

    /*
     * Initialise tous nos composants et notre page
     */
    private void initComponents() {
    	JPanel PanelTout = new JPanel();
    	
        jMenu1 = new javax.swing.JMenu();
        PageMenu = new javax.swing.JPanel();
        MenuText = new javax.swing.JLabel();
        StockButton = new javax.swing.JButton();
        RecetteButton = new javax.swing.JButton();
        ListButton = new javax.swing.JButton();
        PageAccueil = new javax.swing.JPanel();
        CorpNameText = new javax.swing.JLabel();
        ScrollPaneAlimentPerime = new javax.swing.JScrollPane();
        TableAlimentPerime = new javax.swing.JTable();
        TablePerimeText = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        /*
         * On set l'endroit ou se situe la page a l'ouverture
         */
        setLocationRelativeTo(null);  
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        /*
         * On set la couleur de la page
         */
        setBackground(new java.awt.Color(153, 153, 255));
        /*
         * On set la taille maximale
         */
        setMaximumSize(new java.awt.Dimension(1020, 768));
        /*
         * On set la taille minimale
         */
        setMinimumSize(new java.awt.Dimension(1020, 768));
        /*
         * On set la taille recommande
         */
        setPreferredSize(new java.awt.Dimension(1020, 768));

        /*
         * On set les  couleurs de la page menu
         */
        PageMenu.setBackground(new java.awt.Color(153, 204, 255));
        PageMenu.setForeground(new java.awt.Color(51, 204, 255));

        /*
         * On set Le text menu avec sa police, son alignement, text , etc …
         */
        MenuText.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); 
        MenuText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MenuText.setText("MENU");
        MenuText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuTextMouseClicked(evt);
            }
        });

        /*
         * On set les caracteristiques du bouton stock et les action listener
         */
        StockButton.setBackground(new java.awt.Color(153, 204, 255));
        StockButton.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); 
        StockButton.setText("Stock");
        StockButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StockButtonActionPerformed(evt);
            }
        });

        /*
         * On set les caracteristiques du bouton recette et les action listener
         */
        RecetteButton.setBackground(new java.awt.Color(153, 204, 255));
        RecetteButton.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); 
        RecetteButton.setText("Recette");
        RecetteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecetteButtonActionPerformed(evt);
            }
        });

        /*
         * On set les caracteristiques du bouton liste et les action listener
         */
        ListButton.setBackground(new java.awt.Color(153, 204, 255));
        ListButton.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); 
        ListButton.setText("Liste");
        ListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PageMenuLayout = new javax.swing.GroupLayout(PageMenu);
        PageMenu.setLayout(PageMenuLayout);
        PageMenuLayout.setHorizontalGroup(
            PageMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PageMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PageMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(MenuText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ListButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RecetteButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                    .addComponent(StockButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        PageMenuLayout.setVerticalGroup(
            PageMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PageMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MenuText)
                .addGap(18, 18, 18)
                .addComponent(StockButton)
                .addGap(18, 18, 18)
                .addComponent(RecetteButton)
                .addGap(18, 18, 18)
                .addComponent(ListButton)
                .addContainerGap(436, Short.MAX_VALUE))
        );

        PageAccueil.setBackground(new java.awt.Color(255, 204, 204));

        CorpNameText.setFont(new java.awt.Font("Helvetica Neue", 0, 48)); 
        CorpNameText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CorpNameText.setText("FOODSTOCK");

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
        TableAlimentPerime.setModel(model);
        ScrollPaneAlimentPerime.setViewportView(TableAlimentPerime);

        TablePerimeText.setText("Aliments bientôt périmés");

        javax.swing.GroupLayout PageAccueilLayout = new javax.swing.GroupLayout(PageAccueil);
        PageAccueil.setLayout(PageAccueilLayout);
        PageAccueilLayout.setHorizontalGroup(
            PageAccueilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CorpNameText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PageAccueilLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ScrollPaneAlimentPerime)
                .addContainerGap())
            .addGroup(PageAccueilLayout.createSequentialGroup()
                .addGap(358, 358, 358)
                .addComponent(TablePerimeText)
                .addContainerGap(365, Short.MAX_VALUE))
        );
        PageAccueilLayout.setVerticalGroup(
            PageAccueilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PageAccueilLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CorpNameText)
                .addGap(29, 29, 29)
                .addComponent(TablePerimeText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ScrollPaneAlimentPerime, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PageMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PageAccueil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PageMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PageAccueil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }
    /**
    * Permet d'ouvrir le menu stock
    * @param evt Click sur le bouton Stock
    */
    private void StockButtonActionPerformed(java.awt.event.ActionEvent evt) {
    	/*remove(panelTout);*/
        /* Main.controller.ChangerPage("menuStock", null, null, null);
        this.dispose();
        */
        MenuStock newPage = new MenuStock();
		newPage.setVisible(true);
        this.dispose();
    }
    /**
    * Permet d'ouvrir le menu recette
    * @param evt Click sur le bouton Recette
    */
    private void RecetteButtonActionPerformed(java.awt.event.ActionEvent evt) {
        MenuRecette newPage = new MenuRecette();
		newPage.setVisible(true);
        this.dispose();
    }
    /**
     * Permet d'ouvrir le menu liste
     * @param evt Click sur le bouton Liste
     */
    private void ListButtonActionPerformed(java.awt.event.ActionEvent evt) {
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

        /* Cree et affiche une nouvelle page */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Accueil().setVisible(true);
            }
        });
    }
}
