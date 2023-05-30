package modeleDeDonnees;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import baseDeDonnees.AlimentService;

public class EnsembleStock {

    // Le Map stock qui contient tous les emplacements et les aliments stockés dans chaque emplacement
    private Map<String, Stock> stocks;

    /**
     * Constructeur qui initialise le Map stock.
     */
    public EnsembleStock() {
        this.setStock(new HashMap<>());
    }

    /**
     * Crée un nouvel emplacement dans le Map stocks avec un nom donné.
     *
     * @param nomstock le nom de l'emplacement à créer.
     * @param stock    le nouveau stock à associer à l'emplacement
     */
    public void CreerStock(String nomstock, Stock stock) {
        stocks.put(nomstock, stock);
    }

    /**
     * Renvoie la map des stocks d'aliments.
     *
     * @return la map des stocks d'aliments
     */
    public Map<String, Stock> getStock() {
        return stocks;
    }

    /**
     * Modifie la map des stocks d'aliments.
     *
     * @param stock la nouvelle map des stocks d'aliments à définir
     */
    public void setStock(Map<String, Stock> stock) {
        this.stocks = stock;
    }

    /**
     * Renvoie le stock associé à la clé donnée, ou null si la clé n'est pas trouvée.
     *
     * @param key la clé pour laquelle chercher le stock
     * @return le stock associé à la clé donnée, ou null si la clé n'est pas trouvée
     */
    public Stock getStockFromMap(String key) {
        if (stocks.containsKey(key)) {
            return stocks.get(key);
        } else {
            return null;
        }
    }
}
