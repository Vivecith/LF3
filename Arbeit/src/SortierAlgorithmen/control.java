package SortierAlgorithmen;

import java.util.ArrayList;

public class control {
    public static void main(String[] args) {
        ArrayList<Double> werte = new ArrayList<>();
        werte.add(1.2);
        werte.add(4.1);
        werte.add(7.5);
        werte.add(2.1);
        werte.add(5.5);
        werte.add(0.3);
        Selectionsort selection = new Selectionsort();
        System.out.println(selection.sortiereDESC(werte));
    }

}