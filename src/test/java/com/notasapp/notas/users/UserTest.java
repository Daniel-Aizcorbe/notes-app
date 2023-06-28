package com.notasapp.notas.users;

import com.notasapp.notas.exceptions.NoteNotFound;
import com.notasapp.notas.notes.Note;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class UserTest {

    User user;

    @BeforeEach
    public void clean() {
        user = new User("user","user", new ArrayList<>());
    }

    @Test
    public void userCanCreateANote() {
        user.createNote("title","content");
        Assertions.assertFalse(user.getNotes().isEmpty());
    }

    @Test
    public void userCannotDeleteANoteIfItsDoesntExist() {
        Note note = new Note("","");
        Assertions.assertThrows(NoteNotFound.class,() -> user.deleteNote(note));
    }

    @Test
    public void userCannotEditANoteThatNotExist() {
        Note note = new Note("","");
        Assertions.assertThrows(NoteNotFound.class,() -> user.editNote(note,"",""));
    }
}
