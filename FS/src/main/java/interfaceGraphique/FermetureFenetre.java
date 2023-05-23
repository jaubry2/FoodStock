package interfaceGraphique;


import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import baseDeDonnees.AlimentStockeService;

public class FermetureFenetre extends WindowAdapter {
    @Override
    public void windowClosing(WindowEvent e) {
    	System.out.println("fermeture");
       AlimentStockeService.mettreAJourTable(Main.stock.getStock());
    }
}