package modeleDeDonnees;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Cette classe représente les aliments stockés.
 * Elle contient les informations suivantes :
 * - id : identifiant de l'aliment
 * - nom : nom de l'aliment
 * - uniteMesure : unité de mesure de l'aliment (par exemple : gramme, litre, ...)
 * - moyenConservation : moyen de conservation de l'aliment (par exemple : vrac, bouteille, ...)
 * - typeAliment : type de l'aliment (par exemple : viande, légume, ...)
 */
@Entity
@Table(name = "aliment")
public class Aliment {

/**
* Identifiant unique de l'aliment en base de données.
*/
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

/**
* Nom de l'aliment.
*/
@Column(name = "nom")
private String nom;

/**
* Unité de mesure de l'aliment, telle que "gramme", "kilogramme", "millilitre", etc.
*/
@Enumerated(EnumType.STRING)
@Column(name = "uniteMesure")
private UnitedeMesure uniteMesure;

/**
* Moyen de conservation de l'aliment, tel que "vrac", "bouteille", "conserve", "sachet", etc.
*/
@Enumerated(EnumType.STRING)
@Column(name = "moyenConservation")
private MoyendeConservation moyenConservation;

/**
* Type de l'aliment, tel que "fruits", "légumes", "viandes", "poissons", etc.
*/
@Enumerated(EnumType.STRING)
@Column(name = "typeAliment")
private TypeAliment typeAliment;

/**
* Constructeur par défaut de la classe Aliment.
*/
public Aliment() {
}

/**
* Constructeur de la classe Aliment avec les paramètres spécifiés.
*
* @param nom            	Le nom de l'aliment.
* @param uniteMesure    	L'unité de mesure de l'aliment.
* @param moyenConservation  Le moyen de conservation de l'aliment.
* @param typeAliment    	Le type de l'aliment.
*/
public Aliment(String nom, UnitedeMesure uniteMesure, MoyendeConservation moyenConservation,
	TypeAliment typeAliment) {
this.nom = nom;
this.uniteMesure = uniteMesure;
this.moyenConservation = moyenConservation;
this.typeAliment = typeAliment;
}

/**
* Retourne l'identifiant de l'aliment.
*
* @return L'identifiant de l'aliment.
*/
public Long getId() {
return id;
}

/**
* Modifie l'identde l'aliment avec l'identifiant spécifié. 
* 
* @param id Le nouvel identifiant de l'aliment. 
*/ public void setId(Long id) {
this.id = id; 
}
/**
 * Retourne le type d'aliment de l'objet Aliment.
 *
 * @return Le type d'aliment de l'objet Aliment.
 */
public TypeAliment getTypeAliment() {
	return typeAliment;
}

/**
 * Modifie le type d'aliment de l'objet Aliment.
 *
 * @param typeAliment Le nouveau type d'aliment de l'objet Aliment.
 */
public void setTypeAliment(TypeAliment typeAliment) {
	this.typeAliment = typeAliment;
}

/**
 * Retourne le moyen de conservation de l'objet Aliment.
 *
 * @return Le moyen de conservation de l'objet Aliment.
 */
public MoyendeConservation getMoyenConservation() {
	return moyenConservation;
}

/**
 * Modifie le moyen de conservation de l'objet Aliment.
 *
 * @param moyenConservation Le nouveau moyen de conservation de l'objet Aliment.
 */
public void setMoyenConservation(MoyendeConservation moyenConservation) {
	this.moyenConservation = moyenConservation;
}

/**
 * Retourne l'unité de mesure de l'aliment.
 *
 * @return L'unité de mesure de l'aliment.
 */
public UnitedeMesure getUniteMesure() {
	return uniteMesure;
}

/**
 * Modifie l'unité de mesure de l'aliment.
 *
 * @param uniteMesure La nouvelle unité de mesure de l'aliment.
 */
public void setUniteMesure(UnitedeMesure uniteMesure) {
	this.uniteMesure = uniteMesure;
}

/**
 * Retourne le nom de l'aliment.
 *
 * @return Le nom de l'aliment.
 */
public String getNom() {
	return nom;
}

/**
 * Modifie le nom de l'aliment.
 *
 * @param nom Le nouveau nom de l'aliment.
 */
public void setNom(String nom) {
	this.nom = nom;
}

/**
 * Vérifie si l'aliment est égal à l'aliment de comparaison spécifié.
 *
 * @param alimentComparaison L'aliment de comparaison.
 * @return Vrai si l'aliment est égal à l'aliment de comparaison, sinon faux.
 */
public boolean equals(Aliment alimentComparaison) {
	if (this == alimentComparaison) {
    	return true;
	}
	if (alimentComparaison == null) {
    	return false;
	}
	return this.nom.equals(alimentComparaison.getNom());
}
}


