package  TestBDD;

import static org.junit.Assert.*;

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
        List<Aliments> listAliments = AlimentsService.importerTableAliment();
        assertNotNull(listAliments);
        assertEquals(3, listAliments.size());
        assertEquals("poivron", listAliments.get(0).getNom());
        assertEquals("tomate", listAliments.get(1).getNom());
    }
	
	@Test
	public void testMetreAJourTable() {
		
		
		// importation de la base de donnée
		List<Aliments> listAliments = new ArrayList<Aliments>();
		listAliments = AlimentsService.importerTableAliment();

		// Création de quelques aliments à mettre à jour
		Aliments aliment = new Aliments("banane",UnitedeMesure.Unite,MoyendeConservation.Sachet
				,TypeAliment.Fruits_Legumes);
		
		listAliments.add(aliment);


		// Ajout des aliments à la base de données
	    AlimentsService.mettreAJourTable(listAliments);
	    
		// vérifier que l'AlimentStocke a été ajouté
	    listAliments = AlimentsService.importerTableAliment();
	    assertEquals(4, listAliments.size());
	    assertEquals("banane", listAliments.get(3).getNom());

		// Modification des aliments
	    listAliments.get(3).setMoyenConservation(MoyendeConservation.Vrac);;
		AlimentsService.mettreAJourTable(listAliments);
		
		// Vérification de la mise à jour des aliments
	    listAliments = AlimentsService.importerTableAliment();
		assertEquals(MoyendeConservation.Vrac, listAliments.get(3).getMoyenConservation());
		
		// supprimer un AlimentStocke existant
	    
		listAliments.remove(0);
	    AlimentsService.mettreAJourTable(listAliments);
	    
	 // vérifier que l'aliment stocké  a été supprimé
	    listAliments = AlimentsService.importerTableAliment();
	    assertEquals(3, listAliments.size());
        assertEquals("tomate", listAliments.get(0).getNom());
        assertEquals("melon", listAliments.get(1).getNom());
	    assertEquals("banane", listAliments.get(2).getNom());

	}
	
	@Test
	public void testFindByName() {
				
		// Chercher l'aliment par son nom
		Aliments resultat = AlimentsService.findByName("poivron");
		Aliments resultat2 = AlimentsService.findByName("pomme");

		
		// Vérifier que l'aliment cherché est bien celui qui a été ajouté
		assertEquals("poivron", resultat.getNom());
		assertEquals( UnitedeMesure.Unite, resultat.getUniteMesure());
		assertEquals( MoyendeConservation.Sachet, resultat.getMoyenConservation());
		assertEquals( TypeAliment.Fruits_Legumes, resultat.getTypeAliment());
		assertEquals(null,resultat2);


	}
	
}

    
	


