import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;

public class ListeDeCourseTest {
    private ListeDeCourse listeDeCourse;
    private Stock stock;

    @Before
    public void setUp() {
        listeDeCourse = new ListeDeCourse();
        stock = new Stock();
        stock.ajouterIngredient(new Aliment("Farine"));
        stock.ajouterIngredient(new Aliment("Sucre"));
        stock.ajouterIngredient(new Aliment("Lait"));
        stock.ajouterIngredient(new Aliment("Oeufs"));
    }

    @Test
    public void testAjouterIngredient() {
        RecetteAliment recetteAliment = new RecetteAliment(new Aliment("Chocolat"), 200);
        listeDeCourse.ajouterIngredient(recetteAliment);
        Assert.assertTrue(listeDeCourse.getIngredients().contains(recetteAliment));
    }

    @Test
    public void testSupprimerIngredient() {
        RecetteAliment recetteAliment = new RecetteAliment(new Aliment("Sucre"), 100);
        listeDeCourse.ajouterIngredient(recetteAliment);
        listeDeCourse.supprimerIngredient(recetteAliment);
        Assert.assertFalse(listeDeCourse.getIngredients().contains(recetteAliment));
    }

    @Test
    public void testAjouterRecette() {
        Recette recette = new Recette("Gâteau au chocolat", 60);
        RecetteAliment recetteAliment1 = new RecetteAliment(new Aliment("Chocolat"), 200);
        RecetteAliment recetteAliment2 = new RecetteAliment(new Aliment("Sucre"), 100);
        recette.ajouterRecetteAliment(recetteAliment1);
        recette.ajouterRecetteAliment(recetteAliment2);

        listeDeCourse.ajouterRecette(recette);

        Assert.assertTrue(listeDeCourse.getRecettes().contains(recette));
        Assert.assertTrue(listeDeCourse.getIngredients().contains(recetteAliment1));
        Assert.assertTrue(listeDeCourse.getIngredients().contains(recetteAliment2));
    }

    @Test
    public void testComparerStock() {
        Recette recette1 = new Recette("Gâteau au chocolat", 60);
        RecetteAliment recetteAliment1 = new RecetteAliment(new Aliment("Chocolat"), 200);
        RecetteAliment recetteAliment2 = new RecetteAliment(new Aliment("Sucre"), 100);
        recette1.ajouterRecetteAliment(recetteAliment1);
        recette1.ajouterRecetteAliment(recetteAliment2);

        Recette recette2 = new Recette("Crêpes", 30);
        RecetteAliment recetteAliment3 = new RecetteAliment(new Aliment("Farine"), 250);
        RecetteAliment recetteAliment4 = new RecetteAliment(new Aliment("Lait"), 500);
        recette2.ajouterRecetteAliment(recetteAliment3);
        recette2.ajouterRecetteAliment(recetteAliment4);

        listeDeCourse.ajouterRecette(recette1);
        listeDeCourse.ajouterRecette(recette2);

        Map<RecetteAliment, Integer> listeManquante = listeDeCourse.comparerStock(stock);

        Assert.assertEquals(2, listeManquante.size());
        Assert.assertEquals(0, (int) listeManquante.get(recetteAliment1));
        Assert.assertEquals(0, (int) listeManquante.get(recetteAliment2));
        Assert.assertEquals(250, (int) listeManquante.get(recetteAliment3));
        Assert.assertEquals(500, (int) listeManquante.get(recetteAliment4));
    }
}
