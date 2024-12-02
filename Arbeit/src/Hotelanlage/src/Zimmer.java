import java.util.ArrayList;

public class Zimmer {
    private String name;
    private ArrayList<Gast> gastList;

    public Zimmer(String name) {
        this.name = name;
        gastList = new ArrayList<>();
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
        try {
            if (getGastList().contains(gast)) {
                throw new GastCheckedInException(gast);
            } else {
                gastList.add(gast);
            }
        } catch (GastCheckedInException e) {
            System.out.println(e.getMessage());
        }
    }
    public void removeGast(Gast gast) {
        try {
            if (!getGastList().contains(gast)) {
                throw new GastNotCheckedInException(gast);
            } else {
                gastList.remove(gast);
            }
        } catch (GastNotCheckedInException e) {
            System.out.println(e.getMessage());
        }
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
