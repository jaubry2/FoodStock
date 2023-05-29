import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ListeDeCourseTest {
    private ListeDeCourse listeDeCourse;
    private Ingredient ingredient1;
    private Ingredient ingredient2;

    @Before
    public void setUp() {
        listeDeCourse = new ListeDeCourse();
        ingredient1 = new Ingredient("Tomate", 3);
        ingredient2 = new Ingredient("Oignon", 2);
    }

    @Test
    public void testAjouterIngredient() {
        listeDeCourse.ajouterIngredient(ingredient1);
        listeDeCourse.ajouterIngredient(ingredient2);

        assertTrue(listeDeCourse.contientIngredient(ingredient1));
        assertTrue(listeDeCourse.contientIngredient(ingredient2));
    }

    @Test
    public void testSupprimerIngredient() {
        listeDeCourse.ajouterIngredient(ingredient1);
        listeDeCourse.ajouterIngredient(ingredient2);

        listeDeCourse.supprimerIngredient(ingredient1);

        assertFalse(listeDeCourse.contientIngredient(ingredient1));
        assertTrue(listeDeCourse.contientIngredient(ingredient2));
    }

    @Test
    public void testGenererListeFinale() {
        Recette recette1 = new Recette("Salade", 10);
        recette1.ajouterIngredient(ingredient1);
        recette1.ajouterIngredient(ingredient2);

        Recette recette2 = new Recette("Soupe", 20);
        recette2.ajouterIngredient(ingredient2);

        listeDeCourse.ajouterRecette(recette1);
        listeDeCourse.ajouterRecette(recette2);

        listeDeCourse.genererListeFinale();

        assertTrue(listeDeCourse.contientIngredient(ingredient1));
        assertTrue(listeDeCourse.contientIngredient(ingredient2));
    }
}
