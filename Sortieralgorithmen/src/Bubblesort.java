import java.util.ArrayList;

public class Bubblesort implements ISortierbar{
    @Override
    public ArrayList<Double> sortiereASC(ArrayList<Double> werte) {
        ArrayList<Double> werte2 = new ArrayList<>(werte);
        ArrayList<Double> sortiert = new ArrayList<>(werte);

        System.out.println("\u001B[34m" + sortiert + "\u001B[0m" + "@"+ "\u001B[31m" + werte2 + "\u001B[0m");

        while (!werte2.isEmpty()) {
            for (int i = 0; i < werte2.size() - 1; i++) {
                if (werte2.get(i) > werte2.get(i + 1)) {
                    double x = werte2.get(i);
                    double y = werte2.get(i + 1);
                    werte2.set(i, y);
                    werte2.set(i + 1, x);
                    sortiert.set(i, y);
                    sortiert.set(i + 1, x);
                }
            }
            werte2.remove(werte2.size() - 1);

            System.out.println("\u001B[34m" + sortiert + "\u001B[0m" + "@"+ "\u001B[31m" + werte2 + "\u001B[0m");
        }
        return sortiert;
    }

    @Override
    public ArrayList<Double> sortiereDESC(ArrayList<Double> werte) {
        ArrayList<Double> werte2 = new ArrayList<>(werte);
        ArrayList<Double> sortiert = new ArrayList<>(werte);

        System.out.println("\u001B[34m" + sortiert + "\u001B[0m" + "@"+ "\u001B[31m" + werte2 + "\u001B[0m");

        while (!werte2.isEmpty()) {
            for (int i = 0; i < werte2.size() - 1; i++) {
                if (werte2.get(i) < werte2.get(i + 1)) {
                    double x = werte2.get(i);
                    double y = werte2.get(i + 1);
                    werte2.set(i, y);
                    werte2.set(i + 1, x);
                    sortiert.set(i, y);
                    sortiert.set(i + 1, x);
                }
            }
            werte2.remove(werte2.size() - 1);

            System.out.println("\u001B[34m" + sortiert + "\u001B[0m" + "@"+ "\u001B[31m" + werte2 + "\u001B[0m");
        }
        return sortiert;
    }
}
