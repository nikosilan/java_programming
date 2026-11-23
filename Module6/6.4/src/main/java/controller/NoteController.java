package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import model.Note;
import model.Notebook;


public class NoteController {

    @FXML
    private TextField titleField;

    @FXML
    private TextArea contentArea;

    @FXML
    private ListView<Note> notesListView;

    @FXML
    private Button saveButton;

    @FXML
    private Button deleteButton;

    @FXML
    private Label statusLabel;

    private final Notebook notebook = new Notebook();
    private final ObservableList<Note> items = FXCollections.observableArrayList();

    @FXML
    private void initialize() {
        notesListView.setItems(items);

        // Show the title and the beginning of the content for each note
        notesListView.setCellFactory(list -> new ListCell<>() {
            @Override
            protected void updateItem(Note note, boolean empty) {
                super.updateItem(note, empty);
                if (empty || note == null) {
                    setText(null);
                } else {
                    String preview = note.getContent().replace('\n', ' ');
                    if (preview.length() > 60) {
                        preview = preview.substring(0, 60) + "...";
                    }
                    setText(note.getTitle() + "\n" + preview);
                }
            }
        });

        // When a note is selected, show it in the editor fields
        notesListView.getSelectionModel().selectedItemProperty().addListener((obs, oldNote, newNote) -> {
            boolean hasSelection = newNote != null;
            saveButton.setDisable(!hasSelection);
            deleteButton.setDisable(!hasSelection);
            if (hasSelection) {
                titleField.setText(newNote.getTitle());
                contentArea.setText(newNote.getContent());
            }
        });

        saveButton.setDisable(true);
        deleteButton.setDisable(true);
    }


    @FXML
    private void handleAdd() {
        String title = titleField.getText().trim();
        if (title.isEmpty()) {
            statusLabel.setText("Please enter a title.");
            return;
        }
        Note note = new Note(title, contentArea.getText());
        notebook.addNote(note);
        refreshList();
        clearFields();
        statusLabel.setText("Note \"" + title + "\" added. Notes: " + notebook.size());
    }


    @FXML
    private void handleSave() {
        Note selected = notesListView.getSelectionModel().getSelectedItem();
        if (selected == null) {
            return;
        }
        String title = titleField.getText().trim();
        if (title.isEmpty()) {
            statusLabel.setText("Title must not be empty.");
            return;
        }
        int index = notesListView.getSelectionModel().getSelectedIndex();
        notebook.updateNote(selected, title, contentArea.getText());
        refreshList();
        notesListView.getSelectionModel().select(index);
        statusLabel.setText("Note \"" + title + "\" updated.");
    }


    @FXML
    private void handleDelete() {
        Note selected = notesListView.getSelectionModel().getSelectedItem();
        if (selected == null) {
            return;
        }
        notebook.removeNote(selected);
        refreshList();
        clearFields();
        statusLabel.setText("Note \"" + selected.getTitle() + "\" deleted. Notes: " + notebook.size());
    }


    @FXML
    private void handleNew() {
        notesListView.getSelectionModel().clearSelection();
        clearFields();
        statusLabel.setText("");
    }

    private void refreshList() {
        items.setAll(notebook.getNotes());
    }

    private void clearFields() {
        titleField.clear();
        contentArea.clear();
    }
}
