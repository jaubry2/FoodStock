import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;

public class TestListeDeCourse {
/*
    private ListeDeCourse listeDeCourse;
    private Stock stock;

    @Before
    public void setUp() {
        listeDeCourse = new ListeDeCourse();
        stock = new Stock();
    }

    @Test
    public void testAjouterIngredient() {
        RecetteAliment recetteAliment = new RecetteAliment(new Aliment("Pommes"), 5);
        listeDeCourse.ajouterIngredient(recetteAliment);

        Assert.assertTrue(listeDeCourse.getIngredients().contains(recetteAliment));
    }

    @Test
    public void testSupprimerIngredient() {
        RecetteAliment recetteAliment = new RecetteAliment(new Aliment("Pommes"), 5);
        listeDeCourse.ajouterIngredient(recetteAliment);

        listeDeCourse.supprimerIngredient(recetteAliment);

        Assert.assertFalse(listeDeCourse.getIngredients().contains(recetteAliment));
    }

    @Test
    public void testAjouterRecette() {
        Aliment aliment1 = new Aliment("Pommes");
        Aliment aliment2 = new Aliment("Lait");
        RecetteAliment recetteAliment1 = new RecetteAliment(aliment1, 5);
        RecetteAliment recetteAliment2 = new RecetteAliment(aliment2, 2);
        Recette recette = new Recette();
        recette.ajouterRecetteAliment(recetteAliment1);
        recette.ajouterRecetteAliment(recetteAliment2);

        stock.ajouter(aliment1, 3);
        stock.ajouter(aliment2, 1);

        listeDeCourse.ajouterRecette(recette);

        Assert.assertTrue(listeDeCourse.getIngredients().contains(recetteAliment1));
        Assert.assertTrue(listeDeCourse.getIngredients().contains(recetteAliment2));
    }

    @Test
    public void testComparerStock() {
        Aliment aliment1 = new Aliment("Pommes");
        Aliment aliment2 = new Aliment("Lait");
        RecetteAliment recetteAliment1 = new RecetteAliment(aliment1, 5);
        RecetteAliment recetteAliment2 = new RecetteAliment(aliment2, 2);
        Recette recette = new Recette();
        recette.ajouterRecetteAliment(recetteAliment1);
        recette.ajouterRecetteAliment(recetteAliment2);

        stock.ajouter(aliment1, 3);
        stock.ajouter(aliment2, 1);

        listeDeCourse.ajouterRecette(recette);

        Map<RecetteAliment, Integer> ingredientsManquants = listeDeCourse.comparerStock(stock);

        Assert.assertEquals(1, ingredientsManquants.size());
        Assert.assertTrue(ingredientsManquants.containsKey(recetteAliment1));
        Assert.assertEquals(2, ingredientsManquants.get(recetteAliment1).intValue());
    }*/
}
