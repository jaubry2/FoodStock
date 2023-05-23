package testUnitaire;

import static org.junit.Assert.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

import modeleDeDonnees.AlimentStockes;
import modeleDeDonnees.Aliment;
import modeleDeDonnees.MoyendeConservation;
import modeleDeDonnees.Stock;
import modeleDeDonnees.TypeAliment;
import modeleDeDonnees.UnitedeMesure;

public class TestStockUnitaire {
	

    private Stock stock;
    private Aliment lait;
    private AlimentStockes laitStockes;
    private List<AlimentStockes> listAlimentStockes;
    private List<Aliment> listAliments;
    private Aliment farine;
    private AlimentStockes farineStockes;


    @Before
    public void setUp() {
        listAlimentStockes = new ArrayList<>();
        stock = new Stock(listAlimentStockes);
        lait = new Aliment("lait",UnitedeMesure.Litre,MoyendeConservation.Bouteille,TypeAliment.ProduitsLaitiers);
        laitStockes = new AlimentStockes(lait,(float) 2.5, LocalDate.now().plusDays(3));
        farine = new Aliment("farine",UnitedeMesure.Gramme,MoyendeConservation.Sachet,TypeAliment.Céreales);
        farineStockes = new AlimentStockes(farine,(float) 500, LocalDate.now().plusDays(100));
        listAlimentStockes.add(laitStockes);
        listAlimentStockes.add(farineStockes);
        
        listAliments = new ArrayList<>();
        listAliments.add(lait);
        listAliments.add(farine);


    }



    @Test
    public void testRemplirStock() {
       

        stock.ajouterListe(listAlimentStockes);
        assertEquals(stock.getStock(), listAlimentStockes);
    }

    @Test
    public void testAjouterAliment() {
        stock.ajouterAliment( laitStockes);
        assertTrue(stock.getStock().contains(laitStockes));
    }

    @Test
    public void testAjouterListe() {
        stock.ajouterListe(listAlimentStockes);
        assertTrue(stock.getStock().contains(laitStockes));
        
    }
    
    public void testAjouterAlimentAvecNom() {
        Aliment aliments = new Aliment("lait",UnitedeMesure.Litre,MoyendeConservation.Bouteille,TypeAliment.ProduitsLaitiers);
        stock.ajouterAliment( aliments, 2.5f, LocalDate.now().plusDays(3));
        assertEquals(stock.getStock().get(0).getQuantite(), 2.5f, 0.01);
        assertEquals(stock.getStock().get(0).getDatePeremption(), LocalDate.now().plusDays(3));
        assertEquals(stock.getStock().get(0).getAliment(), aliments);
    }

    @Test
    public void testRetirerAliment() {
        Aliment aliments = new Aliment("lait",UnitedeMesure.Litre,MoyendeConservation.Bouteille,TypeAliment.ProduitsLaitiers);
        AlimentStockes alimentStockes = new AlimentStockes(aliments, 2.5f, LocalDate.now().plusDays(3));
        stock.ajouterAliment( alimentStockes);
        stock.retirerAliment(alimentStockes);
        assertFalse(stock.getStock().contains(alimentStockes));
    }
    
    @Test
    public void testGetAlimentByName() {
        Aliment laitTest = Stock.getAlimentByName(listAliments, "lait");
        Aliment farineTest = Stock.getAlimentByName(listAliments, "farine");
        Aliment oeufTest = Stock.getAlimentByName(listAliments, "oeuf");

        assertEquals("lait", laitTest.getNom());
        assertEquals("farine", farineTest.getNom());
        assertNull(oeufTest);
      
    }
    
    @Test
    public void testFiltrerType() {
        stock.ajouterListe(listAlimentStockes);
        List<AlimentStockes> listAlimentsProduitLaitier = stock.filtrerType(TypeAliment.ProduitsLaitiers);
        assertEquals(1, listAlimentsProduitLaitier.size());
        assertEquals("lait", listAlimentsProduitLaitier.get(0).getAliment().getNom());
        List<AlimentStockes> listAlimentsCereales = stock.filtrerType(TypeAliment.Céreales);
        assertEquals(1, listAlimentsCereales.size());
        assertEquals("farine", listAlimentsCereales.get(0).getAliment().getNom());
        List<AlimentStockes> listAlimentsFL = stock.filtrerType(TypeAliment.Fruits_Legumes);
        assertEquals(Collections.emptyList(),listAlimentsFL);

    }
    
    @Test
    public void testFiltrerDate() {
        stock.ajouterListe( listAlimentStockes);
        List<AlimentStockes> listAlimentsProcheDate = stock.filtrerDate( 4);
        assertEquals(1, listAlimentsProcheDate.size());
        assertEquals("lait", listAlimentsProcheDate.get(0).getAliment().getNom());
        List<AlimentStockes> listAlimentsTresProcheDate = stock.filtrerDate(2);
        assertEquals(Collections.emptyList(),listAlimentsTresProcheDate);

    }


}


