package modeleDeDonnees;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "ingredient")
public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @OneToOne
    @JoinColumn(name = "idAliment", referencedColumnName = "id")
    private Aliments aliment;

    @Column(name = "quantite")
    private int quantite;
    

    
	@Column(name = "recette_id")
	private Long recette_id;

<<<<<<< Updated upstream:FS/src/main/java/modeleDeDonnees/RecetteAliment.java
    
    public RecetteAliment() {
    }

    public RecetteAliment(Recette recette, Aliments aliment, int quantite) {
        this.recette = recette;
        this.aliment = aliment;
        this.quantite = quantite;
    }
    public Aliments getAliment() {
    	return this.aliment;
    }
    public int getQuantite() {
    	return this.quantite;
    }
=======

    public Ingredient() {
    }

    public Ingredient( Aliment aliment, int quantite) {
        this.aliment = aliment;
        this.quantite = quantite;
    }

	public long getId() {
		return id;
	}

	public Aliment getAliment() {
		return aliment;
	}

	public void setQuantite(int nouvelleQuantite) {
		this.quantite=nouvelleQuantite;
	}


>>>>>>> Stashed changes:FS/src/main/java/modeleDeDonnees/Ingredient.java
}

