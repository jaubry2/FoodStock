package modeleDeDonnees;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.Table;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.JoinColumn;

import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "recette")
public class Recette {
	
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    /**
     * Nom de la recette.
     */
    @Column(name = "nom")
    private String nom;


    /**
     * Durée de préparation de la recette en minutes.
     */
    @Column(name = "duree")
    private int duree;


    /**
     * Aliments liés à la recette avec leur quantité.
     */
    /*@OneToMany(mappedBy = "recette")
    @JoinTable(name = "recette_aliment",
            joinColumns = @JoinColumn(name = "idRecette"),
            inverseJoinColumns = @JoinColumn(name = "idAliment"))*/
    @OneToMany ( cascade = CascadeType.ALL)
    @JoinColumn(name = "recette_id")
    private Set<Ingredient> listIngredient;


    
    /**
     * Constructeur par défaut de la classe Recette.
     */
    public Recette() {
    }

    /**
     * Constructeur avec paramètres de la classe Recette.
     * 
     * @param duree La durée de préparation de la recette en minutes.
     * @param nom   Le nom de la recette.
     */
    public Recette(String nom, int duree) {
        this.duree = duree;
        this.nom = nom;
        this.listIngredient = new HashSet<>();
    }

    /**
     * Constructeur avec paramètres de la classe Recette.
     * 
     * @param nom                   Le nom de la recette.
     * @param duree                 La durée de préparation de la recette en minutes.
     * @param ingredientsRecette    Les aliments liés à la recette avec leur quantité.
     */
    public Recette(String nom, int duree, Set<Ingredient> ingredientsRecette) {
    	this.duree = duree;
        this.nom = nom;
        this.listIngredient = ingredientsRecette;
	}

    /**
     * Retourne l'identifiant de la recette.
     * 
     * @return L'identifiant de la recette.
     */
    public Long getId() {
        return id;
    }

    /**
     * Modifie l'identifiant de la recette.
     * 
     * @param id Le nouvel identifiant de la recette.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Retourne le nom de la recette.
     * 
     * @return Le nom de la recette.
     */
    public String getNom() {
        return nom;
    }

    /**
     * Modifie le nom de la recette.
     * 
     * @param nom Le nouveau nom de la recette.
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Retourne la durée de préparation de la recette en minutes.
     * 
     * @return La durée de préparation de la recette.
     */
    public int getDuree() {
        return duree;
    }

    /**
     * Modifie la durée de préparation de la recette en minutes.
     * 
     * @param duree La nouvelle durée de préparation de la recette.
     */
    public void setDuree(int duree) {
        this.duree = duree;
    }

    /**
     * Retourne les aliments liés à la recette avec leur quantité.
     *
     * @return Les aliments liés à la recette avec leur quantité.
     */
    public Set<Ingredient> getListIngredients() {
        return listIngredient;
    }

    /**
     * Modifie les aliments liés à la recette avec leur quantité.
     * 
     * @param listIngredients Les nouveaux aliments liés à la recette avec leur quantité.
     */
    public void setListIngredients(Set<Ingredient> listIngredients) {
        this.listIngredient = listIngredients;
    }

    /**
     * Affiche les aliments et leurs quantités respectives pour la recette.
     */
    public void afficherIngredient() {
    	for (Ingredient i : listIngredient) {
    		System.out.println(i.getAliment().getNom());
    		System.out.println(i.getQuantite());
    	}
    }

    /**
     * Modifie la quantité d'un aliment dans la recette.
     * 
     * @param nomAliment       Le nom de l'aliment à modifier.
     * @param nouvelleQuantite La nouvelle quantité de l'aliment.
     */
    public void changerQuantiteRecetteAliment(String nomAliment, int nouvelleQuantite) {
        for (Ingredient ingredient : listIngredient) {
            if (ingredient.getAliment().getNom().equals(nomAliment)) {
                ingredient.setQuantite(nouvelleQuantite);
                break;
            }
        }
    }

    /**
     * Crée une nouvelle recette avec un seul aliment et sa quantité.
     * 
     * @param nom       Le nom de la recette.
     * @param duree     La durée de préparation de la recette en minutes.
     * @param aliment   L'aliment à ajouter à la recette.
     * @param quantite  La quantité de l'aliment dans la recette.
     * @return          La recette créée.
     */
    public static Recette creerRecette(String nom, int duree, Aliment aliment, int quantite) {
    	Recette recette = new Recette(nom, duree);
    	Ingredient ingredient = new Ingredient(aliment, quantite);
    	recette.getListIngredients().add(ingredient);
    	return recette;
    }

    /**
     * Vérifie si un aliment est présent dans la recette.
     * 
     * @param aliment   L'aliment à vérifier.
     * @return          Vrai si l'aliment est présent dans la recette, sinon faux.
     */
    public boolean isAliment(Aliment aliment) {
    	for (Ingredient ingredient : listIngredient) {
    		if (ingredient.isAliment(aliment)) {
    			return true;
    		}
    	}
    	return false;
    }

    /**
     * Retourne la quantité d'un aliment dans la recette.
     * 
     * @param aliment   L'aliment dont on souhaite connaître la quantité.
     * @return          La quantité de l'aliment dans la recette.
     * @throws AlimentsNonPresentException Si l'aliment n'est pas présent dans la recette.
     */
    public float getQuantite(Aliment aliment) throws AlimentsNonPresentException {
        for (Ingredient ingredient : listIngredient) {
            if (ingredient.isAliment(aliment)) {
                return ingredient.getQuantite();
            }
        }
        throw new AlimentsNonPresentException(aliment.getNom());
    }
}
