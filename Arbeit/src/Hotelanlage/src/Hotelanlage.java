import java.util.ArrayList;

public class Hotelanlage {
    private String name;
    private Adresse adresse;
    private int anzahlGebaeude = 0;
    private int anzahlEtagen = 0;
    private int anzahlZimmer = 0;
    private int anzahlFZimmer = 0;
    private int anzahlGaeste = 0;
    private ArrayList<Gebaeude> gebaeudeList;

    public Hotelanlage(String name, ArrayList<Gebaeude> gebaeudeList) {
        this.name = name;
        this.gebaeudeList = gebaeudeList;
        calcAnzahlGebaeude(gebaeudeList);
        calcAnzahlEtagen(gebaeudeList);
        calcAnzahlZimmer(gebaeudeList);
        calcAnzahlFZimmer(gebaeudeList);
        calcAnzahlGaeste(gebaeudeList);
    }

    public void calcAnzahlGebaeude(ArrayList<Gebaeude> gebaeudeList) {
        anzahlGebaeude = gebaeudeList.size();
    }
    public void calcAnzahlEtagen(ArrayList<Gebaeude> gebaeudeList) {
        for (Gebaeude gebaeude : gebaeudeList) {
            anzahlEtagen += gebaeude.getAnzahlEtagen();
        }
    }
    public void calcAnzahlZimmer(ArrayList<Gebaeude> gebaeudeList) {
        for (Gebaeude gebaeude : gebaeudeList) {
            anzahlZimmer += gebaeude.getAnzahlZimmer();
        }
    }
    public void calcAnzahlFZimmer(ArrayList<Gebaeude> gebaeudeList) {
        for (Gebaeude gebaeude : gebaeudeList) {
            anzahlFZimmer += gebaeude.getAnzahlFZimmer();
        }
    }
    public void calcAnzahlGaeste(ArrayList<Gebaeude> gebaeudeList) {
        for (Gebaeude gebaeude : gebaeudeList) {
            anzahlGaeste += gebaeude.getAnzahlGaeste();
        }
    }
}
