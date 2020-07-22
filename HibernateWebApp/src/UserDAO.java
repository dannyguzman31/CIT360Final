/*
 *  Project by : Daniel Guzman
 *  Date: June 22, 2020 
 *  Class: CIT 360 Final Project 
 *  NOTES:
 *  	In this class, we are using hibernate to add the user details to the database,
 * 		I do this by creating a new user object where it will be use to call the setters  
 */

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class UserDAO {

	public void addUserDetails(String f_Name, String l_Name,String userName, String password, String email,
			String phone, String question) {
		try {
			
			Configuration configuration = new Configuration().configure();

			SessionFactory sessionFactory = configuration.buildSessionFactory();

			Session session = sessionFactory.openSession();

			Transaction transaction = session.beginTransaction();
			User user = new User();
			user.setUserName(userName);
			user.setF_Name(f_Name);
			user.setL_Name(l_Name);
			user.setPassword1(password);
			user.setEmail(email);
			user.setQuestion(question);
			user.setPhone(phone);
			session.save(user);
			transaction.commit();
			System.out.println("\n\n Customer Added \n");
            
		} catch (HibernateException e) {
			System.out.println(e.getMessage());
			System.out.println("error");
		}

	}

}
