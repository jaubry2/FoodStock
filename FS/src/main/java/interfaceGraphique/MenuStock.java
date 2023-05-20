package interfaceGraphique ;

import java.util.List;

import javax.swing.table.DefaultTableModel;

import modeleDeDonnees.AlimentStockes;
import modeleDeDonnees.Stock;
import modeleDeDonnees.TypeAliment;

/**
 *
 * @author julesa
 */
public class MenuStock extends javax.swing.JFrame {
    /**
     * Bouton de filtre pour le type aliment : boissons
     */
    private javax.swing.JButton boissonsButton;
    /**
     * Bouton de filtre pour le type aliment : cereale
     */
    private javax.swing.JButton cerealesButton;
    /**
     * Bouton de filtre pour le type aliment : fruit/legume
     */
    private javax.swing.JButton fruitLegumeButton;
    /**
     * Bouton de filtre pour le type aliment : produits laitiers
     */
    private javax.swing.JButton produitsLaitiersButton;
    /**
     * Bouton de filtre pour le type aliment : snacks
     */
    private javax.swing.JButton snacksButton;
    /**
     * Bouton de filtre pour le type aliment : surgele
     */
    private javax.swing.JButton surgelesButton;
    /**
     * Bouton de filtre pour le type aliment : viande/poisson
     */
    private javax.swing.JButton viandePoissonButton;
    /**
     * Bouton de reinitialisation des filtres
     */
    private javax.swing.JButton reinitialiserButton;
    /**
     * Bouton dans le menu de navigation qui redirige vers la page Recette 
     */
    private javax.swing.JButton recetteButton;
    /**
     * Bouton dans le menu de navigation qui redirige vers la page Stock 
     */
    private javax.swing.JButton stockButton;
    /**
     * Bouton dans le menu de navigation qui redirige vers la page Liste 
     */
    private javax.swing.JButton listButton;
    /**
     * Bouton qui permet d'ouvrir la page ajouter aliment
     */
    private javax.swing.JButton addButton;
    /**
     * Bouton qui permet d'ouvrir la fiche d'un aliment
     */
    private javax.swing.JButton ficheAlimentButton;
    /**
     * JtextField pour l'aliment ou l'on veut des informations
     */
    private javax.swing.JTextField alimentChosi;
    /**
     * 
     */
    private javax.swing.JPanel pageStock;
    /**
     * Panel du menu de navigation a gauche
     */
    private javax.swing.JPanel Menu;
    /**
     * Text du menu dans le menu de navigation
     */
    private javax.swing.JLabel menuText;
    /**
     * Text Stock en haut de la page
     */
    private javax.swing.JLabel stockText;
    /**
     * ScrollPane du stock
     */
    private javax.swing.JScrollPane jScrollPane1;
    /**
     * Table affichant le stock
     */
    private javax.swing.JTable jTable1;

    /**
     * Cree une nouvelle page MenuStock
     */
    public MenuStock() {
        initComponents();
        this.addWindowListener(new FermetureFenetre());

    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        Menu = new javax.swing.JPanel();
        menuText = new javax.swing.JLabel();
        stockButton = new javax.swing.JButton();
        recetteButton = new javax.swing.JButton();
        listButton = new javax.swing.JButton();
        pageStock = new javax.swing.JPanel();
        addButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        ficheAlimentButton = new javax.swing.JButton();
        stockText = new javax.swing.JLabel();
        alimentChosi = new javax.swing.JTextField();
        fruitLegumeButton = new javax.swing.JButton();
        viandePoissonButton = new javax.swing.JButton();
        produitsLaitiersButton = new javax.swing.JButton();
        surgelesButton = new javax.swing.JButton();
        snacksButton = new javax.swing.JButton();
        boissonsButton = new javax.swing.JButton();
        cerealesButton = new javax.swing.JButton();
        reinitialiserButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);  
        setBackground(new java.awt.Color(255, 153, 153));
        setMaximumSize(new java.awt.Dimension(1020, 768));
        setMinimumSize(new java.awt.Dimension(1020, 768));
        setPreferredSize(new java.awt.Dimension(1020, 768));

        Menu.setBackground(new java.awt.Color(153, 204, 255));
        Menu.setForeground(new java.awt.Color(51, 204, 255));

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

