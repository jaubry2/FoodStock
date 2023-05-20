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
/**

Cette classe représente un aliment stocké dans le stock de l'utilisateur.

Chaque aliment stocké possède un identifiant unique, un aliment, une quantité et une date de péremption.
*/

public class AlimentStockes {


	/**
    Constructeur par défaut de la classe AlimentStockes nécessaire pour la base de donnée.
    */
	public AlimentStockes() {}
	/**

    Constructeur avec paramètres de la classe AlimentStockes.
    @param aliment l'aliment stocké
    @param quantite la quantité de l'aliment stocké
    @param datePeremption la date de péremption de l'aliment stocké
    */
    public AlimentStockes(Aliment aliment, float quantite, LocalDate datePeremption) {
		super();
		this.aliment = aliment;
		this.quantite = quantite;
		this.datePeremption = datePeremption;
	}
    
    /**

    Constructeur avec paramètres de la classe AlimentStockes.
    @param id l'identifiant de l'aliment stocké
    @param aliment l'aliment stocké
    @param quantite la quantité de l'aliment stocké
    @param datePeremption la date de péremption de l'aliment stocké
    */
    public AlimentStockes(Long id, Aliment aliment, float quantite, LocalDate datePeremption) {
    	super();
    	this.id =id;
		this.aliment = aliment;
		this.quantite = quantite;
		this.datePeremption = datePeremption;	}

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	/**

    L'identifiant unique de l'aliment stocké en base .
    */
    	private Long id;
	/**

    Retourne l'identifiant unique de l'aliment stocké.
    @return l'identifiant unique de l'aliment stocké
    */
	public Long getId() {
		return id;
	}
	/**

    Modifie l'identifiant unique de l'aliment stocké.
    @param id le nouvel identifiant unique de l'aliment stocké
    */
	public void setId(Long id) {
		this.id = id;
	}

	@ManyToOne @JoinColumn(name="idAlimemts",referencedColumnName ="id", nullable=false)
	/**

    L'aliment stocké.
    */
    private Aliment aliment;

	/**

    Retourne l'aliment stocké.
    @return l'aliment stocké
    */
    public Aliment getAliment() {
		return aliment;
	}
    /**

    Modifie l'aliment stocké.
    @param aliment le nouvel aliment stocké
    */
	public void setAliment(Aliment aliment) {
		this.aliment = aliment;
	}

	@Column(name = "quantite")
	/**
    La quantité de l'aliment stocké.
    */
	   private float  quantite;
	
	/**
	/**

   Retourne la quantité de l'aliment stocké.
   @return la quantité de l'aliment stocké
   */
   public float getQuantite() {
		return quantite;
	}

   /**

   Modifie la quantité de l'aliment stocké.
   @param quantite la nouvelle quantité de l'aliment stocké
   */
   public void setQuantite(float quantite) {
	   this.quantite = quantite;
	}
   /**
    La date de péremption de l'aliment stocké.
    */
	
	@Column(name = "dateperemption")
   private LocalDate datePeremption;
    

	  /**

	   Retourne la date de péremption de l'aliment stocké.
	   @return datePeremption la nouvelle date de peremption de l'aliment stocké
	   */
   public LocalDate getDatePeremption() {
		return datePeremption;
	}

   /**

   Modifie la date de péremption de l'aliment stocké.
   @param datePeremption la nouvelle date de peremption de l'aliment stocké
   */
   public void setDatePeremption(LocalDate localDate) {
		this.datePeremption = localDate;
	}
   
	
    
  


}

