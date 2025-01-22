import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class control {
    public static void main(String[] args) throws IOException {
        MenuText(0);
        boolean repeat1;
        do {
            repeat1 = false;
            boolean repeat2;
            ISortierbar selection = null;
            do {
                MenuText(1);
                repeat2 = false;
                System.out.print("\nIhre Eingabe: ");
                String input = IO.readString();
                switch (input) {
                    case "0": {
                        selection = new Selectionsort();
                        break;
                    }
                    case "1": {
                        selection = new Bubblesort();
                        break;
                    }
                    case "2": {
                        selection = new Insertionsort();
                        break;
                    }
                    case "3": {
                        selection = new Quicksort();
                        break;
                    }
                    case "x": {
                        System.out.println("Programm wird geschloßen...");
                        System.exit(100);
                    }
                    default: {
                        System.out.println("Ungültige Eingabe!");
                        repeat2 = true;
                    }
                }
            } while (repeat2);
            do {
                MenuText(2);
                System.out.print("\nIhre Eingabe: ");
                String input = IO.readString();
                if (!input.equals("x")) {
                    try {
                        double[] list = new double[input.split("[;,]").length];
                        for (int i = 0; i < list.length; i++) {
                            list[i] = Double.parseDouble(input.split("[;,]")[i]);
                        }
                        //{17.07, 14.83, 3.65, 1.36, 16.23, 13.83, 18.55, 15.42, 8.72, 3.06, 13.53, 16.3, 13.73, 5.46, 11.85, 2.99, 12.13, 10.44, 7.25, 15.58};
                        ArrayList<Double> werte = new ArrayList<>();
                        for (double d : list) {
                            werte.add(d);
                        }
                        System.out.println("Aufsteigend:");
                        System.out.println(selection.sortiereASC(werte));
                        System.out.println("Absteigend:");
                        System.out.println(selection.sortiereDESC(werte));

                        System.out.print("\nWollen Sie noch eine Sortierung ausführen [y/n]?: ");
                        repeat1 = IO.readBoolean();
                        repeat2 = false;
                    } catch (Exception e) {
                        System.out.println("Fehler beim Ausführen der Sortierung!");
                        repeat2 = true;
                    }
                } else {
                    repeat1 = true;
                    repeat2 = false;
                }
            } while (repeat2);
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
                            Bitte geben Sie die Listenwerte an, die Sie Sortieren möchten.
                            Die Werte sollten in einer Reihe und mit ';' oder ',' getrennt sein.
                            Oder 'x', wenn Sie zurück zum Menu möchten.
                            """);
        }
    }
}