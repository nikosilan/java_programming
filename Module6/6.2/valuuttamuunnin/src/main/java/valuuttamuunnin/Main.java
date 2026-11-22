package valuuttamuunnin;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/** Sovelluksen käynnistysluokka. */
public class Main extends Application {
    @Override
    public void start(Stage ikkuna) {
        MuunninMalli malli = new MuunninMalli();
        MuunninNakyma nakyma = new MuunninNakyma();
        new MuunninOhjain(malli, nakyma);

        Scene näkymä = new Scene(nakyma.getJuuri(), 620, 520);
        näkymä.getStylesheets().add(
                getClass().getResource("/style.css").toExternalForm()
        );

        ikkuna.setTitle("Valuuttamuunnin");
        ikkuna.setMinWidth(520);
        ikkuna.setMinHeight(460);
        ikkuna.setScene(näkymä);
        ikkuna.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
