
package modeleDeDonnees;

import java.util.HashSet;
import java.util.Set;

public class LivreRecettes {
	private Set<Recette> recettes;
	
    public LivreRecettes() {
    	this.recettes=new HashSet<>();
    }
	public LivreRecettes(Set<Recette> recettes) {
		this.recettes = recettes;
	}

	public Set<Recette> getRecettes() {
		return recettes;
	}

	public void setRecettes(Set<Recette> recettes) {
		this.recettes = recettes;
	}
    public void ajouterRecette(Recette recette) {
        recettes.add(recette);
    }

    public void enleverRecette(Recette recette) {
        recettes.remove(recette);
    }
    public void afficherNomRecettes() {
    	for (Recette r : this.recettes) {
    		System.out.println(r.getNom());
    	}
    }
    /*affiche les aliments et les quantitées respectives*/
    public void afficherIngredients(Recette r) {
    		r.afficherIngredient();
    	
    }
    
    public LivreRecettes FiltrerParDuree(int duree) {
    	LivreRecettes recettesFiltre = new LivreRecettes();
    	for (Recette recette : recettes) {
    		if(recette.getDuree() > duree ) {
    			recettesFiltre.ajouterRecette(recette);
    		}
    	}
    	return recettesFiltre;
    }
    
    public LivreRecettes FiltrerParAliment(Aliment aliment) {
    	LivreRecettes recettesFiltre = new LivreRecettes();
    	for (Recette recette : recettes) {
    		if(recette.isAliment(aliment)) {
    			recettesFiltre.ajouterRecette(recette);
    		}
    	}
    	return recettesFiltre;
    }
}
