package SortierAlgorithmen;

import java.util.ArrayList;

public class Insertionsort implements ISortierbar{
    @Override
    public ArrayList<Double> sortiereASC(ArrayList<Double> werte) {
        ArrayList<Double> werte2 = new ArrayList<>(werte);
        double[] sortiert = new double[werte.size()];
        sortiert[0] = werte.get(0);
        werte2.remove(0);

        while (!werte2.isEmpty()) {

        }

        return null;
    }

    @Override
    public ArrayList<Double> sortiereDESC(ArrayList<Double> werte) {
        return null;
    }
}
