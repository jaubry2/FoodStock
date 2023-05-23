package modeleDeDonnees;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "recette_aliment")
public class RecetteAliment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "idRecette", referencedColumnName = "id")
    private Recette recette;

    @ManyToOne
    @JoinColumn(name = "idAliment", referencedColumnName = "id")
    private Aliments aliment;

    @Column(name = "quantite")
    private int quantite;

    
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
}

