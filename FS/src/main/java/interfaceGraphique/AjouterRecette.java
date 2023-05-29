package interfaceGraphique;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author idruote
 */
public class AjouterRecette extends javax.swing.JFrame {
    /**
     * Default table model aliment
     */
    private DefaultTableModel dTMAliment;
    /**
     * Ligne selcetionne dans la table
     */
    private int selectedRow;
    /**
     * Table ingredient recette
     */
    private javax.swing.JTable TableIngredientsRecette;
    /**
     * Bouton ajouter au livre de recette
     */
    private javax.swing.JButton addLivreButton;
    /**
     * Bouton ajouter ingrédient a la table
     */
    private javax.swing.JButton boutonAjouter;
    /**
     * Bouton supprimer de la table
     */
    private javax.swing.JButton boutonSupprimer;
    private javax.swing.JTextField dureeRecette;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton listButton;
    private javax.swing.JLabel menuText;
    private javax.swing.JLabel nomIngredientText;
    private javax.swing.JTextField nomIngredientTextField;
    private javax.swing.JTextField nomRecette;
    private javax.swing.JPanel nomTextField;
    private javax.swing.JPanel pageMenu;
    private javax.swing.JLabel qteIngredientText;
    private javax.swing.JTextField qteTextField;
    private javax.swing.JButton recetteButton;
    private javax.swing.JButton stockButton;
    private javax.swing.JLabel titreDureeRecette;
    private javax.swing.JLabel titreNomRecette;
    private javax.swing.JLabel titreRecette;
    private javax.swing.JLabel titreTableIngredientsRecette;
    /**
     * Creates new form AjouterRecette
     */    
    public AjouterRecette() {
        dTMAliment = new DefaultTableModel();
    	dTMAliment.addColumn("Nom");
    	dTMAliment.addColumn("Quantite");
        initComponents();
    }
    @SuppressWarnings("unchecked")                      
    private void initComponents() {

        nomTextField = new javax.swing.JPanel();
        nomRecette = new javax.swing.JTextField();
        dureeRecette = new javax.swing.JTextField();
        titreDureeRecette = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        TableIngredientsRecette = new javax.swing.JTable();
        boutonAjouter = new javax.swing.JButton();
        titreNomRecette = new javax.swing.JLabel();
        addLivreButton = new javax.swing.JButton();
        titreRecette = new javax.swing.JLabel();
        titreTableIngredientsRecette = new javax.swing.JLabel();
        nomIngredientTextField = new javax.swing.JTextField();
        qteTextField = new javax.swing.JTextField();
        nomIngredientText = new javax.swing.JLabel();
        qteIngredientText = new javax.swing.JLabel();
        boutonSupprimer = new javax.swing.JButton();
        pageMenu = new javax.swing.JPanel();
        menuText = new javax.swing.JLabel();
        stockButton = new javax.swing.JButton();
        recetteButton = new javax.swing.JButton();
        listButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1020, 768));
        setMinimumSize(new java.awt.Dimension(1020, 768));
        setPreferredSize(new java.awt.Dimension(1020, 768));
        setSize(new java.awt.Dimension(1020, 768));
        setLocationRelativeTo(null); 


        nomTextField.setBackground(new java.awt.Color(255, 204, 204));

        nomRecette.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); 
        nomRecette.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        dureeRecette.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); 
        dureeRecette.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        titreDureeRecette.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        titreDureeRecette.setText("Durée : ");

        TableIngredientsRecette.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nom", "Qte"
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

        boutonAjouter.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); 
        boutonAjouter.setText("AJOUTER INGRÉDIENT");
        boutonAjouter.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        boutonAjouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonAjouterActionPerformed(evt);
            }
        });

        titreNomRecette.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        titreNomRecette.setText("Nom :");

        addLivreButton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); 
        addLivreButton.setText("AJOUTER AU LIVRE DE RECETTE");
        addLivreButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addLivreButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addLivreButtonActionPerformed(evt);
            }
        });

        titreRecette.setFont(new java.awt.Font("PCMyungjo", 0, 24));
        titreRecette.setForeground(new java.awt.Color(255, 0, 0));
        titreRecette.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titreRecette.setText("RECETTE");

        titreTableIngredientsRecette.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        titreTableIngredientsRecette.setText("Liste d'ingrédients : ");

        nomIngredientTextField.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); 
        nomIngredientTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        qteTextField.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); 
        qteTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        nomIngredientText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        nomIngredientText.setText("Nom de l'ingrédient :");

        qteIngredientText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        qteIngredientText.setText("Quantité de l'ingrédient :");

        boutonSupprimer.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); 
        boutonSupprimer.setText("SUPPRIMER INGRÉDIENT");
        boutonSupprimer.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        boutonSupprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonSupprimerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout nomTextFieldLayout = new javax.swing.GroupLayout(nomTextField);
        nomTextField.setLayout(nomTextFieldLayout);
        nomTextFieldLayout.setHorizontalGroup(
            nomTextFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nomTextFieldLayout.createSequentialGroup()
                .addGroup(nomTextFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(nomTextFieldLayout.createSequentialGroup()
                        .addGap(0, 6, Short.MAX_VALUE)
                        .addComponent(titreRecette, javax.swing.GroupLayout.PREFERRED_SIZE, 923, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(nomTextFieldLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(titreTableIngredientsRecette)
                        .addGap(18, 18, 18)
                        .addGroup(nomTextFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(nomTextFieldLayout.createSequentialGroup()
                                .addComponent(nomIngredientTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76)
                                .addComponent(qteTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(nomTextFieldLayout.createSequentialGroup()
                                .addGap(124, 124, 124)
                                .addComponent(boutonAjouter)
                                .addGap(18, 18, 18)
                                .addComponent(boutonSupprimer)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(nomTextFieldLayout.createSequentialGroup()
                .addGap(283, 283, 283)
                .addGroup(nomTextFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(nomTextFieldLayout.createSequentialGroup()
                        .addGroup(nomTextFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(nomTextFieldLayout.createSequentialGroup()
                                .addComponent(titreDureeRecette)
                                .addGap(63, 63, 63)
                                .addComponent(dureeRecette, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(nomTextFieldLayout.createSequentialGroup()
                                .addComponent(titreNomRecette)
                                .addGap(48, 48, 48)
                                .addComponent(nomRecette, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(nomTextFieldLayout.createSequentialGroup()
                        .addComponent(nomIngredientText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(qteIngredientText)
                        .addGap(191, 191, 191))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nomTextFieldLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addLivreButton)
                .addGap(308, 308, 308))
        );
        nomTextFieldLayout.setVerticalGroup(
            nomTextFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nomTextFieldLayout.createSequentialGroup()
                .addComponent(titreRecette, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(nomTextFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomRecette, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titreNomRecette, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(50, 50, 50)
                .addGroup(nomTextFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dureeRecette, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titreDureeRecette, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(113, 113, 113)
                .addGroup(nomTextFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomIngredientText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(qteIngredientText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(nomTextFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nomIngredientTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qteTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(nomTextFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boutonAjouter, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boutonSupprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(nomTextFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titreTableIngredientsRecette, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addComponent(addLivreButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
        );

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
                    .addComponent(recetteButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(nomTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pageMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(nomTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }                                                                  

    private void boutonAjouterActionPerformed(java.awt.event.ActionEvent evt) {                                              
        /* On récupère le nom et la quantité */
        String nomIngredient = nomIngredientTextField.getText();
        String qteIngredient = qteTextField.getText();

        /* Ajout a la table */
        String[] ligne = new String[] {nomIngredient, qteIngredient};
        dTMAliment.addRow(ligne);
    }                                             

    private void addLivreButtonActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

    private void menuTextMouseClicked(java.awt.event.MouseEvent evt) {                                      
        Main.controller.ChangerPage("accueil", null, null, null);
        this.dispose();
    }                                                                           

    private void stockButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
        Main.controller.ChangerPage("menuStock", null, null, null);
        this.dispose();
    }                                           
                                         

    private void recetteButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              
        Main.controller.ChangerPage("menuRecette", null, null, null);
        this.dispose();
    }                                             
                                    

    private void listButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        Main.controller.ChangerPage("menuListe", null, null, null);
        this.dispose();
    }                                          

    private void TableIngredientsRecetteMouseClicked(java.awt.event.MouseEvent evt) {                                                     
        selectedRow = TableIngredientsRecette.getSelectedRow();
    }                                                                                               

    private void boutonSupprimerActionPerformed(java.awt.event.ActionEvent evt) {                                                
        dTMAliment.removeRow(selectedRow);
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
            java.util.logging.Logger.getLogger(AjouterRecette.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AjouterRecette.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AjouterRecette.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AjouterRecette.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AjouterRecette().setVisible(true);
            }
        });
    }
	public DefaultTableModel getdTMAliment() {
		return dTMAliment;
	}
	public javax.swing.JButton getAddLivreButton() {
		return addLivreButton;
	}
	public javax.swing.JButton getBoutonAjouter() {
		return boutonAjouter;
	}
	public javax.swing.JTextField getDureeRecette() {
		return dureeRecette;
	}
	public javax.swing.JTextField getNomRecette() {
		return nomRecette;
	}             
}
