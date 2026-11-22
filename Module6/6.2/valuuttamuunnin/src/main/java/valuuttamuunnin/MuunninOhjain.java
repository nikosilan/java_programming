package valuuttamuunnin;

import javafx.scene.control.Alert;
import javafx.scene.control.TextFormatter;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.function.UnaryOperator;

/** Ohjain käsittelee käyttöliittymän tapahtumat ja käyttää mallia laskennassa. */
public class MuunninOhjain {
    private final MuunninMalli malli;
    private final MuunninNakyma nakyma;

    public MuunninOhjain(MuunninMalli malli, MuunninNakyma nakyma) {
        this.malli = malli;
        this.nakyma = nakyma;

        nakyma.getLahtovaluutta().getItems().setAll(malli.getValuutat());
        nakyma.getKohdevaluutta().getItems().setAll(malli.getValuutat());
        nakyma.getLahtovaluutta().getSelectionModel().selectFirst();
        nakyma.getKohdevaluutta().getSelectionModel().select(1);

        UnaryOperator<TextFormatter.Change> numerosuodatin = muutos -> {
            String teksti = muutos.getControlNewText();
            return teksti.matches("\\d{0,9}([.,]\\d{0,4})?") ? muutos : null;
        };
        nakyma.getMaaraKentta().setTextFormatter(new TextFormatter<>(numerosuodatin));

        nakyma.getMuunnaPainike().setOnAction(tapahtuma -> muunna());
        nakyma.getMaaraKentta().setOnAction(tapahtuma -> muunna());
    }

    private void muunna() {
        try {
            String syote = nakyma.getMaaraKentta().getText().trim().replace(',', '.');
            if (syote.isEmpty()) {
                throw new IllegalArgumentException("Anna muunnettava summa.");
            }

            double maara = Double.parseDouble(syote);
            if (!Double.isFinite(maara) || maara <= 0) {
                throw new IllegalArgumentException("Summan täytyy olla nollaa suurempi.");
            }

            Valuutta lahto = nakyma.getLahtovaluutta().getValue();
            Valuutta kohde = nakyma.getKohdevaluutta().getValue();
            if (lahto == null || kohde == null) {
                throw new IllegalArgumentException("Valitse sekä lähtö- että kohdevaluutta.");
            }

            double tulos = malli.muunna(maara, lahto, kohde);
            NumberFormat muotoilu = NumberFormat.getNumberInstance(Locale.forLanguageTag("fi-FI"));
            muotoilu.setMinimumFractionDigits(2);
            muotoilu.setMaximumFractionDigits(2);

            nakyma.getTulosKentta().setText(
                    muotoilu.format(tulos) + " " + kohde.getTunnus()
            );
            nakyma.getTilaTeksti().setText(
                    muotoilu.format(maara) + " " + lahto.getTunnus()
                            + " = " + muotoilu.format(tulos) + " " + kohde.getTunnus()
                            + " (käytössä ovat sovelluksen esimerkkikurssit)"
            );
            nakyma.getTilaTeksti().getStyleClass().remove("error");
            if (!nakyma.getTilaTeksti().getStyleClass().contains("success")) {
                nakyma.getTilaTeksti().getStyleClass().add("success");
            }
        } catch (NumberFormatException virhe) {
            naytaVirhe("Anna kelvollinen numero.");
        } catch (IllegalArgumentException virhe) {
            naytaVirhe(virhe.getMessage());
        }
    }

    private void naytaVirhe(String viesti) {
        nakyma.getTulosKentta().clear();
        nakyma.getTilaTeksti().setText(viesti);
        nakyma.getTilaTeksti().getStyleClass().remove("success");
        if (!nakyma.getTilaTeksti().getStyleClass().contains("error")) {
            nakyma.getTilaTeksti().getStyleClass().add("error");
        }

        Alert ilmoitus = new Alert(Alert.AlertType.WARNING);
        ilmoitus.setTitle("Muunnosta ei voida tehdä");
        ilmoitus.setHeaderText("Tarkista syöttämäsi tiedot");
        ilmoitus.setContentText(viesti);
        ilmoitus.showAndWait();
    }
}
