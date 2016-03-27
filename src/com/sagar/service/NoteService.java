package com.sagar.service;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;
import com.sagar.entity.User;

@Path("noteService")
public class NoteService{
	@GET
	@Path("hello")
	@Produces(MediaType.TEXT_PLAIN)
	public String getMessage() {

		String result = "Testing rest api";

		return result;

	}
	
	@GET
	@Path("getUsers")
	@Produces("application/json")
	public String getUser(){
		{
			String feeds = null;
			try
			{
			ArrayList<User> userData = null;
			Gson gson = new Gson();
			System.out.println(gson.toJson(userData));
			feeds = gson.toJson(userData);
			}

			catch (Exception e)
			{
			System.out.println("Exception Error"); //Console 
			}
			return feeds;
		}
	
	}
}

