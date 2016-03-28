package com.sagar.service;

import java.io.IOException;
import java.util.StringTokenizer;

import javax.xml.bind.DatatypeConverter;

import com.sagar.dao.UserDao;
import com.sagar.entity.User;



public class AuthenticationService {
	UserDao userDao=new UserDao();
	public boolean authenticate(String authCredentials) {

		if (null == authCredentials)
			return false;
		final String encodedUserPassword = authCredentials.replaceFirst("Basic"
				+ " ", "");
		String usernameAndPassword = null;
		try {
			usernameAndPassword = new String(DatatypeConverter.parseBase64Binary(encodedUserPassword), "UTF-8");
		} catch (IOException e) {
			e.printStackTrace();
		}
		final StringTokenizer tokenizer = new StringTokenizer(
				usernameAndPassword, ":");
		final String username = tokenizer.nextToken();
		final String password = tokenizer.nextToken();
		User user=userDao.getUser(username, password);
		boolean authenticationStatus=false;
		if(user!=null){
			authenticationStatus=true;
		}
		return authenticationStatus;
	}
}
