package SortierAlgorithmen;

import java.util.ArrayList;
import java.util.Arrays;

public class control {
    public static void main(String[] args) {
        double[] list = {17.07,14.83,3.65,1.36,16.23,13.83,18.55,15.42,8.72,3.06,13.53,16.3,13.73,5.46,11.85,2.99,12.13,10.44,7.25,15.58};
        ArrayList<Double> werte = new ArrayList<>();
        for (double d : list) {
            werte.add(d);
        }
        Selectionsort selection1 = new Selectionsort();
        Bubblesort selection2 = new Bubblesort();
        Insertionsort selection3 = new Insertionsort();
        Quicksort selection4 = new Quicksort();
        System.out.println(selection1.sortiereASC(werte));
        System.out.println(selection1.sortiereDESC(werte));

        /*
        SortASC:
            Selectionsort:
            [1.36, 2.99, 3.06, 3.65, 5.46, 7.25, 8.72, 10.44, 11.85, 12.13, 13.53, 13.73, 13.83, 14.83, 15.42, 15.58, 16.23, 16.3, 17.07, 18.55]

            Bubblesort:
            [1.36, 2.99, 3.06, 3.65, 5.46, 7.25, 8.72, 10.44, 11.85, 12.13, 13.53, 13.73, 13.83, 14.83, 15.42, 15.58, 16.23, 16.3, 17.07, 18.55]

            Insertionsort:
            [1.36, 2.99, 3.06, 3.65, 5.46, 7.25, 8.72, 10.44, 11.85, 12.13, 13.53, 13.73, 13.83, 14.83, 15.42, 15.58, 16.23, 16.3, 17.07, 18.55]

            Quicksort:
            [1.36, 2.99, 3.06, 3.65, 5.46, 7.25, 8.72, 10.44, 11.85, 12.13, 13.53, 13.73, 13.83, 14.83, 15.42, 15.58, 16.23, 16.3, 17.07, 18.55]

        SortDESC:
            Selectionsort:
            [18.55, 17.07, 16.3, 16.23, 15.58, 15.42, 14.83, 13.83, 13.73, 13.53, 12.13, 11.85, 10.44, 8.72, 7.25, 5.46, 3.65, 3.06, 2.99, 1.36]

            Bubblesort:
            [18.55, 17.07, 16.3, 16.23, 15.58, 15.42, 14.83, 13.83, 13.73, 13.53, 12.13, 11.85, 10.44, 8.72, 7.25, 5.46, 3.65, 3.06, 2.99, 1.36]

            Insertionsort:
            [18.55, 17.07, 16.3, 16.23, 15.58, 15.42, 14.83, 13.83, 13.73, 13.53, 12.13, 11.85, 10.44, 8.72, 7.25, 5.46, 3.65, 3.06, 2.99, 1.36]

            Quicksort:
            [18.55, 17.07, 16.3, 16.23, 15.58, 15.42, 14.83, 13.83, 13.73, 13.53, 12.13, 11.85, 10.44, 8.72, 7.25, 5.46, 3.65, 3.06, 2.99, 1.36]

         */
    }

}