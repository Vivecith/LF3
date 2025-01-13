package SortierAlgorithmen;

import java.util.ArrayList;
import java.util.Arrays;

public class control {
    public static void main(String[] args) {
        double[] list = {2.3, 3.5, 5.8, 2.2, 1.2, 4.5, 5.6, 3.4, 6.7, 7.8};
        ArrayList<Double> werte = new ArrayList<>();
        for (double d : list) {
            werte.add(d);
        }

        Selectionsort selection = new Selectionsort();
        System.out.println(selection.sortiereASC(werte));
        System.out.println(selection.sortiereDESC(werte));
    }

}