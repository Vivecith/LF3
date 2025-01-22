import java.util.ArrayList;

public class Quicksort implements ISortierbar{
    @Override
    public ArrayList<Double> sortiereASC(ArrayList<Double> werte) {
        ArrayList<Double> werte2 = new ArrayList<>(werte);
        ArrayList<Double> sortiert = new ArrayList<>();

        if(werte2.size() > 1) {
            ArrayList<Double> temp1 = new ArrayList<>();
            ArrayList<Double> temp2 = new ArrayList<>();
            double p = werte2.get(0);
            for (int i = 1; i < werte2.size(); i++) {
                if (p > werte2.get(i)) {
                    temp1.add(werte2.get(i));
                } else if (p < werte2.get(i)) {
                    temp2.add(werte2.get(i));
                }
            }
            temp1 = sortiereASC(temp1);
            temp2 = sortiereASC(temp2);

            sortiert.addAll(temp1);
            sortiert.add(p);
            sortiert.addAll(temp2);
        } else {
            sortiert = werte;
        }
        return sortiert;
    }

    @Override
    public ArrayList<Double> sortiereDESC(ArrayList<Double> werte) {
        ArrayList<Double> werte2 = new ArrayList<>(werte);
        ArrayList<Double> sortiert = new ArrayList<>();

        if(werte2.size() > 1) {
            ArrayList<Double> temp1 = new ArrayList<>();
            ArrayList<Double> temp2 = new ArrayList<>();
            double p = werte2.get(0);
            for (int i = 1; i < werte2.size(); i++) {
                if (p < werte2.get(i)) {
                    temp1.add(werte2.get(i));
                } else if (p > werte2.get(i)) {
                    temp2.add(werte2.get(i));
                }
            }
            temp1 = sortiereDESC(temp1);
            temp2 = sortiereDESC(temp2);

            sortiert.addAll(temp1);
            sortiert.add(p);
            sortiert.addAll(temp2);
        } else {
            sortiert = werte;
        }
        return sortiert;
    }
}
