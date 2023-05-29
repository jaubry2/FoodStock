package interfaceGraphique ;

import java.util.List;

import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

import modeleDeDonnees.AlimentStockes;
import modeleDeDonnees.ControllerListeCourse;
import modeleDeDonnees.TypeAliment;

/**
 * @author julesa
 */
public class Accueil extends javax.swing.JFrame {
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
     * Panel du menu de navigation à gauche
     */
    private javax.swing.JPanel pageMenu;
    /**
     * Panel de la page d'accueil à droite
     */
    private javax.swing.JPanel pageAccueil;
    /**
     * Text du menu dans le menu de navigation
     */
    private javax.swing.JLabel menuText;
    /**
     * Nom de l'application sur la page
     */
    private javax.swing.JLabel corpNameText;
    /**
     * Text au dessus de la table des aliments bientôt perimes
     */
    private javax.swing.JLabel tablePerimeText;
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
    private javax.swing.JTable tableAlimentPerime;
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
        pageMenu = new javax.swing.JPanel();
        menuText = new javax.swing.JLabel();
        stockButton = new javax.swing.JButton();
        recetteButton = new javax.swing.JButton();
        listButton = new javax.swing.JButton();
        pageAccueil = new javax.swing.JPanel();
        corpNameText = new javax.swing.JLabel();
        ScrollPaneAlimentPerime = new javax.swing.JScrollPane();
        tableAlimentPerime = new javax.swing.JTable();
        tablePerimeText = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");


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
         * On set l'endroit ou se situe la page a l'ouverture
         */
        setLocationRelativeTo(null);  

        /*
         * On set les  couleurs de la page menu
         */
        pageMenu.setBackground(new java.awt.Color(153, 204, 255));
        pageMenu.setForeground(new java.awt.Color(51, 204, 255));

        /*
         * On set Le text menu avec sa police, son alignement, text , etc …
         */
        menuText.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); 
        menuText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuText.setText("MENU");
        menuText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuTextMouseClicked(evt);
            }
        });

        /*
         * On set les caracteristiques du bouton stock et les action listener
         */
        stockButton.setBackground(new java.awt.Color(153, 204, 255));
        stockButton.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); 
        stockButton.setText("Stock");
        stockButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockButtonActionPerformed(evt);
            }
        });

        /*
         * On set les caracteristiques du bouton recette et les action listener
         */
        recetteButton.setBackground(new java.awt.Color(153, 204, 255));
        recetteButton.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); 
        recetteButton.setText("Recette");
        recetteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recetteButtonActionPerformed(evt);
            }
        });

        /*
         * On set les caracteristiques du bouton liste et les action listener
         */
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
                .addContainerGap(436, Short.MAX_VALUE))
        );

        pageAccueil.setBackground(new java.awt.Color(255, 204, 204));

        corpNameText.setFont(new java.awt.Font("Helvetica Neue", 0, 48)); 
        corpNameText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        corpNameText.setText("FOODSTOCK");
        setResizable(false);
        
        tableAlimentPerime.setModel(Main.controller.afficherStockFiltre(4));
        ScrollPaneAlimentPerime.setViewportView(tableAlimentPerime);

        tablePerimeText.setText("Aliments bientôt périmés");

        javax.swing.GroupLayout pageAccueilLayout = new javax.swing.GroupLayout(pageAccueil);
        pageAccueil.setLayout(pageAccueilLayout);
        pageAccueilLayout.setHorizontalGroup(
            pageAccueilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(corpNameText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pageAccueilLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ScrollPaneAlimentPerime, javax.swing.GroupLayout.DEFAULT_SIZE, 889, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pageAccueilLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tablePerimeText)
                .addGap(367, 367, 367))
        );
        pageAccueilLayout.setVerticalGroup(
            pageAccueilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pageAccueilLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(corpNameText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tablePerimeText, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ScrollPaneAlimentPerime, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pageMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pageAccueil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pageMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pageAccueil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }
    /**
    * Permet d'ouvrir le menu stock
    * @param evt Click sur le bouton Stock
    */
    private void stockButtonActionPerformed(java.awt.event.ActionEvent evt) {
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
        ControllerListeCourse cLdC = new ControllerListeCourse(Main.listeCourse ,(MenuListe) newPage);
		newPage.setVisible(true);*/
        Main.controller.ChangerPage("menuListe", null, null, null);
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