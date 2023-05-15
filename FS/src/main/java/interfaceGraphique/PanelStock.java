package interfaceGraphique;

import java.awt.Color;
import java.awt.FlowLayout;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import modeleDeDonnees.AlimentStockes;

public class PanelStock extends JPanel{

	PanelStock(){
		this.setBackground(Color.pink);
		this.setLayout(new FlowLayout());
		JLabel titre = new JLabel("FOODSTOCK");

		JLabel alimentsPerimes = new JLabel("Aliments bientot perimés");
        
		JTable tableauAlimentsPerimes = new JTable();
		
		List<AlimentStockes> stock = MainNew.stocks.filtrerDate("principal",4);
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
        tableauAlimentsPerimes.setModel(model);
        
        this.add(titre);
        this.add(alimentsPerimes);
        this.add(tableauAlimentsPerimes);
		this.setVisible(true);
	}
	
	

}
