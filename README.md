# Note Formatter

This is a very simple note formatter application that takes a title and a body and prints it with headings.
It was created for the purposes of learning the basics of Guice for dependency injection.

## Installing Dependencies
```mvn install```

## Project Structure
Consists of two main classes:
- The Note class that hold the title and body attributes and that has a display method to print the formatted note to the user (by calling the format method of the NoteFormatter).
- The NoteFormatter class that has a format method that takes the note, formats it and prints it to display it to the user.

The noteFactory also provides a create method to instantiate a note with a title and body but without having to manually create and pass in a new NoteFormatter.
