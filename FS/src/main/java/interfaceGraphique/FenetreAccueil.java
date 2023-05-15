package interfaceGraphique;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FenetreAccueil extends JFrame{
	
	public FenetreAccueil() {
		this.setLayout(new BorderLayout());
		this.add(new JLabel("zertyu"), BorderLayout.SOUTH);
		PanelMenu menu = new PanelMenu();
		this.add(menu,BorderLayout.WEST);
		
		PanelStock stock = new PanelStock();
		this.add(stock, BorderLayout.CENTER);
	
		//this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setVisible(true);
	}
}
