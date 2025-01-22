import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class control {
    public static void main(String[] args) throws IOException {
        MenuText(0);
        MenuText(1);
        boolean repeat1 = false;
        {
            boolean repeat2 = false;
            System.out.print("Ihre Eingabe");
            String input = IO.readString();

            Selectionsort selection1 = new Selectionsort();

            Bubblesort selection2 = new Bubblesort();

            Insertionsort selection3 = new Insertionsort();

            Quicksort selection4 = new Quicksort();

            double[] list = {17.07, 14.83, 3.65, 1.36, 16.23, 13.83, 18.55, 15.42, 8.72, 3.06, 13.53, 16.3, 13.73, 5.46, 11.85, 2.99, 12.13, 10.44, 7.25, 15.58};
            ArrayList<Double> werte = new ArrayList<>();
            for (double d : list) {
                werte.add(d);
            }
            System.out.println(selection1.sortiereASC(werte));
            System.out.println(selection1.sortiereDESC(werte));

            System.out.print("Wollen Sie noch eine Sortierung ausführen?");
        }while(repeat1);
        /*
        TEST
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

    public static void MenuText(int index) { //Text-Methode ohne variable Ausgaben
        switch (index) {
            case 0 -> //name text
                System.out.println("""
                        Algorithmus-Programm
                        
                        Willkommen Nutzer!
                        """);
            case 1 -> //menu text
                    System.out.println("""
                            Bitte wählen Sie, welchen Sortieralgorithmus Sie verwenden möchten.
                            [0] Selectionsort
                            [1] Bubblesort
                            [2] Insertionsort
                            [3] Quicksort
                            -------------------------------------------------------------------
                            [x] Programm schließen
                            """);
            case 2 -> //number insert prompt
                    System.out.println("""
                            Bitte geben Sie die Liste an, die Sie Sortieren möchten.
                            Oder 'x', wenn Sie zurück zum Menu möchten.
                            """);
        }
    }
    public static void MenuText(int index, String text) { //Text-Methode mit variablen Ausgaben
        switch (index) {

        }
    }
}