package com.sagar.persistence;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MyHibernateUtil {
	private static final SessionFactory sessionFactory=buildSessionFactory();

	private static SessionFactory buildSessionFactory() {
		Configuration config=new Configuration();
		
		return config.configure().buildSessionFactory();
		
	}
	public static SessionFactory getSessionfactory() {
		return sessionFactory;
	}
	
	
}
