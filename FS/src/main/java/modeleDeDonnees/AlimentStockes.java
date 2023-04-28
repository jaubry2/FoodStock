package modeleDeDonnees;
import java.time.LocalDate;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Table;

@Entity
@Table(name = "alimentStockes")

public class AlimentStockes {



	public AlimentStockes() {}
    public AlimentStockes(Aliments aliment, float quantite, LocalDate datePeremption) {
		super();
		this.aliment = aliment;
		this.quantite = quantite;
		this.datePeremption = datePeremption;
	}
    
    public AlimentStockes(Long id, Aliments aliment, float quantite, LocalDate datePeremption) {
    	super();
    	this.id =id;
		this.aliment = aliment;
		this.quantite = quantite;
		this.datePeremption = datePeremption;	}

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@ManyToOne @JoinColumn(name="idAlimemts",referencedColumnName ="id", nullable=false)    	
    private Aliments aliment;

    
    public Aliments getAliment() {
		return aliment;
	}

	public void setAliment(Aliments aliment) {
		this.aliment = aliment;
	}

	@Column(name = "quantite")
	   private float  quantite;
	
	@Column(name = "dateperemption")
   private LocalDate datePeremption;
    

	
   public LocalDate getDatePeremption() {
		return datePeremption;
	}

   public void setDatePeremption(LocalDate localDate) {
		this.datePeremption = localDate;
	}

   public float getQuantite() {
		return quantite;
	}

   public void setQuantite(float quantite) {
	   this.quantite = quantite;
	}
    
  


}

