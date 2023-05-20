package TestBDD;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import baseDeDonnees.*;
import modeleDeDonnees.*;



public class TestImportMaJAlimentsAlimentsStockes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HibernateService.CreerConfig();
		
		try {
			List<Aliment> ListAliments = AlimentService.importerTableAliment();
			List<AlimentStockes> ListAlimentsStockes = AlimentStockeService.importerTableAlimentStock();
			//System.out.println(ListAliments.get(0));
			Aliment poivron = new Aliment("poivron",UnitedeMesure.Unite,MoyendeConservation.Sachet
					,TypeAliment.Fruits_Legumes);
	        ListAliments.add(poivron);
	        
	       
	        AlimentService.mettreAJourTable(ListAliments);
	        AlimentStockes poivronStock = new AlimentStockes(AlimentService.findByName("poivron"),3
	        		,LocalDate.of(2023, 4, 23));
	       // poivronStock.setQuantite(3);
	        //poivronStock.setDatePeremption(LocalDate.of(2023, 4, 23));
	        //poivronStock.setAliment(AlimentsService.findById("poivron"));
	        ListAlimentsStockes.add(poivronStock);
	        AlimentStockeService.mettreAJourTable(ListAlimentsStockes);

	        
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
