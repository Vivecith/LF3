import java.util.ArrayList;

public class Etage {
    private String name;
    private int anzahlZimmer;
    private int anzahlFZimmer = 0;
    private int anzahlGaeste = 0;
    private ArrayList<Zimmer> zimmerList;

    public Etage(String name, ArrayList<Zimmer> zimmerList) {
        this.name = name;
        this.zimmerList = zimmerList;
        calcAnzahlZimmer(zimmerList);
        calcAnzahlFZimmer(zimmerList);
        calcAnzahlGaeste(zimmerList);
    }

    public String getName() {
        return name;
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
    public ArrayList<Zimmer> getZimmerList() {
        return zimmerList;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setZimmerList(ArrayList<Zimmer> zimmerList) {
        this.zimmerList = zimmerList;
        calcAnzahlZimmer(zimmerList);
        calcAnzahlFZimmer(zimmerList);
        calcAnzahlGaeste(zimmerList);
    }

    public void initializeGastB(Gast gast, String room) {
        for (Zimmer z: zimmerList) {
            if (z.getName().equals(room)) {
                z.addGast(gast);
                calcAnzahlFZimmer(this.zimmerList);
                calcAnzahlGaeste(this.zimmerList);
                break;
            }
        }
    }
    public void calcAnzahlZimmer(ArrayList<Zimmer> zimmerList) {
        anzahlZimmer = zimmerList.size();
    }
    public void calcAnzahlFZimmer(ArrayList<Zimmer> zimmerList) {
        anzahlFZimmer = 0;
        for (Zimmer zimmer : zimmerList) {
            if (zimmer.isFree()) {
                anzahlFZimmer++;
            }
        }
    }
    public void calcAnzahlGaeste(ArrayList<Zimmer> zimmerList) {
        anzahlGaeste = 0;
        for (Zimmer zimmer : zimmerList) {
            anzahlGaeste += zimmer.getGastAmount();
        }
    }

    @Override
    public String toString() {
        String text = "\nEtage: "+name+", ";
        text += "Zimmer: "+anzahlZimmer+", ";
        text += "Freie Zimmer: "+anzahlFZimmer+", ";
        text += "Gäste: "+anzahlGaeste;
        return text;
    }
}
