package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Notebook {

    private final List<Note> notes = new ArrayList<>();

    public void addNote(Note note) {
        if (note == null) {
            throw new IllegalArgumentException("Note must not be null");
        }
        notes.add(note);
    }

    public Note getNote(int index) {
        return notes.get(index);
    }


    public List<Note> getNotes() {
        return Collections.unmodifiableList(notes);
    }

    public boolean removeNote(Note note) {
        return notes.remove(note);
    }

    public void updateNote(Note note, String newTitle, String newContent) {
        if (!notes.contains(note)) {
            throw new IllegalArgumentException("Note is not in the notebook");
        }
        note.setTitle(newTitle);
        note.setContent(newContent);
    }

    public int size() {
        return notes.size();
    }
}
