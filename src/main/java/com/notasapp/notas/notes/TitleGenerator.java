package com.notasapp.notas.notes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class TitleGenerator {

    private final String title;

    public TitleGenerator(String title) {
        this.title = title;
    }
    public String generate() {
        if (Objects.equals(this.title, "")) {
            return this.defaultTitle();
        }
        return this.title;
    }

    private String defaultTitle() {
        return "New Note - " + LocalDate.now().format(DateTimeFormatter.ofPattern("MM/yyyy"));
    }
}
