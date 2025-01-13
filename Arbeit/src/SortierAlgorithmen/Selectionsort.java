package SortierAlgorithmen;

import java.util.ArrayList;

public class Selectionsort implements ISortierbar{
    @Override
    public ArrayList<Double> sortiereASC(ArrayList<Double> werte) {
        ArrayList<Double> sortiert = new ArrayList<>();

        while (!werte.isEmpty()) {
            double x = werte.get(0);
            for (int i = 1; i < werte.size(); i++) {
                x = Math.min(werte.get(i), x);
            }
            sortiert.add(x);
            werte.remove(x);
        }
        return sortiert;
    }

    @Override
    public ArrayList<Double> sortiereDESC(ArrayList<Double> werte) {
        ArrayList<Double> sortiert = new ArrayList<>();

        while (!werte.isEmpty()) {
            double x = werte.get(0);
            for (int i = 1; i < werte.size(); i++) {
                x = Math.max(werte.get(i), x);
            }
            sortiert.add(x);
            werte.remove(x);
        }
        return sortiert;
    }
}
