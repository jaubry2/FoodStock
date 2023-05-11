package TestBDD;

import java.time.LocalDate;
import java.util.List;

import baseDeDonnees.AlimentStockeService;
import baseDeDonnees.AlimentsService;
import baseDeDonnees.HibernateService;
import modeleDeDonnees.AlimentStockes;
import modeleDeDonnees.Aliments;
import modeleDeDonnees.Stock;

public class TestStock {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HibernateService.CreerConfig();
		List<Aliments> ListAliments = AlimentsService.importerTableAliment();

		
		try {
			Stock stocks = new Stock();
			List<AlimentStockes> list=AlimentStockeService.importerTableAlimentStock();
			stocks.remplirstock("principal",list );
			System.out.println("importation de la base :");
			stocks.afficherContenuStock();
			AlimentStockes alimentsStock = new AlimentStockes(Stock.getAlimentByName(ListAliments, "tomate"), (float) 10.5,LocalDate.of(2023, 4, 23));
			stocks.ajouterAliment("principal", alimentsStock);
			System.out.println("ajout élément local :");
			stocks.afficherContenuStock();
	        AlimentStockeService.mettreAJourTable(stocks.getListFromMap("principal"));
			list=AlimentStockeService.importerTableAlimentStock();
			stocks.remplirstock("principal",list );
			System.out.println("vérification ajout  élément base :");
			stocks.afficherContenuStock();
	        stocks.retirerAliment("principal", list.get(0));
			System.out.println("retrait élément local :");
			stocks.afficherContenuStock();
			

	        /*AlimentStockes alimentsStock2 = new AlimentStockes(Stock.getAlimentByName(Stock.ListAliments, "poivron"), (float) 14.5,LocalDate.of(2023, 4, 23));
			stocks.ajouterAliment("principal", alimentsStock2);*/
	        AlimentStockeService.mettreAJourTable(stocks.getListFromMap("principal")); 
			List<AlimentStockes> listB=AlimentStockeService.importerTableAlimentStock();
			stocks.remplirstock("principal",listB );
			System.out.println("verification retrait élément base :");
			stocks.afficherContenuStock();


			
		} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
			
	
		}

}
