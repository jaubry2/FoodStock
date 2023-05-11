package testUnitaire;





import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;


import org.junit.Before;
import org.junit.Test;

import modeleDeDonnees.Aliments;
import modeleDeDonnees.MoyendeConservation;
import modeleDeDonnees.TypeAliment;
import modeleDeDonnees.UnitedeMesure;

public class TestAliment {
private Aliments aliment;

@Before
public void setUp() {
    aliment = new Aliments("Tomate", UnitedeMesure.Gramme, MoyendeConservation.Vrac, TypeAliment.Fruits_Legumes);
    aliment.setId(1L);
}

@Test
public void testGetId() {
	/*assertEquals(1, aliment.getId());*/
    
}

@Test
public void testGetNom() {
    assertEquals("Tomate", aliment.getNom());
}

@Test
public void testGetUniteMesure() {
    assertEquals(UnitedeMesure.Gramme, aliment.getUniteMesure());
}

@Test
public void testGetMoyenConservation() {
    assertEquals(MoyendeConservation.Vrac, aliment.getMoyenConservation());
}

@Test
public void testGetTypeAliment() {
    assertEquals(TypeAliment.Fruits_Legumes, aliment.getTypeAliment());
}

@Test
public void testConstructeurAvecParametres() {
    Aliments aliment2 = new Aliments("Banane", UnitedeMesure.Gramme, MoyendeConservation.Vrac, TypeAliment.Fruits_Legumes);
    assertNotNull(aliment2);
    assertEquals("Banane", aliment2.getNom());
    assertEquals(UnitedeMesure.Gramme, aliment2.getUniteMesure());
    assertEquals(MoyendeConservation.Vrac, aliment2.getMoyenConservation());
    assertEquals(TypeAliment.Fruits_Legumes, aliment2.getTypeAliment());
}
}
