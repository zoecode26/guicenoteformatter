package com.company;

import com.google.inject.assistedinject.Assisted;

public interface NoteFactory {

     public Note create(@Assisted("title") String title, @Assisted("body") String body);

}
