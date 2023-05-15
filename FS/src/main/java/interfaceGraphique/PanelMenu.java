package interfaceGraphique;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelMenu extends JPanel{
	PanelMenu(){
		this.setLayout(new FlowLayout());
		this.setBackground(Color.cyan);
		JLabel titre = new JLabel("MENU");
		JButton stock = new JButton("Stock");
		stock.setBackground(Color.cyan);
		JButton recette = new JButton("Recette");
		recette.setBackground(Color.cyan);
		JButton liste = new JButton("Liste");
		liste.setBackground(Color.cyan);
		
		this.add(titre);
		this.add(stock);
		this.add(recette);
		this.add(liste);
		this.setVisible(true);
	}
}
