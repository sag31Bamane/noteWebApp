package com.sagar.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;
import com.sagar.entity.Note;

@Path("noteService")
public class NoteService{
	@GET
	@Path("hello")
	@Produces(MediaType.TEXT_PLAIN)
	public String getMessage() {

		String result = "Testing rest api";

		return result;

	}
	
    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.TEXT_PLAIN})
    @Path("postNotes")
    public String postNotes(String notes) throws Exception{
    	List<Note> notesList = null;
    	File file=new File("Notes.txt");
        if (file.exists()) {
            Gson gson = new Gson();
            BufferedReader br = new BufferedReader(new FileReader(file));
            notesList = gson.fromJson(br, ArrayList.class);
 
            // line 6
            // logs.add(log);
            // serialize "logs" again
        }
		return "success";
        
    }
}

