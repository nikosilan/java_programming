package valuuttamuunnin;

import java.util.List;

/** Malli sisältää käytettävissä olevat valuutat ja muunnoslaskennan. */
public class MuunninMalli {
    private final List<Valuutta> valuutat;

    public MuunninMalli() {
        // Esimerkkikurssit: yhden valuuttayksikön arvo Yhdysvaltain dollareina.
        // Kurssit ovat kiinteitä eivätkä päivity automaattisesti.
        valuutat = List.of(
                new Valuutta("EUR", "Euro", 1.08),
                new Valuutta("USD", "Yhdysvaltain dollari", 1.0),
                new Valuutta("GBP", "Englannin punta", 1.27),
                new Valuutta("JPY", "Japanin jeni", 0.0067),
                new Valuutta("SEK", "Ruotsin kruunu", 0.095),
                new Valuutta("CAD", "Kanadan dollari", 0.74),
                new Valuutta("CHF", "Sveitsin frangi", 1.12)
        );
    }

    public List<Valuutta> getValuutat() {
        return valuutat;
    }

    public double muunna(double maara, Valuutta lahto, Valuutta kohde) {
        if (maara <= 0 || lahto == null || kohde == null) {
            throw new IllegalArgumentException("Valitse valuutat ja anna nollaa suurempi summa.");
        }
        double maaraDollareina = maara * lahto.getDollareina();
        return maaraDollareina / kohde.getDollareina();
    }
}
