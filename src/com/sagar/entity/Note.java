package com.sagar.entity;

import java.io.Serializable;
import java.sql.Date;

public class Note implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8599561887291642955L;
	private long id;
	private String title;
	private String note;
	private Date creationTime;
	private Date lastModTime;
	private User user;
	public Note() {
	}
	
	public Note(long id, String title, String note, Date creationTime,
			Date lastModTime, User user) {
		super();
		this.id = id;
		this.title = title;
		this.note = note;
		this.creationTime = creationTime;
		this.lastModTime = lastModTime;
		this.user = user;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}
