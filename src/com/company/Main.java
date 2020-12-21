package com.company;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;

public class Main {
    @Inject
    NoteFactory noteFactory;


    public static void main(String[] args) {

        Injector injector = Guice.createInjector(new GuiceBindingModule());
        NoteFactory factory = injector.getInstance(NoteFactory.class);
        Note note = factory.create("Test title", "I am some text");
        note.display();

    }
}
