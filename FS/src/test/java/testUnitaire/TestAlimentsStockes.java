package testUnitaire;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import modeleDeDonnees.AlimentStockes;
import modeleDeDonnees.Aliment;
import modeleDeDonnees.MoyendeConservation;
import modeleDeDonnees.TypeAliment;
import modeleDeDonnees.UnitedeMesure;

import java.time.LocalDate;

public class TestAlimentsStockes {

    private Aliment aliment;
    private float quantite;
    private LocalDate datePeremption;
    private AlimentStockes alimentStocke;

    @Before
    public void setUp() {
        aliment = new Aliment("Tomate", UnitedeMesure.Gramme, MoyendeConservation.Vrac, TypeAliment.Fruits_Legumes);
        quantite = 2.5f;
        datePeremption = LocalDate.of(2023, 12, 31);
        alimentStocke = new AlimentStockes(aliment, quantite, datePeremption);
    }

    @Test
    public void testGetAliment() {
        Assert.assertEquals(aliment, alimentStocke.getAliment());
    }



    @Test
    public void testGetQuantite() {
        Assert.assertEquals(quantite, alimentStocke.getQuantite(), 0.001);
    }



    @Test
    public void testGetDatePeremption() {
        Assert.assertEquals(datePeremption, alimentStocke.getDatePeremption());
    }


}
