package valuuttamuunnin;

/** Yhden valuutan tiedot ja vaihtokurssi suhteessa Yhdysvaltain dollariin. */
public class Valuutta {
    private final String tunnus;
    private final String nimi;
    private final double dollareina;

    public Valuutta(String tunnus, String nimi, double dollareina) {
        if (tunnus == null || tunnus.isBlank()
                || nimi == null || nimi.isBlank() || dollareina <= 0) {
            throw new IllegalArgumentException("Valuutan tiedot eivät ole kelvolliset.");
        }
        this.tunnus = tunnus;
        this.nimi = nimi;
        this.dollareina = dollareina;
    }

    public String getTunnus() {
        return tunnus;
    }

    public String getNimi() {
        return nimi;
    }

    public double getDollareina() {
        return dollareina;
    }

    @Override
    public String toString() {
        return tunnus + " – " + nimi;
    }
}
