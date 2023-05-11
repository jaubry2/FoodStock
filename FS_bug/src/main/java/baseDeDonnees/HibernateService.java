package baseDeDonnees;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import modeleDeDonnees.*;

public class HibernateService {
	
	protected static Session session;
	protected static Transaction transaction;
	private static Configuration config;
	protected static SessionFactory sessionFactory;

    public static void  CreerConfig() {
        config = new Configuration();
        config.configure("hibernate.cfg.xml");
        config.addAnnotatedClass(modeleDeDonnees.Aliments.class);
        config.addAnnotatedClass(modeleDeDonnees.AlimentStockes.class);

        SessionFactory sessionFactory = config.buildSessionFactory();
        session = sessionFactory.openSession();
       
    }
    
    public static void FermerSession() {
    	
    	session.close();
        sessionFactory.close();
    }
        
}