package valuuttamuunnin;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.layout.*;

/** Näkymä rakentaa sovelluksen käyttöliittymän. */
public class MuunninNakyma {
    private final BorderPane juuri = new BorderPane();
    private final ComboBox<Valuutta> lahtovaluutta = new ComboBox<>();
    private final ComboBox<Valuutta> kohdevaluutta = new ComboBox<>();
    private final TextField maaraKentta = new TextField();
    private final TextField tulosKentta = new TextField();
    private final Button muunnaPainike = new Button("Muunna");
    private final Label tilaTeksti = new Label(
            "Anna summa, valitse valuutat ja paina Muunna."
    );

    public MuunninNakyma() {
        juuri.getStyleClass().add("app-root");
        juuri.setPadding(new Insets(28));

        Label otsikko = new Label("Valuuttamuunnin");
        otsikko.getStyleClass().add("title");
        Label alaotsikko = new Label("Muunna summa valuutasta toiseen");
        alaotsikko.getStyleClass().add("subtitle");

        VBox ylatunniste = new VBox(6, otsikko, alaotsikko);
        ylatunniste.setAlignment(Pos.CENTER_LEFT);
        ylatunniste.getStyleClass().add("header");
        juuri.setTop(ylatunniste);

        maaraKentta.setPromptText("Esimerkiksi 125,50");
        maaraKentta.setId("maaraKentta");

        tulosKentta.setEditable(false);
        tulosKentta.setFocusTraversable(false);
        tulosKentta.setPromptText("Muunnettu summa");
        tulosKentta.setId("tulosKentta");

        lahtovaluutta.setMaxWidth(Double.MAX_VALUE);
        kohdevaluutta.setMaxWidth(Double.MAX_VALUE);
        lahtovaluutta.setPromptText("Valitse lähtövaluutta");
        kohdevaluutta.setPromptText("Valitse kohdevaluutta");

        GridPane lomake = new GridPane();
        lomake.setHgap(18);
        lomake.setVgap(9);
        lomake.setAlignment(Pos.CENTER);
        lomake.add(kenttaryhma("Muunnettava summa", maaraKentta), 0, 0, 2, 1);
        lomake.add(kenttaryhma("Lähtövaluutta", lahtovaluutta), 0, 1);
        lomake.add(kenttaryhma("Kohdevaluutta", kohdevaluutta), 1, 1);
        lomake.add(kenttaryhma("Muunnettu summa", tulosKentta), 0, 2, 2, 1);

        muunnaPainike.setDefaultButton(true);
        muunnaPainike.getStyleClass().add("primary-button");
        muunnaPainike.setMaxWidth(Double.MAX_VALUE);

        tilaTeksti.setWrapText(true);
        tilaTeksti.getStyleClass().add("status");

        VBox sisalto = new VBox(18, lomake, muunnaPainike, tilaTeksti);
        sisalto.setPadding(new Insets(28, 0, 0, 0));
        sisalto.setAlignment(Pos.TOP_CENTER);
        juuri.setCenter(sisalto);
    }

    private VBox kenttaryhma(String otsikko, Control kentta) {
        Label nimi = new Label(otsikko);
        nimi.getStyleClass().add("field-label");
        kentta.setMaxWidth(Double.MAX_VALUE);
        VBox ryhma = new VBox(7, nimi, kentta);
        ryhma.setFillWidth(true);
        return ryhma;
    }

    public Parent getJuuri() { return juuri; }
    public ComboBox<Valuutta> getLahtovaluutta() { return lahtovaluutta; }
    public ComboBox<Valuutta> getKohdevaluutta() { return kohdevaluutta; }
    public TextField getMaaraKentta() { return maaraKentta; }
    public TextField getTulosKentta() { return tulosKentta; }
    public Button getMuunnaPainike() { return muunnaPainike; }
    public Label getTilaTeksti() { return tilaTeksti; }
}
