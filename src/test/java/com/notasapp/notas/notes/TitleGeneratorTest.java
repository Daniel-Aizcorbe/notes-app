package com.notasapp.notas.notes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TitleGeneratorTest {

    TitleGenerator gen = new TitleGenerator("");;

    @Test
    public void theDefaultTitleIsNotEmpty() {
        Assertions.assertNotEquals("",gen.generate());
    }

    @Test
    public void theDefaultTitleHaveDateOfToday() {
        String dateOfToday = LocalDate.now().format(DateTimeFormatter.ofPattern("MM/yyyy"));
        Assertions.assertTrue(gen.generate().endsWith(dateOfToday));
    }
}
