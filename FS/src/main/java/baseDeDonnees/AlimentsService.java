package baseDeDonnees;

import java.util.List;
import jakarta.persistence.Query;
import modeleDeDonnees.AlimentStockes;
import modeleDeDonnees.Aliments;

/**

Cette classe gère les interactions avec la table "Aliments" de la base de données.
Elle hérite de la classe HibernateService pour utiliser les fonctionnalités d'Hibernate.
*/

public class AlimentsService extends HibernateService  {
	
	

	/**
	 * Cette méthode permet de mettre à jour plusieurs aliments dans la table "Aliments" de la base de données.
	 * @param ListAliments La liste des aliments à mettre à jour.
	 */
	public static void mettreAJourTable(List<Aliments> ListAliments) {
		
        transaction = session.beginTransaction();
        
        try {
     // Récupérer tous les AlimentStockes de la table avec HQL
		List<Aliments> listBDD = importerTableAliment();

        // Parcourir la liste de la table et supprimer les AlimentStockes qui ne sont plus dans ListAlimentStockes
        for (Aliments alimentsBDD : listBDD) {
            if (!ListAliments.stream().anyMatch(aliments -> alimentsBDD.getId() == aliments.getId())) {
            	String hql = "DELETE FROM Aliments WHERE id = :alimentId";
            	Query query = session.createQuery(hql);
            	query.setParameter("alimentId", alimentsBDD.getId());
            	int result = query.executeUpdate();
            }
        }

		
			for (Aliments aliments : ListAliments) {
				session.merge(aliments);

			}
		}
		catch (Exception e) {
			
		}
		
		transaction.commit();
	}
	/**
	 * Cette méthode permet d'importer la table "Aliments" de la base de données.
	 * @return La liste des aliments importés.
	 */
	public static List<Aliments> importerTableAliment(){
		return session.createNativeQuery("SELECT * FROM Aliments", Aliments.class).getResultList();
	}
	/**
	 * Cette méthode permet de chercher un aliment par son nom dans la table "Aliments" de la base de données.
	 * @param nom Le nom de l'aliment cherché.
	 * @return L'aliment cherché.
	 */
	public static Aliments findByName(String nom) {
		try {
		    Query query = session.createQuery("FROM Aliments WHERE nom = :nom");
		    query.setParameter("nom", nom);
		    return (Aliments) query.getSingleResult();

		}
		catch (Exception e) {
	    	return null;
		}
	}
	/**
	 * Cette méthode permet de chercher un aliment par son identifiant dans la table "Aliments" de la base de données.
	 * @param idAliment L'identifiant de l'aliment cherché.
	 * @return L'aliment cherché.
	 */
	public static Aliments getById(Long idAliment) {
	    Query query = session.createQuery("FROM Aliments WHERE id = :id");
	    query.setParameter("id", idAliment);
	    return (Aliments) query.getSingleResult();
	}

}
