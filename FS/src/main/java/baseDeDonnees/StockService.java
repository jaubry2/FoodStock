package baseDeDonnees;

import java.util.List;

import modeleDeDonnees.Stock;

public class StockService extends HibernateService  {
	public void ajouter(Stock a) {
        session.persist(a);
        transaction.commit();

	}
	
	public void mettreAJourTable(List<Stock> ListStock) {
		
		try {
			for (Stock stock : ListStock) {
				session.merge(stock);
			}
		}
		catch (Exception e) {
			
		}
		
		transaction.commit();
	}
	
	public List<Stock> importerTable(){
		return session.createNativeQuery("SELECT * FROM Stock", Stock.class).getResultList();
	}
}
