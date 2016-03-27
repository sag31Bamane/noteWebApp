import org.hibernate.Session;

import com.sagar.entity.User;
import com.sagar.persistence.MyHibernateUtil;


public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Session session=MyHibernateUtil.getSessionfactory().openSession();
		session.beginTransaction();
		User user=(User) session.get(User.class, new Long("1"));
		System.out.println();
		session.close();
	}

}
