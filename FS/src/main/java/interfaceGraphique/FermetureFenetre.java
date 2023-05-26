package interfaceGraphique;


import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import baseDeDonnees.AlimentService;
import baseDeDonnees.AlimentStockeService;
import baseDeDonnees.RecetteService;

public class FermetureFenetre extends WindowAdapter {
    @Override
    public void windowClosing(WindowEvent e) {
    	System.out.println("fermeture");
       AlimentStockeService.mettreAJourTable(Main.stock.getStock());
       AlimentService.mettreAJourTable(Main.ensembleAliment.getListAliments());
       RecetteService.enregistrer(Main.livreRecette.getRecettes());
       Main.gestionnaireFichier.ecrireIngredientsDansFichier(Main.nomFichier, Main.listeCourse.getIngredients());
    }
}