public class Gast {
    private String vorname;
    private String nachname;
    private Adresse adresse;

    public Gast(String vorname, String nachname, Adresse adresse) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.adresse = adresse;
    }

    public String getVorname() {
        return vorname;
    }
    public String getNachname() {
        return nachname;
    }
    public String getFullName() {
        return vorname + " " + nachname;
    }
    public Adresse getAdresse() {
        return adresse;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }
    public void setNachname(String nachname) {
        this.nachname = nachname;
    }
    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        String text = vorname;
        text += " "+nachname;
        text += "\n"+adresse;
        return text;
    }
}
