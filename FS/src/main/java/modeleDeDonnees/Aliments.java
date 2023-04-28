package modeleDeDonnees;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;



@Entity
@Table(name = "aliments")

public class Aliments {
	
	public Aliments() {};
    public Aliments(String nom, UnitedeMesure uniteMesure, MoyendeConservation moyenConservation,
			TypeAliment typeAliment) {
		super();
		this.nom = nom;
		this.uniteMesure = uniteMesure;
		this.moyenConservation = moyenConservation;
		this.typeAliment = typeAliment;
	}

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nom")
    private String nom;
    
    @Enumerated(EnumType.STRING) 
    @Column(name = "uniteMesure")
    private UnitedeMesure uniteMesure;
    
    @Enumerated(EnumType.STRING) 
    @Column(name = "moyenConservation")
    private MoyendeConservation moyenConservation;
    
    @Enumerated(EnumType.STRING) 
    @Column(name = "typeAliment")
    private TypeAliment typeAliment;


	public TypeAliment getTypeAliment() {
		return typeAliment;
	}

	public void setTypeAliment(TypeAliment typeAliment) {
		this.typeAliment = typeAliment;
	}

	public UnitedeMesure getUniteMesure() {
		return uniteMesure;
	}

	public MoyendeConservation getMoyenConservation() {
		return moyenConservation;
	}

	public void setMoyenConservation(MoyendeConservation moyenConservation) {
		this.moyenConservation = moyenConservation;
	}

	public void setUniteMesure(UnitedeMesure uniteMesure) {
		this.uniteMesure = uniteMesure;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom  = nom;
	}

}

