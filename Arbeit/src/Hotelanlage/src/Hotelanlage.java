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

    public String getName() {
        return name;
    }
    public Adresse getAdresse() {
        return adresse;
    }
    public ArrayList<Gebaeude> getGebaeudeList() {
        return gebaeudeList;
    }
    public int getAnzahlGebaeude() {
        return anzahlGebaeude;
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
    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }
    public void setGebaeudeList(ArrayList<Gebaeude> gebaeudeList) {
        this.gebaeudeList = gebaeudeList;
        calcAnzahlGebaeude(gebaeudeList);
        calcAnzahlEtagen(gebaeudeList);
        calcAnzahlZimmer(gebaeudeList);
        calcAnzahlFZimmer(gebaeudeList);
        calcAnzahlGaeste(gebaeudeList);
    }

    public String locGastByID(int gastID) {  //Locate Gast
        String text = "Der Gast #"+gastID+" ist nicht im Hotel!";
        for (Gebaeude g : gebaeudeList) {
            for (Etage e : g.getEtagenList()) {
                for (Zimmer z : e.getZimmerList()) {
                    for (Gast ga : z.getGastList()) {
                        if (ga.getGastNr() == gastID) {
                            text = "Der Gast "+ga.getFullName()+"[#"+ga.getGastNr()+"] ist in Zimmer "+z.getName()+".";
                        }
                    }
                }
            }
        }
        return text;
    }
    public void initializeGast(Gast gast, String room) {    //Initialisiere Gast
       String[] digits = room.split("");
       for (Gebaeude g : gebaeudeList) {
           if(g.getName().equals(digits[0])) {
               g.initializeGastA(gast, room);
               calcAnzahlFZimmer(this.gebaeudeList);
               calcAnzahlGaeste(this.gebaeudeList);
               break;
           }
       }
    }
    public void removeGast(Gast gast) {
        for (Gebaeude g : gebaeudeList) {
            for (Etage e : g.getEtagenList()) {
                for (Zimmer z : e.getZimmerList()) {
                    if (z.getGastList().contains(gast)) {
                        z.removeGast(gast);
                    }
                }
            }
        }
    }
    public void calcAnzahlGebaeude(ArrayList<Gebaeude> gebaeudeList) {
        anzahlGebaeude = gebaeudeList.size();
    }
    public void calcAnzahlEtagen(ArrayList<Gebaeude> gebaeudeList) {
        anzahlEtagen = 0;
        for (Gebaeude gebaeude : gebaeudeList) {
            anzahlEtagen += gebaeude.getAnzahlEtagen();
        }
    }
    public void calcAnzahlZimmer(ArrayList<Gebaeude> gebaeudeList) {
        anzahlZimmer = 0;
        for (Gebaeude gebaeude : gebaeudeList) {
            anzahlZimmer += gebaeude.getAnzahlZimmer();
        }
    }
    public void calcAnzahlFZimmer(ArrayList<Gebaeude> gebaeudeList) {
        anzahlFZimmer = 0;
        for (Gebaeude gebaeude : gebaeudeList) {
            anzahlFZimmer += gebaeude.getAnzahlFZimmer();
        }
    }
    public void calcAnzahlGaeste(ArrayList<Gebaeude> gebaeudeList) {
        anzahlGaeste = 0;
        for (Gebaeude gebaeude : gebaeudeList) {
            anzahlGaeste += gebaeude.getAnzahlGaeste();
        }
    }

    @Override
    public String toString() {
        String text = "\n"+name+": "+adresse+"\n";
        for (Gebaeude gebaeude : gebaeudeList) {
            text += gebaeude+"\n";
        }
        text += "\ngesamt: Zimmer: " + anzahlZimmer + ", Freie Zimmer: " + anzahlFZimmer + ", Gäste: " + anzahlGaeste;
        return text;
    }
}
