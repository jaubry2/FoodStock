package baseDeDonnees;

import java.util.List;
import jakarta.persistence.Query;
import modeleDeDonnees.Aliments;

public class AlimentsService extends HibernateService  {
	public void ajouter(Aliments a) {
        session.persist(a);
        transaction.commit();

	}
	
	public static void mettreAJourTable(List<Aliments> ListAliments) {
		
        transaction = session.beginTransaction();

		try {
			for (Aliments aliments : ListAliments) {
				session.merge(aliments);

			}
		}
		catch (Exception e) {
			
		}
		
		transaction.commit();
	}
	
	public static List<Aliments> importerTableAliment(){
		return session.createNativeQuery("SELECT * FROM Aliments", Aliments.class).getResultList();
	}
	public static Aliments findByName(String nom) {
	    Query query = session.createQuery("FROM Aliments WHERE nom = :nom");
	    query.setParameter("nom", nom);
	    return (Aliments) query.getSingleResult();
	}
	
	public static Aliments getById(Long idAliment) {
	    Query query = session.createQuery("FROM Aliments WHERE id = :id");
	    query.setParameter("id", idAliment);
	    return (Aliments) query.getSingleResult();
	}

}