        javax.swing.GroupLayout MenuLayout = new javax.swing.GroupLayout(Menu);
        Menu.setLayout(MenuLayout);
        MenuLayout.setHorizontalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(menuText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(listButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(recetteButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                    .addComponent(stockButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        MenuLayout.setVerticalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
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

        pageStock.setBackground(new java.awt.Color(255, 204, 204));

        addButton.setText("AJOUTER");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
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

        jScrollPane1.setViewportView(jTable1);

        ficheAlimentButton.setText("Rechercher");
        ficheAlimentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ficheAlimentButtonActionPerformed(evt);
            }
        });

        stockText.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        stockText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stockText.setText("STOCK");

        fruitLegumeButton.setText("Fruits/Legumes");
        fruitLegumeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fruitLegumeButtonActionPerformed(evt);
            }
        });

        viandePoissonButton.setText("Viande/Poisson");
        viandePoissonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viandePoissonButtonActionPerformed(evt);
            }
        });

        produitsLaitiersButton.setText("ProduitsLaitiers");
        produitsLaitiersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produitsLaitiersButtonActionPerformed(evt);
            }
        });

        surgelesButton.setText("Surgeles");
        surgelesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                surgelesButtonActionPerformed(evt);
            }
        });

        snacksButton.setText("Snacks");
        snacksButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snacksButtonActionPerformed(evt);
            }
        });

        boissonsButton.setText("Boissons");
        boissonsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boissonsButtonActionPerformed(evt);
            }
        });

        cerealesButton.setText("Céreales");
        cerealesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerealesButtonActionPerformed(evt);
            }
        });

        reinitialiserButton.setText("Réinitialiser");
        reinitialiserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reinitialiserButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pageStockLayout = new javax.swing.GroupLayout(pageStock);
        pageStock.setLayout(pageStockLayout);
        pageStockLayout.setHorizontalGroup(
            pageStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pageStockLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(pageStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pageStockLayout.createSequentialGroup()
                        .addComponent(addButton)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pageStockLayout.createSequentialGroup()
                        .addGroup(pageStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pageStockLayout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addGroup(pageStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(fruitLegumeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cerealesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(91, 91, 91)
                                .addGroup(pageStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(viandePoissonButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(snacksButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(surgelesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(pageStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pageStockLayout.createSequentialGroup()
                                        .addGap(99, 99, 99)
                                        .addGroup(pageStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(produitsLaitiersButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(boissonsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pageStockLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(reinitialiserButton))))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 714, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28))))
            .addGroup(pageStockLayout.createSequentialGroup()
                .addGroup(pageStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pageStockLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(stockText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pageStockLayout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(alimentChosi, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(ficheAlimentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pageStockLayout.setVerticalGroup(
            pageStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pageStockLayout.createSequentialGroup()
                .addGroup(pageStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pageStockLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(stockText, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(pageStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(alimentChosi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ficheAlimentButton)))
                    .addGroup(pageStockLayout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addGroup(pageStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fruitLegumeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(viandePoissonButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(produitsLaitiersButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pageStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(surgelesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cerealesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boissonsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pageStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(snacksButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reinitialiserButton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(addButton)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pageStock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pageStock, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
    /**
     * Permet d'ouvrir la page d'ajout d'aliment
     * @param evt Click sur le bouton AJOUTER
     */
    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {
        AjouterAliment mA = new AjouterAliment();
        mA.setVisible(true);
        this.dispose();
    }
    /**
     * Permet de trier et d'afficher les fruits et legumes
     * @param evt Click sur le bouton Fruits/Legumes
     */
    private void fruitLegumeButtonActionPerformed(java.awt.event.ActionEvent evt) {
        TypeAliment tA = TypeAliment.Fruits_Legumes;
        List<AlimentStockes> stock = Main.stocks.filtrerType("principal", tA);
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
    }
    /**
     * Permet de trier et d'afficher les fruits et legumes
     * @param evt Click sur le bouton Fruits/Legumes
     */
    private void boissonsButtonActionPerformed(java.awt.event.ActionEvent evt) {
        TypeAliment tA = TypeAliment.Boissons;
        List<AlimentStockes> stock = Main.stocks.filtrerType("principal", tA);
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
    }
    /**
     * Permet de trier et d'afficher les cereales
     * @param evt Click sur le bouton Cereales
     */
    private void cerealesButtonActionPerformed(java.awt.event.ActionEvent evt) {
        TypeAliment tA = TypeAliment.Céreales;
        List<AlimentStockes> stock = Main.stocks.filtrerType("principal", tA);
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
    }
    /**
     * Permet de trier et d'afficher les produits laitiers
     * @param evt Click sur le bouton Produits Laitiers
     */
    private void produitsLaitiersButtonActionPerformed(java.awt.event.ActionEvent evt) {
        TypeAliment tA = TypeAliment.ProduitsLaitiers;
        List<AlimentStockes> stock = Main.stocks.filtrerType("principal", tA);
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
    }
    /**
     * Permet de trier et d'afficher les snacks
     * @param evt Click sur le bouton Snacks
     */
    private void snacksButtonActionPerformed(java.awt.event.ActionEvent evt) {
        TypeAliment tA = TypeAliment.Snacks;
        List<AlimentStockes> stock = Main.stocks.filtrerType("principal", tA);
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
    }
    /**
     * Permet de trier et d'afficher les surgeles
     * @param evt Click sur le bouton Surgeles
     */
    private void surgelesButtonActionPerformed(java.awt.event.ActionEvent evt) {
        TypeAliment tA = TypeAliment.Surgeles;
        List<AlimentStockes> stock = Main.stocks.filtrerType("principal", tA);
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
    }
    /**
     * Permet de trier et d'afficher les viandes et possions
     * @param evt Click sur le bouton Viande/Poisson
     */
    private void viandePoissonButtonActionPerformed(java.awt.event.ActionEvent evt) {
        TypeAliment tA = TypeAliment.Viande_Poisson;
        List<AlimentStockes> stock = Main.stocks.filtrerType("principal", tA);
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
    }
    /**
     * Permet de reinitialiser la table stock
     * @param evt Click sur le bouton Reinitialiser
     */
    private void reinitialiserButtonActionPerformed(java.awt.event.ActionEvent evt) {
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
    }
    
    private void ficheAlimentButtonActionPerformed(java.awt.event.ActionEvent evt) { 
        String nom = alimentChosi.getText();
        String qte = "";
        String typeAliment = "";
        String moyenDeStockage = "";
        String dateDePeremption = "";
        FicheAliment mF = new FicheAliment(nom, qte, typeAliment, moyenDeStockage, dateDePeremption);
        mF.setVisible(true);
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

        /* Cree et affiche une nouvelle page */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {        
                new MenuStock().setVisible(true);
            }
        });
    }
}
