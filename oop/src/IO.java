import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO {

    public static String readString() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input_String = br.readLine();
        return input_String;
    }

    public static int readInteger() throws IOException {
        while (true) {
            try {
                String numeral_int = readString();
                int numeral = Integer.parseInt(numeral_int);
                return numeral;
            }
            catch (NumberFormatException e) {
                System.out.println("Please insert your value in arabic numerals.");
                System.out.print("EXAMPLE: [1, 2, 3, 4,...]: ");
            }
        }
    }

    public static double readDouble() throws IOException {
        while (true) {
            try {
                String numeral_double = readString();
                double numeral = Double.parseDouble(numeral_double.replace(',', '.'));
                return numeral;
            }
            catch (NumberFormatException e) {
                System.out.println("Please insert your value in arabic numerals.");
                System.out.print("EXAMPLE: [1.0, 2.0, 3.0, 4.0,...]: ");
            }
        }
    }

    public static boolean readBoolean() throws IOException {
        while (true) {
            String input_Boolean = readString();
            if ((input_Boolean.equalsIgnoreCase("y"))
                    || (input_Boolean.equalsIgnoreCase("yes"))
                    || (input_Boolean.equalsIgnoreCase("t"))
                    || (input_Boolean.equalsIgnoreCase("true"))
                    || (input_Boolean.equalsIgnoreCase("j"))
                    || (input_Boolean.equalsIgnoreCase("ja"))) {
                return true;
            }else if ((input_Boolean.equalsIgnoreCase("n"))
                    || (input_Boolean.equalsIgnoreCase("no"))
                    || (input_Boolean.equalsIgnoreCase("nein"))
                    || (input_Boolean.equalsIgnoreCase("f"))
                    || (input_Boolean.equalsIgnoreCase("false"))) {
                return false;
            }else{
                System.out.print("Unknown Input, try again: ");
            }
        }
    }

    public static int[] readIntegerArray1D(int valueAmount, String text) throws IOException {
        int[] array = new int[valueAmount];
        for (int i=0;i<array.length;i++){
            System.out.print(text+" "+(i+1)+": ");
            array[i] = readInteger();
        }
        return array;
    }

    public static int[] readIntegerArray1D(String textFront, String[] textRear) throws IOException {
        int[] array = new int[textRear.length];
        for (int i=0;i<array.length;i++){
            System.out.print(textFront+" '"+textRear[i]+"': ");
            array[i] = readInteger();
        }return array;
    }

    public static double[] readDoubleArray1D(int valueAmount, String text) throws IOException {
        double[] array = new double[valueAmount];
        for (int i=0;i<array.length;i++){
            System.out.print(text+" "+(i+1)+": ");
            array[i] = readDouble();
        }
        return array;
    }

    public static double[] readDoubleArray1D(String textFront, String[] textRear) throws IOException {
        double[] array = new double[textRear.length];
        for (int i=0;i<array.length;i++){
            System.out.print(textFront+" '"+textRear[i]+"': ");
            array[i] = readDouble();
        }return array;
    }

    public static String[] readStringArray1D(int valueAmount, String text) throws IOException {
        String[] array = new String[valueAmount];
        for (int i=0;i<array.length;i++){
            System.out.print(text+" "+(i+1)+": ");
            array[i] = readString();
        }
        return array;
    }

    public static String[] readStringArray1D(String textFront, String[] textRear) throws IOException {
        String[] array = new String[textRear.length];
        for (int i=0;i<array.length;i++){
            System.out.print(textFront+" '"+textRear[i]+"': ");
            array[i] = readString();
        }return array;
    }

    public static class Colours {
        public static String RESET = "\u001B[0m"; //Resets ALL

        // REGULAR
        public static String BLACK = "\u001B[30m";
        public static String RED = "\u001B[31m";
        public static String GREEN = "\u001B[32m";
        public static String YELLOW = "\u001B[33m";
        public static String BLUE = "\u001B[34m";
        public static String PURPLE = "\u001B[35m";
        public static String CYAN = "\u001B[36m";
        public static String WHITE = "\u001B[37m";

        //BOLD
        public static String BLACK_BOLD = "\u001B[1;30m";
        public static String RED_BOLD = "\u001B[1;31m";
        public static String GREEN_BOLD = "\u001B[1;32m";
        public static String YELLOW_BOLD = "\u001B[1;33m";
        public static String BLUE_BOLD = "\u001B[1;34m";
        public static String PURPLE_BOLD = "\u001B[1;35m";
        public static String CYAN_BOLD = "\u001B[1;36m";
        public static String WHITE_BOLD = "\u001B[1;37m";

        //ITALIC
        public static String BLACK_ITALIC = "\u001B[3;30m";
        public static String RED_ITALIC = "\u001B[3;31m";
        public static String GREEN_ITALIC = "\u001B[3;32m";
        public static String YELLOW_ITALIC = "\u001B[3;33m";
        public static String BLUE_ITALIC = "\u001B[3;34m";
        public static String PURPLE_ITALIC = "\u001B[3;35m";
        public static String CYAN_ITALIC = "\u001B[3;36m";
        public static String WHITE_ITALIC = "\u001B[3;37m";

        //UNDERLINED
        public static String BLACK_LINED = "\u001B[4;30m";
        public static String RED_LINED = "\u001B[4;31m";
        public static String GREEN_LINED = "\u001B[4;32m";
        public static String YELLOW_LINED = "\u001B[4;33m";
        public static String BLUE_LINED = "\u001B[4;34m";
        public static String PURPLE_LINED = "\u001B[4;35m";
        public static String CYAN_LINED = "\u001B[4;36m";
        public static String WHITE_LINED = "\u001B[4;37m";

        //REGULAR + HIGH BRIGHTNESS
        public static String BLACK_BRIGHT = "\u001B[90m";
        public static String RED_BRIGHT = "\u001B[91m";
        public static String GREEN_BRIGHT = "\u001B[92m";
        public static String YELLOW_BRIGHT = "\u001B[93m";
        public static String BLUE_BRIGHT = "\u001B[94m";
        public static String PURPLE_BRIGHT = "\u001B[95m";
        public static String CYAN_BRIGHT = "\u001B[96m";
        public static String WHITE_BRIGHT = "\u001B[97m";

        //BACKGROUND
        public static String BLACKBACK = "\u001B[40m";
        public static String REDBACK = "\u001B[41m";
        public static String GREENBACK = "\u001B[42m";
        public static String YELLOWBACK = "\u001B[43m";
        public static String BLUEBACK = "\u001B[44m";
        public static String PURPLEBACK = "\u001B[45m";
        public static String CYANBACK = "\u001B[46m";
        public static String WHITEBACK = "\u001B[47m";

        //BACKGROUND + HIGH BRIGHTNESS
        public static String BLACKBACK_BRIGHT = "\u001B[100m";
        public static String REDBACK_BRIGHT = "\u001B[101m";
        public static String GREENBACK_BRIGHT = "\u001B[102m";
        public static String YELLOWBACK_BRIGHT = "\u001B[103m";
        public static String BLUEBACK_BRIGHT = "\u001B[104m";
        public static String PURPLEBACK_BRIGHT = "\u001B[105m";
        public static String CYANBACK_BRIGHT = "\u001B[106m";
        public static String WHITEBACK_BRIGHT = "\u001B[107m";

        //Vorgesetzte Stylings
        public static class Templates {
            //Reguläre für schnelles Styling
            public static String BLUE(String text) {
                return BLUE + text + RESET;
            }
            public static String RED(String text) {
                return RED + text + RESET;
            }
            public static String GREEN(String text) {
                return GREEN + text + RESET;
            }
            public static String YELLOW(String text) {
                return YELLOW + text + RESET;
            }

            //Spezielle Styles
            public static String FALLOUT(String text) { //Styling ähnlich dem Dialog in Fallout 1
                return GREEN_BOLD + BLACKBACK + text + RESET;
            }
            public static String FALLOUTINVERSE(String text) { //Invertierte Version von FALLOUT
                return BLACK_BOLD + GREENBACK + text + RESET;
            }
            public static String FALLOUTNV(String text) { //Styling ähnlich dem Dialog in Fallout New Vegas
                return YELLOW_BOLD + BLACKBACK + text + RESET;
            }
            public static String FALLOUTNVINVERSE(String text) { //Invertierte Version von FALLOUTNV
                return BLACK_BOLD + YELLOWBACK + text + RESET;
            }
        }
    }


}