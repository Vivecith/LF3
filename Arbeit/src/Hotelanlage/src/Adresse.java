public class Adresse {

    private String strasse;
    private String hausnummer;
    private String plz;
    private String ort;

    public Adresse(String strasse, String hausnummer, String plz, String ort) {
        this.strasse = strasse;
        this.hausnummer = hausnummer;
        this.plz = plz;
        this.ort = ort;
    }

    public String getStrasse() {
        return strasse;
    }
    public String getHausnummer() {
        return hausnummer;
    }
    public String getPlz() {
        return plz;
    }
    public String getOrt() {
        return ort;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }
    public void setHausnummer(String hausnummer) {
        this.hausnummer = hausnummer;
    }
    public void setPlz(String plz) {
        this.plz = plz;
    }
    public void setOrt(String ort) {
        this.ort = ort;
    }

    @Override
    public String toString() {
        String text = strasse;
        text += " " + hausnummer;
        text += " " + plz;
        text += " " + ort;
        return text;
    }
}
