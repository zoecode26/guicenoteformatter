package com.company;

import com.google.inject.Inject;
import com.google.inject.assistedinject.Assisted;


public class Note implements Formatter {

    private final String title;
    private final String body;
    private final NoteFormatter formatter;

    @Inject
    public Note(@Assisted("title") String title, @Assisted("body") String body, NoteFormatter formatter) {

        this.title = title;
        this.body = body;
        this.formatter = formatter;
    }

    public void display(){
        formatter.format(this);
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }
}