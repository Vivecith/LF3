import java.util.ArrayList;

public class Selectionsort implements ISortierbar{
    @Override
    public ArrayList<Double> sortiereASC(ArrayList<Double> werte) {
        ArrayList<Double> sortiert = new ArrayList<>();
        ArrayList<Double> werte2 = new ArrayList<>(werte);


        while (!werte2.isEmpty()) {
            double x = werte2.get(0);
            for (int i = 1; i < werte2.size(); i++) {
                x = Math.min(werte2.get(i), x);
            }
            sortiert.add(x);
            werte2.remove(x);
        }
        return sortiert;
    }

    @Override
    public ArrayList<Double> sortiereDESC(ArrayList<Double> werte) {
        ArrayList<Double> sortiert = new ArrayList<>();
        ArrayList<Double> werte2 = new ArrayList<>(werte);


        while (!werte2.isEmpty()) {
            double x = werte2.get(0);
            for (int i = 1; i < werte2.size(); i++) {
                x = Math.max(werte2.get(i), x);
            }
            sortiert.add(x);
            werte2.remove(x);
        }
        return sortiert;
    }
}
