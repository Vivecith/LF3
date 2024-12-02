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
    public ArrayList<Etage> getEtagenList() {
        return etagenList;
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

    public void initializeGastA(Gast gast, String room) {
        String[] digits = room.split("");
        for (Etage e: etagenList) {
            if (e.getName().equals(digits[0]+digits[1])) {
                e.initializeGastB(gast, room);
                calcAnzahlFZimmer(this.etagenList);
                calcAnzahlGaeste(this.etagenList);
                break;
            }
        }
    }
    public void calcAnzahlEtagen(ArrayList<Etage> etagenList) {
        anzahlEtagen = etagenList.size();
    }
    public void calcAnzahlZimmer(ArrayList<Etage> etagenList) {
        anzahlZimmer = 0;
        for (Etage etage : etagenList) {
            anzahlZimmer += etage.getAnzahlZimmer();
        }
    }
    public void calcAnzahlFZimmer(ArrayList<Etage> etagenList) {
        anzahlFZimmer = 0;
        for (Etage etage : etagenList) {
            anzahlFZimmer += etage.getAnzahlFZimmer();
        }
    }
    public void calcAnzahlGaeste(ArrayList<Etage> etagenList) {
        anzahlGaeste = 0;
        for (Etage etage : etagenList) {
            anzahlGaeste += etage.getAnzahlGaeste();
        }
    }

    @Override
    public String toString() {
        String text = "\nGebäude: " + name;
        for (Etage etage : etagenList) {
            text += etage;
        }
        text += "\ngesamt: Zimmer: " + anzahlZimmer + ", Freie Zimmer: " + anzahlFZimmer + ", Gäste: " + anzahlGaeste;
        return text;
    }
}
