
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class DictionaryView {

    private DictionaryController controller;

    public DictionaryView(Stage stage) {

        controller = new DictionaryController();

        // Create interface components
        Label title = new Label("Virtual Dictionary");

        TextField searchField = new TextField();
        searchField.setPromptText("Enter an English word");

        Button searchButton = new Button("Search");

        TextArea resultArea = new TextArea();
        resultArea.setEditable(false);
        resultArea.setPromptText("Word meaning will appear here...");
        resultArea.setPrefRowCount(4);
        resultArea.setPrefColumnCount(25);

        // Search button action
        searchButton.setOnAction(event -> {
            String word = searchField.getText();
            String result = controller.search(word);
            resultArea.setText(result);
        });

        // Create layout
        FlowPane layout = new FlowPane();
        layout.setPadding(new Insets(20));
        layout.setHgap(10);
        layout.setVgap(15);

        layout.getChildren().addAll(
                title,
                searchField,
                searchButton,
                resultArea
        );

        // Create scene and show window
        Scene scene = new Scene(layout, 350, 250);

        stage.setTitle("Virtual Dictionary");
        stage.setScene(scene);
        stage.show();
    }
}
