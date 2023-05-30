package interfaceGraphique;


import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import baseDeDonnees.AlimentService;
import baseDeDonnees.AlimentStockeService;
import baseDeDonnees.RecetteService;
import modeleDeDonnees.ListeDeCourse;

public class FermetureFenetre extends WindowAdapter {
    @Override
    public void windowClosing(WindowEvent e) {
    	System.out.println("fermeture");
        AlimentService.mettreAJourTable(Main.ensembleAliment.getListAliments());
       AlimentStockeService.mettreAJourTable(Main.stock.getStock());
       RecetteService.enregistrer(Main.livreRecette.getRecettes());
       ListeDeCourse l= Main.listeCourse;
       Main.gestionnaireFichier.ecrireIngredientsDansFichier(Main.nomFichier,l.getIngredients() );
    }
}