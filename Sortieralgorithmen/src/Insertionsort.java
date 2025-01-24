import java.util.ArrayList;

public class Insertionsort implements ISortierbar{
    @Override
    public ArrayList<Double> sortiereASC(ArrayList<Double> werte) {
        ArrayList<Double> werte2 = new ArrayList<>(werte);
        ArrayList<Double> sortiert = new ArrayList<>();

        System.out.println(IO.Colours.BLUE + sortiert + IO.Colours.RESET + "@"+ IO.Colours.RED + werte2 + IO.Colours.RESET);

        while (!werte2.isEmpty()) {
            double minWert = werte2.get(0);

            int insertPosition = 0;
            while (insertPosition < sortiert.size() && sortiert.get(insertPosition) < minWert) {
                insertPosition++;
            }
            sortiert.add(insertPosition, minWert);

            werte2.remove(0);

            System.out.println(IO.Colours.BLUE + sortiert + IO.Colours.RESET + "@"+ IO.Colours.RED + werte2 + IO.Colours.RESET);
        }

        return sortiert;
    }

    @Override
    public ArrayList<Double> sortiereDESC(ArrayList<Double> werte) {
        ArrayList<Double> werte2 = new ArrayList<>(werte);
        ArrayList<Double> sortiert = new ArrayList<>();

        System.out.println(IO.Colours.BLUE + sortiert + IO.Colours.RESET + "@"+ IO.Colours.RED + werte2 + IO.Colours.RESET);

        while (!werte2.isEmpty()) {
            double maxWert = werte2.get(0);

            int insertPosition = 0;
            while (insertPosition < sortiert.size() && sortiert.get(insertPosition) > maxWert) {
                insertPosition++;
            }
            sortiert.add(insertPosition, maxWert);

            werte2.remove(0);

            System.out.println(IO.Colours.BLUE + sortiert + IO.Colours.RESET + "@"+ IO.Colours.RED + werte2 + IO.Colours.RESET);
        }

        return sortiert;
    }
}
