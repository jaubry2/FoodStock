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

/**
 * Classe représentant un ingrédient utilisé dans une recette.
 */
@Entity
@Table(name = "ingredient")
public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Aliment associé à l'ingrédient.
     */
    @OneToOne
    @JoinColumn(name = "idAliment", referencedColumnName = "id")
    private Aliment aliment;

    /**
     * Quantité de l'ingrédient utilisée dans la recette.
     */
    @Column(name = "quantite")
    private float quantite;

    /**
     * Identifiant de la recette à laquelle l'ingrédient appartient.
     */
    @Column(name = "recette_id")
    private Long recette_id;

    /**
     * Constructeur par défaut de la classe Ingredient.
     */
    public Ingredient() {
    }

    /**
     * Constructeur de la classe Ingredient avec les paramètres spécifiés.
     *
     * @param aliment  L'aliment associé à l'ingrédient.
     * @param quantite La quantité de l'ingrédient.
     */
    public Ingredient(Aliment aliment, float quantite) {
        this.aliment = aliment;
        this.quantite = quantite;
    }

    /**
     * Retourne l'identifiant de l'ingrédient.
     *
     * @return L'identifiant de l'ingrédient.
     */
    public long getId() {
        return id;
    }

    /**
     * Retourne l'aliment associé à l'ingrédient.
     *
     * @return L'aliment associé à l'ingrédient.
     */
    public Aliment getAliment() {
        return aliment;
    }

    /**
     * Modifie la quantité de l'ingrédient.
     *
     * @param nouvelleQuantite La nouvelle quantité de l'ingrédient.
     */
    public void setQuantite(float nouvelleQuantite) {
        this.quantite = nouvelleQuantite;
    }

    /**
     * Retourne la quantité de l'ingrédient.
     *
     * @return La quantité de l'ingrédient.
     */
    public float getQuantite() {
        return quantite;
    }

    /**
     * Vérifie si l'ingrédient est égal à l'aliment spécifié.
     *
     * @param aliment L'aliment à comparer.
     * @return Vrai si l'ingrédient est égal à l'aliment spécifié, sinon faux.
     */
    public boolean isAliment(Aliment aliment) {
        return this.aliment.equals(aliment);
    }

    /**
     * Vérifie si l'ingrédient est égal à l'ingrédient de comparaison spécifié.
     *
     * @param ingredientComparaison L'ingrédient de comparaison.
     * @return Vrai si l'ingrédient est égal à l'ingrédient de comparaison, sinon faux.
     */
    public boolean equals(Ingredient ingredientComparaison) {
        return this.getAliment().equals(ingredientComparaison.getAliment());
    }
}
