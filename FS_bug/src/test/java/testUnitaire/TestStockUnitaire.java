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
import modeleDeDonnees.Aliments;
import modeleDeDonnees.MoyendeConservation;
import modeleDeDonnees.Stock;
import modeleDeDonnees.TypeAliment;
import modeleDeDonnees.UnitedeMesure;

public class TestStockUnitaire {
	

    private Stock stock;
    private Aliments lait;
    private AlimentStockes laitStockes;
    private List<AlimentStockes> listAlimentStockes;
    private List<Aliments> listAliments;
    private Aliments farine;
    private AlimentStockes farineStockes;


    @Before
    public void setUp() {
        stock = new Stock();
        lait = new Aliments("lait",UnitedeMesure.Litre,MoyendeConservation.Bouteille,TypeAliment.ProduitsLaitiers);
        laitStockes = new AlimentStockes(lait,(float) 2.5, LocalDate.now().plusDays(3));
        farine = new Aliments("farine",UnitedeMesure.Gramme,MoyendeConservation.Sachet,TypeAliment.Céreales);
        farineStockes = new AlimentStockes(farine,(float) 500, LocalDate.now().plusDays(100));
        listAlimentStockes = new ArrayList<>();
        listAlimentStockes.add(laitStockes);
        listAlimentStockes.add(farineStockes);
        
        listAliments = new ArrayList<>();
        listAliments.add(lait);
        listAliments.add(farine);


    }

    @Test
    public void testCreerStock() {
        stock.creerstock("Frigo");
        assertTrue(stock.getStock().containsKey("Frigo"));
    }

    @Test
    public void testRemplirStock() {
       

        stock.remplirstock("Frigo", listAlimentStockes);
        assertEquals(stock.getStock().get("Frigo"), listAlimentStockes);
    }

    @Test
    public void testAjouterAliment() {
        stock.creerstock("Frigo");
        stock.ajouterAliment("Frigo", laitStockes);
        assertTrue(stock.getStock().get("Frigo").contains(laitStockes));
    }

    @Test
    public void testAjouterListe() {
        stock.creerstock("Frigo");
        stock.ajouterListe("Frigo", listAlimentStockes);
        assertTrue(stock.getStock().get("Frigo").contains(laitStockes));
        
    }
    
    public void testAjouterAlimentAvecNom() {
        Aliments aliments = new Aliments("lait",UnitedeMesure.Litre,MoyendeConservation.Bouteille,TypeAliment.ProduitsLaitiers);
        stock.creerstock("Frigo");
        stock.ajouterAliment("Frigo", aliments, 2.5f, LocalDate.now().plusDays(3));
        assertEquals(stock.getStock().get("Frigo").get(0).getQuantite(), 2.5f, 0.01);
        assertEquals(stock.getStock().get("Frigo").get(0).getDatePeremption(), LocalDate.now().plusDays(3));
        assertEquals(stock.getStock().get("Frigo").get(0).getAliment(), aliments);
    }

    @Test
    public void testRetirerAliment() {
        Aliments aliments = new Aliments("lait",UnitedeMesure.Litre,MoyendeConservation.Bouteille,TypeAliment.ProduitsLaitiers);
        AlimentStockes alimentStockes = new AlimentStockes(aliments, 2.5f, LocalDate.now().plusDays(3));
        stock.creerstock("Frigo");
        stock.ajouterAliment("Frigo", alimentStockes);
        stock.retirerAliment("Frigo", alimentStockes);
        assertFalse(stock.getStock().get("Frigo").contains(alimentStockes));
    }
    
    @Test
    public void testGetAlimentByName() {
        Aliments laitTest = Stock.getAlimentByName(listAliments, "lait");
        Aliments farineTest = Stock.getAlimentByName(listAliments, "farine");
        Aliments oeufTest = Stock.getAlimentByName(listAliments, "oeuf");

        assertEquals("lait", laitTest.getNom());
        assertEquals("farine", farineTest.getNom());
        assertNull(oeufTest);
      
    }
    @Test
    public void testGetListFromMap() {
        stock.remplirstock("Frigo", listAlimentStockes);
        List<AlimentStockes> frigoTests = stock.getListFromMap("Frigo");
        
        assertEquals(2, frigoTests.size());      
    }
    
    @Test
    public void testFiltrerType() {
        stock.remplirstock("Frigo", listAlimentStockes);
        List<AlimentStockes> listAlimentsProduitLaitier = stock.filtrerType("Frigo", TypeAliment.ProduitsLaitiers);
        assertEquals(1, listAlimentsProduitLaitier.size());
        assertEquals("lait", listAlimentsProduitLaitier.get(0).getAliment().getNom());
        List<AlimentStockes> listAlimentsCereales = stock.filtrerType("Frigo", TypeAliment.Céreales);
        assertEquals(1, listAlimentsCereales.size());
        assertEquals("farine", listAlimentsCereales.get(0).getAliment().getNom());
        List<AlimentStockes> listAlimentsFL = stock.filtrerType("Frigo", TypeAliment.Fruits_Legumes);
        assertEquals(Collections.emptyList(),listAlimentsFL);

    }
    
    @Test
    public void testFiltrerDate() {
        stock.remplirstock("Frigo", listAlimentStockes);
        List<AlimentStockes> listAlimentsProcheDate = stock.filtrerDate("Frigo", 4);
        assertEquals(1, listAlimentsProcheDate.size());
        assertEquals("lait", listAlimentsProcheDate.get(0).getAliment().getNom());
        List<AlimentStockes> listAlimentsTresProcheDate = stock.filtrerDate("Frigo",2);
        assertEquals(Collections.emptyList(),listAlimentsTresProcheDate);

    }


}


