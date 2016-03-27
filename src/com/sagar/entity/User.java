package com.sagar.entity;

import java.io.Serializable;
import java.sql.Date;

public class User implements Serializable { 
	
	private static final long serialVersionUID = 1L;
	private long id;
	private String emailId;
	private String password;
	private Date creationTime;
	private Date lastModTime;
	
	public User() {
	}

	public User(long id, String emailId, String password, Date creationTime,
			Date lastModTime) {
		super();
		this.id = id;
		this.emailId = emailId;
		this.password = password;
		this.creationTime = creationTime;
		this.lastModTime = lastModTime;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(Date creationTime) {
		this.creationTime = creationTime;
	}

	public Date getLastModTime() {
		return lastModTime;
	}

	public void setLastModTime(Date lastModTime) {
		this.lastModTime = lastModTime;
	}
}
