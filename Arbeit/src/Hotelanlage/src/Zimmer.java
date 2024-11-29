import java.util.ArrayList;

public class Zimmer {
    private String name;
    private ArrayList<Gast> gastList;

    public Zimmer(String name) {
        this.name = name;
        gastList = new ArrayList<Gast>();
    }

    public String getName() {
        return name;
    }
    public ArrayList<Gast> getGastList() {
        return this.gastList;
    }
    public int getGastAmount() {
        return this.gastList.size();
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setGastList(ArrayList<Gast> gastList) {
        this.gastList = gastList;
    }

    public boolean isFree() {
        return this.gastList.isEmpty();
    }

    public void addGast(Gast gast) {
        gastList.add(gast);
    }
    public void removeGast(Gast gast) {
        gastList.remove(gast);
    }

    @Override
    public String toString() {
        String text = "\nZimmer: " + this.name;
        text += "\nFrei: " + this.isFree();
        if (this.isFree()) {
            text += "\n\tGästeanzahl: " + this.getGastAmount();
            text += "\n\tGäste: " + this.getGastList();
        }
        return text;
    }
}
