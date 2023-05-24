package modeleDeDonnees;
import java.util.Date;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;



@Entity
@Table(name = "aliment")
/**

Cette classe représente les aliments stockés.
Elle contient les informations suivantes :
    id : identifiant de l'aliment
    nom : nom de l'aliment
    uniteMesure : unité de mesure de l'aliment (par exemple : gramme, litre, ...)
    moyenConservation : moyen de conservation de l'aliment (par exemple : vrac, bouteille, ...)
    typeAliment : type de l'aliment (par exemple : viande, légume, ...)
    */

public class Aliment {
	
	/**
	 * Constructeur par défaut.
	 */
	public Aliment() {};
	/**
	 * Constructeur avec paramètres
	 * @param nom : nom de l'aliment
	 * @param uniteMesure : unité de mesure de l'aliment
	 * @param moyenConservation : moyen de conservation de l'aliment
	 * @param typeAliment : type de l'aliment
	 */
    public Aliment(String nom, UnitedeMesure uniteMesure, MoyendeConservation moyenConservation,
			TypeAliment typeAliment) {
		super();
		this.nom = nom;
		this.uniteMesure = uniteMesure;
		this.moyenConservation = moyenConservation;
		this.typeAliment = typeAliment;
	}


	/**

    Identifiant unique de l'aliment en base de données.
    */
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

	/**

    Nom de l'aliment.
    */
    @Column(name = "nom")
    private String nom;
    
    /**

    Unité de mesure de l'aliment, telle que "gramme", "kilogramme", "millilitre", etc.
    */
    
    @Enumerated(EnumType.STRING) 
    @Column(name = "uniteMesure")
    private UnitedeMesure uniteMesure;
    
    /**

    Moyen de conservation de l'aliment, tel que "vrac", "bouteille", "conserve", "sachet", etc.
    */
    @Enumerated(EnumType.STRING) 
    @Column(name = "moyenConservation")
    private MoyendeConservation moyenConservation;
    
    /**

    Type de l'aliment, tel que "fruits", "légumes", "viandes", "poissons", etc.
    */
    @Enumerated(EnumType.STRING) 
    @Column(name = "typeAliment")
    private TypeAliment typeAliment;
    


/**
 * Retourne l'identifiant de l'aliment
 * @return l'identifiant de l'aliment
 */
public Long getId() {
	return id;
}
/**
 * Modifie l'identifiant de l'aliment
 * @param id : le nouvel identifiant
 */
	public void setId(Long id) {
	this.id = id;
}

	/**

    Renvoie le type d'aliment de l'objet Aliments.
    @return Le type d'aliment de l'objet Aliments.
    */
	public TypeAliment getTypeAliment() {
		return typeAliment;
	}

	/**

    Modifie le type d'aliment de l'objet Aliments.
    @param typeAliment Le nouveau type d'aliment de l'objet Aliments.
    */
	public void setTypeAliment(TypeAliment typeAliment) {
		this.typeAliment = typeAliment;
	}
	
	/**

    Modifie le type d'aliment de l'objet Aliments.
    @param typeAliment Le nouveau type d'aliment de l'objet Aliments.
    */
	public MoyendeConservation getMoyenConservation() {
		return moyenConservation;
	}

	/**

    Modifie le mode de conservation de l'objet Aliments.
    @param moyenConservation Le nouveau mode de conservation de l'objet Aliments.
    */
	public void setMoyenConservation(MoyendeConservation moyenConservation) {
		this.moyenConservation = moyenConservation;
	}



	/**
	 * Retourne l'unité de mesure de l'aliment
	 * @return l'unité de mesure de l'aliment
	 */
	public UnitedeMesure getUniteMesure() {
		return uniteMesure;
	}

/**
 * Modifie l'unité de mesure de l'aliment
 * @param uniteMesure : la nouvelle unité de mesure
 */
	public void setUniteMesure(UnitedeMesure uniteMesure) {
		this.uniteMesure = uniteMesure;
	
	}
	
	/**
	 * Retourne le nom de l'aliment
	 * @return le nom de l'aliment
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * Modifie le nom de l'aliment
	 * @param nom : le nouveau nom
	 */
	
	public void setNom(String nom) {
		this.nom  = nom;
	}
	
	public boolean equals(Aliment alimentComparaison) {
	    if (this == alimentComparaison ) {
	        return true;
	    }
	    if (alimentComparaison == null ) {
	        return false;
	    }
	    return this.nom.equals(alimentComparaison.getNom());
	}

	
}

