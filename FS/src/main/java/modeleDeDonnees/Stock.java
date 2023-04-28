package modeleDeDonnees;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import baseDeDonnees.AlimentsService;

public class Stock {
	public static List<Aliments> ListAliments = AlimentsService.importerTableAliment();
    private Map<String, List<AlimentStockes>> stock;
    
    public Stock() {
        this.stock = new HashMap<>();
    }
    public void creerstock(String nomstock){
        stock.put(nomstock,new ArrayList<AlimentStockes>()); 
    }

    public void remplirstock(String nomStock, List<AlimentStockes> alimentStocks) {
        if (stock.containsKey(nomStock)) {
            stock.put(nomStock,alimentStocks);
        } else {
            stock.put(nomStock, new ArrayList<>(alimentStocks));
        }
    }

    /*
     * ajout d'un aliments à partir du nom du stock et de l'aliments stockés.
     */
    public void ajouterAliment(String nomStock ,AlimentStockes alimentsStock) {
        stock.get(nomStock).add(alimentsStock);
    }
    /*
     * ajout d'un aliments à partir du nom du stock,de l'aliments, de la quantité et de la date de peremption.
     */
    public void ajouterAliment(String nomStock ,Aliments aliment, float quantite,LocalDate datePeremption) {
        /*if (!stock.containsKey(nomStock)) {
            stock.put(nomStock, new ArrayList<Aliments>());
        }*/
    	AlimentStockes alimentsStock = new AlimentStockes(aliment,quantite, datePeremption);
    	ajouterAliment(nomStock ,alimentsStock);
    }
    
    public void retirerAliment(String nomStock, AlimentStockes alimentsStock) {
        if (stock.containsKey(nomStock)) {
            stock.get(nomStock).remove(alimentsStock);
        }
    }
    
    public void afficherContenuStock() {
        System.out.println("Contenu du stock :");
        for (String nomStock : stock.keySet()) {
            System.out.println("Stock \"" + nomStock + "\" :");
            List<AlimentStockes> alimentsStocks = stock.get(nomStock);
            for (AlimentStockes alimentsStock : alimentsStocks) {
                //System.out.println("- " + " (" + alimentsStock.getQuantite() +  alimentsStock.getDatePeremption());

               System.out.println("- " + alimentsStock.getAliment().getNom() + " (" + alimentsStock.getQuantite() + alimentsStock.getAliment().getUniteMesure()+")"+ alimentsStock.getDatePeremption());
            }
        }
    }
    public static Aliments getAlimentByName(List<Aliments> listAliments, String nom) {
        for (Aliments aliment : listAliments) {
            if (aliment.getNom().equals(nom)) {
                return aliment;
            }
        }
        return null;
    }
    public List<AlimentStockes> getListFromMap(String key) {
        if (stock.containsKey(key)) {
            return stock.get(key);
        } else {
            return new ArrayList<AlimentStockes>();
        }
    }

}
