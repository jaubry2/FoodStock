package modeleDeDonnees;



import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import baseDeDonnees.AlimentsService;

public class Stock {



// Le Map stock qui contient tous les emplacements et les aliments stockés dans chaque emplacement
private Map<String, List<AlimentStockes>> stocks;

/**
 * Constructeur qui initialise le Map stock.
 */
public Stock() {
    this.setStock(new HashMap<>());
   
}


/**
 * Crée un nouvel emplacement dans le Map stock avec un nom donné.
 * @param nomstock le nom de l'emplacement à créer.
 */
public void creerstock(String nomstock){
    getStock().put(nomstock,new ArrayList<AlimentStockes>()); 
}

/**

Renvoie la map des stocks d'aliments,
@return la map des stocks d'aliments
*/
public Map<String, List<AlimentStockes>> getStock() {
	return stocks;
}

/**

Modifie la map des stocks d'aliments
@param stock la nouvelle map des stocks d'aliments à définir
*/
public void setStock(Map<String, List<AlimentStockes>> stock) {
	this.stocks = stock;
}

/**
 * Remplit un emplacement du Map stock avec une liste d'aliments stockés donnée.
 * Si l'emplacement n'existe pas encore dans le Map stock, il est créé.
 * @param nomStock le nom de l'emplacement à remplir.
 * @param alimentStocks la liste d'aliments à stocker dans l'emplacement.
 */
public void remplirstock(String nomStock, List<AlimentStockes> alimentStocks) {
    if (stocks.containsKey(nomStock)) {
    	stocks.put(nomStock,alimentStocks);
    } else {
    	stocks.put(nomStock, new ArrayList<>(alimentStocks));
    }
}
/**
 * Retourne une liste filtrée des aliments stockés correspondant à un type d'aliment donné.
 * @param nomStock le nom du stock à filtrer
 * @param typeAliment le type d'aliment à filtrer
 * @return une liste des aliments stockés correspondant au type d'aliment donné
 */
public List<AlimentStockes> filtrerType(String nomStock,TypeAliment typeAliment){
	
	List<AlimentStockes>listStock = this.getListFromMap(nomStock);
	List<AlimentStockes> listStockfiltre = new ArrayList<AlimentStockes>();
	for (AlimentStockes alimentsStock : listStock) {
		if (alimentsStock.getAliment().getTypeAliment()== typeAliment) {
			listStockfiltre.add(alimentsStock);
		}
	}
	return listStockfiltre;
}

/**
 * Filtre les objets AlimentStockes d'un stock ayant une date de péremption proche
 * selon la durée spécifiée.
 *
 * @param nomStock le nom du stock à filtrer
 * @param duree la durée en jours pour laquelle les objets AlimentStockes sont considérés comme proches de leur date de péremption
 * @return une liste des objets AlimentStockes dont la date de péremption est proche
 */
public List<AlimentStockes> filtrerDate(String nomStock, int duree) {
    List<AlimentStockes> listStock = this.getListFromMap(nomStock);
    List<AlimentStockes> listStockFiltre = new ArrayList<>();
    for (AlimentStockes alimentStock : listStock) {
        if (alimentStock.getDatePeremption().minusDays(duree).isBefore(LocalDate.now())) {
            listStockFiltre.add(alimentStock);
        }
    }
    return listStockFiltre;
}


/**
 * Ajoute un aliment stocké dans un emplacement du Map stock à partir du nom de l'emplacement et de l'aliment stocké.
 * @param nomStock le nom de l'emplacement où ajouter l'aliment.
 * @param alimentsStock l'aliment à ajouter dans l'emplacement.
 */
public void ajouterAliment(String nomStock ,AlimentStockes alimentsStock) {
	stocks.get(nomStock).add(alimentsStock);
}


/**
 * Ajoute un aliment stocké dans un emplacement du Map stock à partir du nom de l'emplacement, de l'aliment, de la quantité et de la date de péremption.
 * @param nomStock le nom de l'emplacement où ajouter l'aliment.
 * @param aliment l'aliment à ajouter dans l'emplacement.
 * @param quantite la quantité de l'aliment à ajouter.
 * @param datePeremption la date de péremption de l'aliment à ajouter.
 */
    public void ajouterAliment(String nomStock ,Aliment aliment, float quantite,LocalDate datePeremption) {
        /*if (!stock.containsKey(nomStock)) {
            stock.put(nomStock, new ArrayList<Aliments>());
        }*/
    	AlimentStockes alimentsStock = new AlimentStockes(aliment,quantite, datePeremption);
    	ajouterAliment(nomStock ,alimentsStock);
    }
    
    /**
     * Ajoute un aliment stocké dans un emplacement du Map stock à partir d'une liste
     * @param nomStock le nom de l'emplacement où ajouter l'aliment.
     * @param listAjout la liste à ajouter dans l'emplacement.
     */
        public void ajouterListe(String nomStock ,List<AlimentStockes> listAjout) {
        	stocks.get(nomStock).addAll(listAjout);

        }
    /**

    Cette méthode retire un aliment stocké dans le stock spécifié.
    @param nomStock Le nom du stock duquel on veut retirer l'aliment.
    @param alimentsStock L'aliment stocké que l'on veut retirer du stock.
    */
    public void retirerAliment(String nomStock, AlimentStockes alimentsStock) {
        if (stocks.containsKey(nomStock)) {
        	stocks.get(nomStock).remove(alimentsStock);
        }
    }
    /**
     * Affiche le contenu de tous les stocks de nourriture sous la forme :
     * "Stock <nomStock> :
     * - <nomAliment> (<quantite><uniteMesure>)<datePeremption>"
     */
    public void afficherContenuStock() {
        System.out.println("Contenu du stock :");
        for (String nomStock : stocks.keySet()) {
            System.out.println("Stock \"" + nomStock + "\" :");
            List<AlimentStockes> alimentsStocks = stocks.get(nomStock);
            for (AlimentStockes alimentsStock : alimentsStocks) {
                //System.out.println("- " + " (" + alimentsStock.getQuantite() +  alimentsStock.getDatePeremption());

               System.out.println("- " + alimentsStock.getAliment().getNom() + " (" + alimentsStock.getQuantite() + alimentsStock.getAliment().getUniteMesure()+")"+ alimentsStock.getDatePeremption());
            }
        }
    }
    /**
     * Cherche un objet Aliments dans une liste d'objets Aliments en fonction du nom de l'aliment.
     * 
     * @param listAliments la liste d'objets Aliments dans laquelle chercher
     * @param nom le nom de l'aliment recherché
     * @return l'objet Aliments correspondant au nom de l'aliment recherché, ou null si l'aliment n'est pas trouvé
     */
    public static Aliment getAlimentByName(List<Aliment> listAliments, String nom) {
        for (Aliment aliment : listAliments) {
            if (aliment.getNom().equals(nom)) {
                return aliment;
            }
        }
        throw new AlimentsNonPresentException(nom);
    }
    /**
     * Renvoie la liste d'objets AlimentStockes associée à la clé donnée, ou une nouvelle liste vide si la clé n'est pas trouvée.
     * 
     * @param key la clé pour laquelle chercher la liste d'objets AlimentStockes
     * @return la liste d'objets AlimentStockes associée à la clé donnée, ou une nouvelle liste vide si la clé n'est pas trouvée
     */
    public List<AlimentStockes> getListFromMap(String key) {
        if (stocks.containsKey(key)) {
            return stocks.get(key);
        } else {
            return new ArrayList<AlimentStockes>();
        }
    }


}
