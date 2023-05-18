package baseDeDonnees;

import java.time.LocalDate;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Query;
import modeleDeDonnees.AlimentStockes;
import modeleDeDonnees.Aliment;

/**

Cette classe représente le service pour la gestion des AlimentStockes en base de données avec Hibernate.
Elle contient des méthodes pour ajouter, mettre à jour et supprimer des éléments de la table AlimentStockes.
*/
public class AlimentStockeService extends HibernateService  {
	
	
	/**
	 * Met à jour la table AlimentStockes en ajoutant, modifiant ou supprimant des éléments.
	 * @param ListAlimentStockes la liste d'AlimentStockes à mettre à jour.
	 */
	public static void mettreAJourTable(List<AlimentStockes> ListAlimentStockes) {
	 
		
		transaction = session.beginTransaction();
		try {
			// Récupérer tous les AlimentStockes de la table avec HQL
						List<AlimentStockes> listBDD=AlimentStockeService.importerTableAlimentStock();

				        
				        // Parcourir la liste de la table et supprimer les AlimentStockes qui ne sont plus dans ListAlimentStockes
				        for (AlimentStockes alimentsBDD : listBDD) {
				            if (!ListAlimentStockes.stream().anyMatch(aliments -> alimentsBDD.getId() == aliments.getId())) {
				            	String hql = "DELETE FROM AlimentStockes WHERE id = :alimentId";
				            	Query query = session.createQuery(hql);
				            	query.setParameter("alimentId", alimentsBDD.getId());
				            	int result = query.executeUpdate();
				            }
				        }
			
			for (AlimentStockes aliments : ListAlimentStockes) {
				session.merge(aliments);
			}
					
	        
		}

		catch (Exception e) {
			
		}
		
		transaction.commit();
		
        
	}
	


/**

Cette méthode permet d'importer les données de la table alimentStockes de la base de données en les transformant en liste d'objets AlimentStockes.
@return Une liste d'objets AlimentStockes importés depuis la base de données.
*/
	public static List<AlimentStockes> importerTableAlimentStock(){
		List<Object[]> elements=  session.createNativeQuery("SELECT * FROM alimentStockes").getResultList();
		List<AlimentStockes> alimentStockes = new ArrayList<>();
		    for (Object[] element : elements) {
		        alimentStockes.add(convertirEnAlimentStocke(element));
		    }

		    return alimentStockes;
	}
	
	/**

    Cette méthode permet de convertir un tableau d'objets représentant un élément de la table alimentStockes en un objet AlimentStocke.

    @param element Le tableau d'objets représentant l'élément à convertir.

    @return L'objet AlimentStocke créé à partir des données de l'élément.
    */
	public static AlimentStockes convertirEnAlimentStocke(Object[] element) {
	    // Récupération des données de l'élément
	    Long id = (Long) element[0];
	    float quantite = (float) element[2];
	    LocalDate datePeremption = ((java.sql.Date) element[1]).toLocalDate();
	    Long idAliment = (Long) element[3];

	    // Récupération de l'aliment correspondant à l'id
	    Aliment aliment = AlimentsService.getById(idAliment);

	    // Création de l'objet AlimentStocke
	    AlimentStockes alimentStocke = new AlimentStockes(id,aliment, quantite, datePeremption);
	    return alimentStocke;
	}
	/*public static List<Object[]> convertToObjectsList(List<AlimentStockes> alimentsStockes) {
	    List<Object[]> objectsList = new ArrayList<>();
	    for (AlimentStockes alimentStocke : alimentsStockes) {
	    	Object[] object = new Object[4];
	    	object[0] = alimentStocke.getId();
	        object[1] = alimentStocke.getQuantite();
	        object[2] = alimentStocke.getDatePeremption();
	        object[3] = alimentStocke.getAliment().getId();
	        objectsList.add(object);
	    }
	    return objectsList;
	}*/
    

}
