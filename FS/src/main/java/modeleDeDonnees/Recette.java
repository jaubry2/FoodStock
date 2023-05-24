package modeleDeDonnees;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.Table;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.JoinColumn;

import java.util.Set;


@Entity
@Table(name = "recettes")
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
     * Aliments liés à la recette.
     */
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "recette_aliment",
            joinColumns = @JoinColumn(name = "idRecette"),
            inverseJoinColumns = @JoinColumn(name = "idAliment"))
     private Set<RecetteAliment> recetteAliments;


    
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
    public Recette(String nom,int duree) {
        this.duree = duree;
        this.nom = nom;
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
    public Set<RecetteAliment> getRecetteAliments() {
        return recetteAliments;
    }

    /**
     * Modifie les aliments liés à la recette avec leur quantité.
     * @param recetteAliments Les nouveaux aliments liés à la recette avec leur quantité.
     */
    public void setRecetteAliments(Set<RecetteAliment> recetteAliments) {
        this.recetteAliments = recetteAliments;
    }
    public void afficherIngredient() {
    	for (RecetteAliment R:recetteAliments) {
    		System.out.println(R.getAliment().getNom());
    		System.out.println(R.getQuantite());
    	}
    }
}
