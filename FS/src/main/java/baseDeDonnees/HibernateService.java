package baseDeDonnees;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import modeleDeDonnees.*;

/**

Cette classe fournit des méthodes pour la configuration et la fermeture d'une session Hibernate.
Elle contient également des méthodes pour la création de la configuration et de la session factory Hibernate, ainsi que l'ajout des classes annotées Aliments et AlimentStockes.
*/
public class HibernateService {
	
	/**session de connexion à la base de données.*/
	protected static Session session;
	/**transaction en cours dans la base de données.*/
	protected static Transaction transaction;
	/**configuration de la connexion à la base de données.*/
	private static Configuration config;
	/**fabrique de sessions de connexion à la base de données.*/
	protected static SessionFactory sessionFactory;

	/**
	 * Crée une configuration Hibernate en lisant le fichier de configuration hibernate.cfg.xml,
	 * en ajoutant les classes annotées Aliments et AlimentStockes.
	 */
    public static void  CreerConfig() {
        config = new Configuration();
        config.configure("hibernate.cfg.xml");
        config.addAnnotatedClass(modeleDeDonnees.Aliment.class);
        config.addAnnotatedClass(modeleDeDonnees.AlimentStockes.class);

        SessionFactory sessionFactory = config.buildSessionFactory();
        session = sessionFactory.openSession();
       
    }
    /**
     * Ferme la session Hibernate et la session factory.
     */
    public static void FermerSession() {
    	
    	session.close();
        sessionFactory.close();
    }
        
}