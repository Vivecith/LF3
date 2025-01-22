package SortierAlgorithmen;

import java.util.ArrayList;

public class Insertionsort implements ISortierbar{
    @Override
    public ArrayList<Double> sortiereASC(ArrayList<Double> werte) {
        ArrayList<Double> werte2 = new ArrayList<>(werte);
        ArrayList<Double> sortiert = new ArrayList<>();

        while (!werte2.isEmpty()) {
            double maxWert = werte2.get(0);
            int maxIndex = 0;
            for (int i = 1; i < werte2.size(); i++) {
                if (werte2.get(i) > maxWert) {
                    maxWert = werte2.get(i);
                    maxIndex = i;
                }
            }

            int insertPosition = 0;
            while (insertPosition < sortiert.size() && sortiert.get(insertPosition) < maxWert) {
                insertPosition++;
            }
            sortiert.add(insertPosition, maxWert);

            werte2.remove(maxIndex);
        }

        return sortiert;
    }

    @Override
    public ArrayList<Double> sortiereDESC(ArrayList<Double> werte) {
        ArrayList<Double> werte2 = new ArrayList<>(werte);
        ArrayList<Double> sortiert = new ArrayList<>();

        while (!werte2.isEmpty()) {
            double maxWert = werte2.get(0);
            int maxIndex = 0;
            for (int i = 1; i < werte2.size(); i++) {
                if (werte2.get(i) > maxWert) {
                    maxWert = werte2.get(i);
                    maxIndex = i;
                }
            }

            int insertPosition = 0;
            while (insertPosition < sortiert.size() && sortiert.get(insertPosition) > maxWert) {
                insertPosition++;
            }
            sortiert.add(insertPosition, maxWert);

            werte2.remove(maxIndex);
        }

        return sortiert;
    }
}
