package  TestBDD;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import baseDeDonnees.AlimentStockeService;
import baseDeDonnees.AlimentService;
import baseDeDonnees.HibernateService;
import modeleDeDonnees.AlimentStockes;
import modeleDeDonnees.Aliment;
import modeleDeDonnees.MoyendeConservation;
import modeleDeDonnees.TypeAliment;
import modeleDeDonnees.UnitedeMesure;
/**
 * classe de test d' AlimentService : test "semi unitaire" car ils utilisent la base de donnée.
 */
public class TestAlimentService {
	
	@Before
	public void setUp() throws Exception {
		// Initialisation de la session Hibernate
		HibernateService.CreerConfig();;
	}
	
	@After
	public void tearDown() throws Exception {
		// Fermeture de la session Hibernate
		//HibernateService.FermerSession();
	}
	
	@Test
    public void testImporterTableAliment() {
        List<Aliment> listAliments = AlimentService.importerTableAliment();
        assertNotNull(listAliments);
        assertEquals(3, listAliments.size());
        assertEquals("poivron", listAliments.get(0).getNom());
        assertEquals("tomate", listAliments.get(1).getNom());
    }
	
	@Test
	public void testMetreAJourTable() {
		
		
		// importation de la base de donnée
		List<Aliment> listAliments = new ArrayList<Aliment>();
		listAliments = AlimentService.importerTableAliment();

		// Création de quelques aliments à mettre à jour
		Aliment aliment = new Aliment("banane",UnitedeMesure.Unite,MoyendeConservation.Sachet
				,TypeAliment.Fruits_Legumes);
		
		listAliments.add(aliment);


		// Ajout des aliments à la base de données
	    AlimentService.mettreAJourTable(listAliments);
	    
		// vérifier que l'AlimentStocke a été ajouté
	    listAliments = AlimentService.importerTableAliment();
	    assertEquals(4, listAliments.size());
	    assertEquals("banane", listAliments.get(3).getNom());

		// Modification des aliments
	    listAliments.get(3).setMoyenConservation(MoyendeConservation.Vrac);;
		AlimentService.mettreAJourTable(listAliments);
		
		// Vérification de la mise à jour des aliments
	    listAliments = AlimentService.importerTableAliment();
		assertEquals(MoyendeConservation.Vrac, listAliments.get(3).getMoyenConservation());
		
		// supprimer un AlimentStocke existant
	    
		listAliments.remove(0);
	    AlimentService.mettreAJourTable(listAliments);
	    
	 // vérifier que l'aliment stocké  a été supprimé
	    listAliments = AlimentService.importerTableAliment();
	    assertEquals(3, listAliments.size());
        assertEquals("tomate", listAliments.get(0).getNom());
        assertEquals("melon", listAliments.get(1).getNom());
	    assertEquals("banane", listAliments.get(2).getNom());

	}
	
	@Test
	public void testFindByName() {
				
		// Chercher l'aliment par son nom
		Aliment resultat = AlimentService.findByName("poivron");
		Aliment resultat2 = AlimentService.findByName("pomme");

		
		// Vérifier que l'aliment cherché est bien celui qui a été ajouté
		assertEquals("poivron", resultat.getNom());
		assertEquals( UnitedeMesure.Unite, resultat.getUniteMesure());
		assertEquals( MoyendeConservation.Sachet, resultat.getMoyenConservation());
		assertEquals( TypeAliment.Fruits_Legumes, resultat.getTypeAliment());
		assertEquals(null,resultat2);


	}
	
}

    
	


