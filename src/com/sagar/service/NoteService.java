package com.sagar.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("noteService")
public class NoteService{
	@GET
	@Path("hello")
	@Produces(MediaType.TEXT_PLAIN)
	public String getMessage() {

		String result = "Testing rest api";

		return result;

	}
}
