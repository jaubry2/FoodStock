package modeleDeDonnees;



import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import baseDeDonnees.AlimentService;


public class Stock {



// La liste d'aliments stockes  qui contient tous les emplacements et les aliments stockés dans chaque emplacement
private List<AlimentStockes> stock;

/**
 * Constructeur qui initialise le stock.
 */
public Stock(List<AlimentStockes> stock ) {
	this.stock = stock;   
}
public Stock() {
	this.stock = new HashSet<>();   
}
public List<AlimentStockes> getStock(){
	return stock;
}

public void  setStock(List<AlimentStockes> stock) {
	this.stock = stock;
}

/**
 * Retourne une liste filtrée des aliments stockés correspondant à un type d'aliment donné.
 * @param typeAliment le type d'aliment à filtrer
 * @return une liste des aliments stockés correspondant au type d'aliment donné
 */
public List<AlimentStockes> filtrerType(TypeAliment typeAliment){
	
	List<AlimentStockes> listStockfiltre = new ArrayList<AlimentStockes>();
	for (AlimentStockes alimentsStock : stock ) {
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
 * @param duree la durée en jours pour laquelle les objets AlimentStockes sont considérés comme proches de leur date de péremption
 * @return une liste des objets AlimentStockes dont la date de péremption est proche
 */
public List<AlimentStockes> filtrerDate( int duree) {
    List<AlimentStockes> listStockFiltre = new ArrayList<>();
    for (AlimentStockes alimentStock : stock) {
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
public void ajouterAliment(AlimentStockes alimentsStock) {
	stock.add(alimentsStock);
}


/**
 * Ajoute un aliment stocké à partir du nom de l'emplacement, de l'aliment, de la quantité et de la date de péremption.
 * @param aliment l'aliment à ajouter dans l'emplacement.
 * @param quantite la quantité de l'aliment à ajouter.
 * @param datePeremption la date de péremption de l'aliment à ajouter.
 */
    public void ajouterAliment(Aliment aliment, float quantite,LocalDate datePeremption) {

    	AlimentStockes alimentsStock = new AlimentStockes(aliment,quantite, datePeremption);
    	ajouterAliment(alimentsStock);
    }
    
    /**
     * Ajoute un aliment stocké  à partir d'une liste
     * @param listAjout la liste à ajouter dans l'emplacement.
     */
        public void ajouterListe(List<AlimentStockes> listAjout) {
        	stock.addAll(listAjout);

        }
    /**

    Cette méthode retire un aliment stocké dans le stock spécifié.
    @param alimentsStock L'aliment stocké que l'on veut retirer du stock.
    */
    public void retirerAliment( AlimentStockes alimentsStock) {
    	stock.remove(alimentsStock);
        }
    
    /**
     * Affiche le contenu de tous les stocks de nourriture sous la forme :
     * "Stock <nomStock> :
     * - <nomAliment> (<quantite><uniteMesure>)<datePeremption>"
     */
    public void afficherContenuStock() {
        System.out.println("Contenu du stock :");
            System.out.println("Stock  :");
            for (AlimentStockes alimentsStock : stock) {
               System.out.println("- " + alimentsStock.getAliment().getNom() + " (" + alimentsStock.getQuantite() + alimentsStock.getAliment().getUniteMesure()+")"+ alimentsStock.getDatePeremption());
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
     * Cherche un objet Aliments dans le stock  en fonction du nom de l'aliment.
     * 
     * @param nom le nom de l'aliment recherché
     * @return l'objet Aliments correspondant au nom de l'aliment recherché, ou null si l'aliment n'est pas trouvé
     */
    public  boolean  isAlimentStockesByName(String nomAliment) {
    	System.out.println("recherche");
        for (AlimentStockes alimentstockes : stock) {
        	
            if (alimentstockes.getAliment().getNom().equals(nomAliment)) {
                return true;
            }
        }
        return false;
    }
    public  AlimentStockes getAlimentStockesByName( String nomAliment) {
        for (AlimentStockes alimentstockes : stock) {
            if (alimentstockes.getAliment().getNom().equals(nomAliment)) {
                return alimentstockes;
            }
        }
        throw new AlimentsNonPresentException(nomAliment);    
    }

	/*public float getQuantiteAlimentStocke(String nom) {
		
		return getAlimentStockesByName(nom).getQuantite();
	}*/
	
	/*public void retirerQuantiteStock( String nomAliment, float quantite) {
		AlimentStockes  aS = this.getAlimentStockesByName(nomAliment);
		aS.setQuantite(quantite);
	}*/
	
	public void retirerQuantiteStock( String nomAliment, float quantite) {
		List<AlimentStockes> listAlimentSupp = new ArrayList<>();
		for (AlimentStockes alimentstockes : stock) {
            if (alimentstockes.getAliment().getNom().equals(nomAliment)) {
            	listAlimentSupp.add(alimentstockes);
            }
        }
		//Tri de la liste par date de peremption
		listAlimentSupp.sort(Comparator.comparing(AlimentStockes::getDatePeremption));		
		int i =0;
		while(quantite > 0) {
			AlimentStockes alimentStock = listAlimentSupp.get(i);
		float quantiteAliment = alimentStock.getQuantite();
		 quantite = quantite - quantiteAliment;
		 if (quantite >= 0) {
			 this.retirerAliment(alimentStock);
		 }
		 else {
			 listAlimentSupp.get(i).setQuantite(quantite);

		 }
		i++;		
		}
		
	}

	public float getQuantiteASNonPerime(String nomAliment) {
		float quantite=0;
		for (AlimentStockes alimentstockes : stock) {
            if (alimentstockes.getAliment().getNom().equals(nomAliment)) {
            	if (alimentstockes.getDatePeremption().isAfter(LocalDate.now())){
            		quantite+= alimentstockes.getQuantite();
            	}
            }
        }
		return quantite;
	}
	public LocalDate getDatePlusRecente(String nomALiment) {
		List<AlimentStockes> listAliment = new ArrayList<>();
		for (AlimentStockes alimentstockes : stock) {
            if (alimentstockes.getAliment().getNom().equals(nomALiment)) {
            	listAliment.add(alimentstockes);
            }
        }
		//Tri de la liste par date de peremption
		listAliment.sort(Comparator.comparing(AlimentStockes::getDatePeremption));
		return listAliment.get(0).getDatePeremption();
	}

}
