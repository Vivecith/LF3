import java.util.ArrayList;

public class Insertionsort implements ISortierbar{
    @Override
    public ArrayList<Double> sortiereASC(ArrayList<Double> werte) {
        ArrayList<Double> werte2 = new ArrayList<>(werte);
        ArrayList<Double> sortiert = new ArrayList<>();

        //System.out.println("\u001B[34m" + sortiert + "\u001B[0m" + "@"+ "\u001B[31m" + werte2 + "\u001B[0m");

        while (!werte2.isEmpty()) {
            double maxWert = werte2.get(0);

            int insertPosition = 0;
            while (insertPosition < sortiert.size() && sortiert.get(insertPosition) < maxWert) {
                insertPosition++;
            }
            sortiert.add(insertPosition, maxWert);

            werte2.remove(0);

            //System.out.println("\u001B[34m" + sortiert + "\u001B[0m" + "@"+ "\u001B[31m" + werte2 + "\u001B[0m");
        }

        return sortiert;
    }

    @Override
    public ArrayList<Double> sortiereDESC(ArrayList<Double> werte) {
        ArrayList<Double> werte2 = new ArrayList<>(werte);
        ArrayList<Double> sortiert = new ArrayList<>();

        while (!werte2.isEmpty()) {
            double maxWert = werte2.get(0);

            int insertPosition = 0;
            while (insertPosition < sortiert.size() && sortiert.get(insertPosition) > maxWert) {
                insertPosition++;
            }
            sortiert.add(insertPosition, maxWert);

            werte2.remove(0);
        }

        return sortiert;
    }
}
