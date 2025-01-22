import java.util.ArrayList;

public class Selectionsort implements ISortierbar{
    @Override
    public ArrayList<Double> sortiereASC(ArrayList<Double> werte) {
        ArrayList<Double> sortiert = new ArrayList<>();
        ArrayList<Double> werte2 = new ArrayList<>(werte);

        System.out.println("\u001B[34m" + sortiert + "\u001B[0m" + "@"+ "\u001B[31m" + werte2 + "\u001B[0m");

        while (!werte2.isEmpty()) {
            double x = werte2.get(0);
            for (int i = 1; i < werte2.size(); i++) {
                x = Math.min(werte2.get(i), x);
            }
            sortiert.add(x);
            werte2.remove(x);

            System.out.println("\u001B[34m" + sortiert + "\u001B[0m" + "@"+ "\u001B[31m" + werte2 + "\u001B[0m");
        }
        return sortiert;
    }

    @Override
    public ArrayList<Double> sortiereDESC(ArrayList<Double> werte) {
        ArrayList<Double> sortiert = new ArrayList<>();
        ArrayList<Double> werte2 = new ArrayList<>(werte);

        System.out.println("\u001B[34m" + sortiert + "\u001B[0m" + "@"+ "\u001B[31m" + werte2 + "\u001B[0m");

        while (!werte2.isEmpty()) {
            double x = werte2.get(0);
            for (int i = 1; i < werte2.size(); i++) {
                x = Math.max(werte2.get(i), x);
            }
            sortiert.add(x);
            werte2.remove(x);

            System.out.println("\u001B[34m" + sortiert + "\u001B[0m" + "@"+ "\u001B[31m" + werte2 + "\u001B[0m");
        }
        return sortiert;
    }
}
