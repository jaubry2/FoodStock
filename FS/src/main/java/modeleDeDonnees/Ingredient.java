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
    private Aliment aliment;

    @Column(name = "quantite")
    private float quantite;
    

    
	@Column(name = "recette_id")
	private Long recette_id;

  
    public Ingredient() {
    }

    public Ingredient( Aliment aliment, float quantite) {
        this.aliment = aliment;
        this.quantite = quantite;
    }

	public long getId() {
		return id;
	}

	public Aliment getAliment() {
		return aliment;
	}

	public void setQuantite(float nouvelleQuantite) {
		this.quantite=nouvelleQuantite;
	}

	public float  getQuantite() {
		return quantite;
	}

	public boolean isAliment(Aliment aliment) {
		return this.aliment.equals(aliment);
		
	}


}

