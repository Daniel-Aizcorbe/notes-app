package com.notasapp.notas.notes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NoteTest {

    @Test
    public void notesCantHaveEmptyNames() {
        Note note = new Note("","");
        Assertions.assertNotSame("", note.getTitle());
    }
}
