package TestBDD;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import baseDeDonnees.HibernateService;
import baseDeDonnees.RecetteService;
import modeleDeDonnees.Aliment;
import modeleDeDonnees.Recette;

/**
 * Classe de test pour RecetteService.
 * Ces tests utilisent la base de données, il s'agit donc de tests semi-unitaires.
 */
public class TestRecetteService {

    @Before
    public void setUp() {
        // Initialisation de la session Hibernate
        HibernateService.CreerConfig();
        // il faut pizza 
    }


    @Test
    public void testImporterTableRecette() {
        Set<Recette> setRecettes = RecetteService.importerTableRecette();
        assertNotNull(setRecettes);
        assertEquals(1, setRecettes.size());
        assertEquals("Pizza", setRecettes.iterator().next().getNom());
    }

   /* @Test
    public void testMetreAJourTable() {
        // Importation de la base de données
        Set<Recette> setRecettes = new HashSet<>(RecetteService.importerTableRecette());

        // Création de quelques recettes à mettre à jour
        Recette recette = new Recette("Salade de pate",20);
        setRecettes.add(recette);

        // Ajout des recettes à la base de données
        RecetteService.mettreAJourTable(setRecettes);

        // Vérifier que la recette a été ajoutée
        setRecettes = RecetteService.importerTableRecette();
        assertEquals(2, setRecettes.size());
        Recette recetteTrouvee = new Recette();
        for (Recette recetteSet : setRecettes) {
            if (recetteSet.getNom().equals("Salade de pate")) {
                recetteTrouvee = recetteSet;
                break;
            }
        }

        assertNotNull(recetteTrouvee);
        assertEquals("Salade de pate", recetteTrouvee.getNom());
        // Modification de la recette
        for (Recette recetteSet : setRecettes) {
            if (recetteSet.getNom().equals("Salade de pate")) {
                recetteSet.setDuree(10);
                break;
            }
        }
        RecetteService.mettreAJourTable(setRecettes);

        // Vérification de la mise à jour de la recette
        setRecettes = RecetteService.importerTableRecette();
        for (Recette recetteSet : setRecettes) {
            if (recetteSet.getNom().equals("Salade de pate")) {
                recetteTrouvee = recetteSet;
                break;
            }
        }

        assertNotNull(recetteTrouvee);
        assertEquals(10, recetteTrouvee.getDuree());
        // Supprimer une recette existante
        Recette recetteSupprime = new Recette();
        for (Recette recetteSet : setRecettes) {
            if (recetteSet.getNom().equals("Salade de pate")) {
            	recetteSupprime = recetteSet;
                setRecettes.remove(recetteSupprime);
                break;
            }
        }
        RecetteService.mettreAJourTable(setRecettes);

        // Vérifier que la recette a été supprimée
        setRecettes = RecetteService.importerTableRecette();
        recetteTrouvee = null;
        for (Recette recetteSet : setRecettes) {
            if (recetteSet.getNom().equals("Salade de pate")) {
                recetteTrouvee = recetteSet;
                break;
            }
        }

        assertNull(recetteTrouvee);
    }*/

}