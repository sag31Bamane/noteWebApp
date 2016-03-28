package com.sagar.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sagar.entity.User;
import com.sagar.persistence.MyHibernateUtil;

public class UserDao {
	public User getUser(String userName,String password){
		User user=null;
		SessionFactory factory=MyHibernateUtil.getSessionfactory();
		Session session=factory.openSession();
		String hql = "FROM User u WHERE u.emailId = :emailId and u.password=:password";
		Query query = session.createQuery(hql);
		query.setParameter("emailId",userName);
		query.setParameter("password",password);
		List<User> userList=query.list();
		if(userList!=null && !userList.isEmpty()){
			user=userList.get(0);
		}
		return user;
		
	}
}
