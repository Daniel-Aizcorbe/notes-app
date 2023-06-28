package com.notasapp.notas.notes;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Note {


    private String title;
    private String content;
    private boolean favourite;

    public Note(String title, String content) {
        this.title = new TitleGenerator(title).generate();
        this.content = content;
    }

    public void addToFavourites() {
        this.setFavourite(true);
    }

    public void removeFromFavourites() {
        this.setFavourite(false);
    }

    public void edit(String newTitle, String newContent) {
        this.setTitle(newTitle);
        this.setContent(newContent);
    }
}
