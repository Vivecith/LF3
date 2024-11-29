import java.util.ArrayList;

public class Gebaeude {
    private String name;
    private int anzahlEtagen;
    private int anzahlZimmer = 0;
    private int anzahlFZimmer = 0;
    private int anzahlGaeste = 0;
    private ArrayList<Etage> etagenList;

    public Gebaeude(String name, ArrayList<Etage> etagenList) {
        this.name = name;
        this.etagenList = etagenList;
        calcAnzahlEtagen(etagenList);
        calcAnzahlZimmer(etagenList);
        calcAnzahlFZimmer(etagenList);
        calcAnzahlGaeste(etagenList);
    }

    public String getName() {
        return name;
    }
    public int getAnzahlEtagen() {
        return anzahlEtagen;
    }
    public int getAnzahlZimmer() {
        return anzahlZimmer;
    }
    public int getAnzahlFZimmer() {
        return anzahlFZimmer;
    }
    public int getAnzahlGaeste() {
        return anzahlGaeste;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setEtagenList(ArrayList<Etage> etagenList) {
        this.etagenList = etagenList;
        calcAnzahlEtagen(etagenList);
        calcAnzahlZimmer(etagenList);
        calcAnzahlFZimmer(etagenList);
        calcAnzahlGaeste(etagenList);
    }

    public void calcAnzahlEtagen(ArrayList<Etage> etagenList) {
        anzahlEtagen = etagenList.size();
    }
    public void calcAnzahlZimmer(ArrayList<Etage> etagenList) {
        for (Etage etage : etagenList) {
            anzahlZimmer += etage.getAnzahlZimmer();
        }
    }
    public void calcAnzahlFZimmer(ArrayList<Etage> etagenList) {
        for (Etage etage : etagenList) {
            anzahlFZimmer += etage.getAnzahlFZimmer();
        }
    }
    public void calcAnzahlGaeste(ArrayList<Etage> etagenList) {
        for (Etage etage : etagenList) {
            anzahlGaeste += etage.getAnzahlGaeste();
        }
    }

    @Override
    public String toString() {
        String text = "\nGebäude: " + name + "\n";
        for (Etage etage : etagenList) {
            text += etage + "\n";
        }
        text += "gesamt: Zimmer: " + anzahlZimmer + ", Freie Zimmer: " + anzahlFZimmer + ", Gäste: " + anzahlGaeste;
        return text;
    }
}
