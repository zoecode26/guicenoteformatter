package com.company;

import com.google.inject.AbstractModule;
import com.google.inject.assistedinject.FactoryModuleBuilder;

public class GuiceBindingModule extends AbstractModule {
    @Override
    protected void configure(){

        install(new FactoryModuleBuilder()
                .implement(Formatter.class, Note.class)
                .build(NoteFactory.class));

    }
}
