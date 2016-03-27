package com.sagar.dao;

import java.util.List;

import com.sagar.entity.Note;
import com.sagar.entity.User;

public interface NoteDao {
	List<Note> getAllNoteForUser(User user);
	boolean addNote(Note note);
	boolean updateNote(Note note);
	boolean deleteNote(Note note);
	Note getNote(Long id);
}
