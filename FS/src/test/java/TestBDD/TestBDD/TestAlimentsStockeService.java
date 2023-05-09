package TestBDD;

/**
 * classe de test d' AlimentsStockesService : test "semi unitaire" car ils utilisent la base de donnée.
 */
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import baseDeDonnees.AlimentStockeService;
import baseDeDonnees.AlimentsService;
import baseDeDonnees.HibernateService;
import modeleDeDonnees.AlimentStockes;
import modeleDeDonnees.Aliments;
import modeleDeDonnees.MoyendeConservation;
import modeleDeDonnees.TypeAliment;
import modeleDeDonnees.UnitedeMesure;

public class TestAlimentsStockeService {
	
    @Before
    public void setUp() {
    	HibernateService.CreerConfig();
        /* initialiser la base de données : deux aliments stockés mis à la main
    	74	2023-04-28	1	poivron
    	75	2023-04-23	10.5	melon
    	et 3 aliments 
    	26	Sachet	poivron	Fruits_Legumes	Unite
		27	Sachet	tomate	Fruits_Legumes	Unite
		28	Sachet	melon	Fruits_Legumes	Unite 
    	*/
    }
    @After
    public void tearDown() {
    	//HibernateService.FermerSession();
        // nettoyer la base de données
    	
    }
    
    
    @Test
    public void testImporterTableAlimentStock() {
        List<AlimentStockes> listAlimentStockes = AlimentStockeService.importerTableAlimentStock();
        assertNotNull(listAlimentStockes);
        assertEquals(2, listAlimentStockes.size());
        assertEquals("poivron", listAlimentStockes.get(0).getAliment().getNom());
        assertEquals("melon", listAlimentStockes.get(1).getAliment().getNom());
    }
    
    @Test
    public void testConvertirEnAlimentStocke() {
        Object[] element = new Object[] { (long) 1, java.sql.Date.valueOf(LocalDate.now()) , (float) 2.5, (long) 26 };
        AlimentStockes alimentStocke = AlimentStockeService.convertirEnAlimentStocke(element);
        assertNotNull(alimentStocke);
        assertEquals((long) 1, alimentStocke.getId().longValue());
        assertEquals((float) 2.5, alimentStocke.getQuantite(), (float)0.01);
        assertEquals(LocalDate.now(), alimentStocke.getDatePeremption());
        assertNotNull(alimentStocke.getAliment());
        assertEquals((long) 26, alimentStocke.getAliment().getId().longValue());
    }

    
	@Test
	public void testMettreAJourTable() {
		
		//importer la table
	    List<AlimentStockes> listAlimentStockes = new ArrayList<>();
	    listAlimentStockes = AlimentStockeService.importerTableAlimentStock();
	    // ajouter un nouvel AlimentStocke

	    AlimentStockes alimentStocke = new AlimentStockes(null, AlimentsService.findByName("tomate") , 3.0f, LocalDate.now().plusDays(7));
	    listAlimentStockes.add(alimentStocke);
	    AlimentStockeService.mettreAJourTable(listAlimentStockes);
	
	    // vérifier que l'AlimentStocke a été ajouté
	    listAlimentStockes = AlimentStockeService.importerTableAlimentStock();
	    assertEquals(3, listAlimentStockes.size());
	    assertEquals("tomate", listAlimentStockes.get(2).getAliment().getNom());
	
	    // mettre à jour un AlimentStocke existant
	    //AlimentStockes alimentStocke2 = listAliments.get(1);
	    listAlimentStockes.get(1).setQuantite(4.0f);
	    /*List<AlimentStockes> listAlimentStockes2 = new ArrayList<>();
	    listAlimentStockes2.add(alimentStocke2);*/
	    AlimentStockeService.mettreAJourTable(listAlimentStockes);
	
	    // vérifier que l'aliment stocké a été mis à jour
	    listAlimentStockes = AlimentStockeService.importerTableAlimentStock();
	    assertEquals(4.0f, listAlimentStockes.get(1).getQuantite(), 0.01f);
	
	    // supprimer un AlimentStocke existant
	    
	    listAlimentStockes.remove(0);
	    AlimentStockeService.mettreAJourTable(listAlimentStockes);
	    
	 // vérifier que l'aliment stocké  a été supprimé
	    listAlimentStockes = AlimentStockeService.importerTableAlimentStock();
	    assertEquals(2, listAlimentStockes.size());
        assertEquals("melon", listAlimentStockes.get(0).getAliment().getNom());
        assertEquals("tomate", listAlimentStockes.get(1).getAliment().getNom());
	}
}