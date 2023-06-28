package com.notasapp.notas.users;

import com.notasapp.notas.exceptions.NoteNotFound;
import com.notasapp.notas.notes.Note;
import com.notasapp.notas.notes.TitleGenerator;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class User {
    private final String username;
    private String password;
    private final List<Note> notes;

    public User(String username, String password, List<Note> notes) {
        this.username = username;
        this.password = password;
        this.notes = notes;
    }

    public void createNote(String title, String content) {
        this.getNotes().add(new Note(title, content));
    }

    public void deleteNote(Note note) {
        if (!this.hasNote(note)) {
            throw new NoteNotFound();
        }
        this.getNotes().remove(note);
    }

    private boolean hasNote(Note note) {
        return this.getNotes().contains(note);
    }

    public void editNote(Note note, String newTitle, String newContent) {
        if (!this.hasNote(note)) {
            throw new NoteNotFound();
        }
        note.edit(newTitle, newContent);
    }
}
