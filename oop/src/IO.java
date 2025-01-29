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

    public static final class Colours {
        public static final String RESET = "\u001B[0m"; //Resets ALL

        public static final String BLACK = "\u001B[30m";
        public static final String RED = "\u001B[31m";
        public static final String GREEN = "\u001B[32m";
        public static final String YELLOW = "\u001B[33m";
        public static final String BLUE = "\u001B[34m";
        public static final String MAGENTA = "\u001B[35m";
        public static final String CYAN = "\u001B[36m";
        public static final String WHITE = "\u001B[37m";

        public static final String ORANGE = "\u001B[38;5;166m";
        public static final String CRIMSON = "\u001B[38;5;88m";
        public static final String NAVY = "\u001B[38;5;18m";
        public static final String VIOLET = "\u001B[38;5;55m";
        public static final String SCARLET = "\u001B[38;5;160m";

        public static final String DARKBLUE = "\u001B[38;5;20m";
        public static final String DARKGREEN = "\u001B[38;5;22m";

        //BOLD
        public static final String BLACK_BOLD = "\u001B[1;30m";
        public static final String RED_BOLD = "\u001B[1;31m";
        public static final String GREEN_BOLD = "\u001B[1;32m";
        public static final String YELLOW_BOLD = "\u001B[1;33m";
        public static final String BLUE_BOLD = "\u001B[1;34m";
        public static final String MAGENTA_BOLD = "\u001B[1;35m";
        public static final String CYAN_BOLD = "\u001B[1;36m";
        public static final String WHITE_BOLD = "\u001B[1;37m";

        public static final String ORANGE_BOLD = "\u001B[1;38;5;166m";
        public static final String CRIMSON_BOLD = "\u001B[1;38;5;88m";
        public static final String NAVY_BOLD = "\u001B[1;38;5;18m";
        public static final String VIOLET_BOLD = "\u001B[1;38;5;55m";
        public static final String SCARLET_BOLD = "\u001B[1;38;5;160m";

        public static final String DARKBLUE_BOLD = "\u001B[1;38;5;20m";
        public static final String DARKGREEN_BOLD = "\u001B[1;38;5;22m";

        //ITALIC
        public static final String BLACK_ITALIC = "\u001B[3;30m";
        public static final String RED_ITALIC = "\u001B[3;31m";
        public static final String GREEN_ITALIC = "\u001B[3;32m";
        public static final String YELLOW_ITALIC = "\u001B[3;33m";
        public static final String BLUE_ITALIC = "\u001B[3;34m";
        public static final String MAGENTA_ITALIC = "\u001B[3;35m";
        public static final String CYAN_ITALIC = "\u001B[3;36m";
        public static final String WHITE_ITALIC = "\u001B[3;37m";

        public static final String ORANGE_ITALIC = "\u001B[3;38;5;166m";
        public static final String CRIMSON_ITALIC = "\u001B[3;38;5;88m";
        public static final String NAVY_ITALIC = "\u001B[3;38;5;18m";
        public static final String VIOLET_ITALIC = "\u001B[3;38;5;55m";
        public static final String SCARLET_ITALIC = "\u001B[3;38;5;160m";

        public static final String DARKBLUE_ITALIC = "\u001B[3;38;5;20m";
        public static final String DARKGREEN_ITALIC = "\u001B[3;38;5;22m";

        //UNDERLINED
        public static final String BLACK_LINED = "\u001B[4;30m";
        public static final String RED_LINED = "\u001B[4;31m";
        public static final String GREEN_LINED = "\u001B[4;32m";
        public static final String YELLOW_LINED = "\u001B[4;33m";
        public static final String BLUE_LINED = "\u001B[4;34m";
        public static final String MAGENTA_LINED = "\u001B[4;35m";
        public static final String CYAN_LINED = "\u001B[4;36m";
        public static final String WHITE_LINED = "\u001B[4;37m";

        public static final String ORANGE_LINED = "\u001B[4;38;5;166m";
        public static final String CRIMSON_LINED = "\u001B[4;38;5;88m";
        public static final String NAVY_LINED = "\u001B[4;38;5;18m";
        public static final String VIOLET_LINED = "\u001B[4;38;5;55m";
        public static final String SCARLET_LINED = "\u001B[4;38;5;160m";

        public static final String DARKBLUE_LINED = "\u001B[4;38;5;20m";
        public static final String DARKGREEN_LINED = "\u001B[4;38;5;22m";

        //BRIGHT
        public static final String BLACK_BRIGHT = "\u001B[90m";
        public static final String RED_BRIGHT = "\u001B[91m";
        public static final String GREEN_BRIGHT = "\u001B[92m";
        public static final String YELLOW_BRIGHT = "\u001B[93m";
        public static final String BLUE_BRIGHT = "\u001B[94m";
        public static final String MAGENTA_BRIGHT = "\u001B[95m";
        public static final String CYAN_BRIGHT = "\u001B[96m";
        public static final String WHITE_BRIGHT = "\u001B[97m";

        public static final String ORANGE_BRIGHT = "\u001B[38;5;202m";
        public static final String CRIMSON_BRIGHT = "\u001B[38;5;124m";
        public static final String NAVY_BRIGHT = "\u001B[38;5;19m";
        public static final String VIOLET_BRIGHT = "\u001B[38;5;56m";
        public static final String SCARLET_BRIGHT = "\u001B[38;5;196m";

        public static final String DARKBLUE_BRIGHT = "\u001B[38;5;21m";
        public static final String DARKGREEN_BRIGHT = "\u001B[38;5;28m";

        //BOLD + BRIGHT
        public static final String BLACK_BOLD_BRIGHT = "\u001B[1;90m";
        public static final String RED_BOLD_BRIGHT = "\u001B[1;91m";
        public static final String GREEN_BOLD_BRIGHT = "\u001B[1;92m";
        public static final String YELLOW_BOLD_BRIGHT = "\u001B[1;93m";
        public static final String BLUE_BOLD_BRIGHT = "\u001B[1;94m";
        public static final String MAGENTA_BOLD_BRIGHT = "\u001B[1;95m";
        public static final String CYAN_BOLD_BRIGHT = "\u001B[1;96m";
        public static final String WHITE_BOLD_BRIGHT = "\u001B[1;97m";

        public static final String ORANGE_BOLD_BRIGHT = "\u001B[1;38;5;202m";
        public static final String CRIMSON_BOLD_BRIGHT = "\u001B[1;38;5;124m";
        public static final String NAVY_BOLD_BRIGHT = "\u001B[1;38;5;19m";
        public static final String VIOLET_BOLD_BRIGHT = "\u001B[1;38;5;56m";
        public static final String SCARLET_BOLD_BRIGHT = "\u001B[1;38;5;196m";

        public static final String DARKBLUE_BOLD_BRIGHT = "\u001B[1;38;5;21m";
        public static final String DARKGREEN_BOLD_BRIGHT = "\u001B[1;38;5;28m";

        //ITALIC + BRIGHT
        public static final String BLACK_ITALIC_BRIGHT = "\u001B[3;90m";
        public static final String RED_ITALIC_BRIGHT = "\u001B[3;91m";
        public static final String GREEN_ITALIC_BRIGHT = "\u001B[3;92m";
        public static final String YELLOW_ITALIC_BRIGHT = "\u001B[3;93m";
        public static final String BLUE_ITALIC_BRIGHT = "\u001B[3;94m";
        public static final String MAGENTA_ITALIC_BRIGHT = "\u001B[3;95m";
        public static final String CYAN_ITALIC_BRIGHT = "\u001B[3;96m";
        public static final String WHITE_ITALIC_BRIGHT = "\u001B[3;97m";

        public static final String ORANGE_ITALIC_BRIGHT = "\u001B[3;38;5;202m";
        public static final String CRIMSON_ITALIC_BRIGHT = "\u001B[3;38;5;124m";
        public static final String NAVY_ITALIC_BRIGHT = "\u001B[3;38;5;19m";
        public static final String VIOLET_ITALIC_BRIGHT = "\u001B[3;38;5;56m";
        public static final String SCARLET_ITALIC_BRIGHT = "\u001B[3;38;5;196m";

        public static final String DARKBLUE_ITALIC_BRIGHT = "\u001B[3;38;5;21m";
        public static final String DARKGREEN_ITALIC_BRIGHT = "\u001B[3;38;5;28m";

        //UNDERLINED + BRIGHT
        public static final String BLACK_LINED_BRIGHT = "\u001B[4;90m";
        public static final String RED_LINED_BRIGHT = "\u001B[4;91m";
        public static final String GREEN_LINED_BRIGHT = "\u001B[4;92m";
        public static final String YELLOW_LINED_BRIGHT = "\u001B[4;93m";
        public static final String BLUE_LINED_BRIGHT = "\u001B[4;94m";
        public static final String MAGENTA_LINED_BRIGHT = "\u001B[4;95m";
        public static final String CYAN_LINED_BRIGHT = "\u001B[4;96m";
        public static final String WHITE_LINED_BRIGHT = "\u001B[4;97m";

        public static final String ORANGE_LINED_BRIGHT = "\u001B[4;38;5;202m";
        public static final String CRIMSON_LINED_BRIGHT = "\u001B[4;38;5;124m";
        public static final String NAVY_LINED_BRIGHT = "\u001B[4;38;5;19m";
        public static final String VIOLET_LINED_BRIGHT = "\u001B[4;38;5;56m";
        public static final String SCARLET_LINED_BRIGHT = "\u001B[4;38;5;196m";

        public static final String DARKBLUE_LINED_BRIGHT = "\u001B[4;38;5;21m";
        public static final String DARKGREEN_LINED_BRIGHT = "\u001B[4;38;5;28m";

        //BACKGROUND
        public static final String BLACKBACK = "\u001B[40m";
        public static final String REDBACK = "\u001B[41m";
        public static final String GREENBACK = "\u001B[42m";
        public static final String YELLOWBACK = "\u001B[43m";
        public static final String BLUEBACK = "\u001B[44m";
        public static final String MAGENTABACK = "\u001B[45m";
        public static final String CYANBACK = "\u001B[46m";
        public static final String WHITEBACK = "\u001B[47m";

        public static final String ORANGEBACK = "\u001B[48;5;166m";
        public static final String CRIMSONBACK = "\u001B[48;5;88m";
        public static final String NAVYBACK = "\u001B[48;5;18m";
        public static final String VIOLETBACK = "\u001B[48;5;55m";
        public static final String SCARLETBACK = "\u001B[48;5;160m";

        public static final String DARKBLUEBACK = "\u001B[48;5;20m";
        public static final String DARKGREENBACK = "\u001B[48;5;22m";

        //BACKGROUND + HIGH BRIGHTNESS
        public static final String BLACKBACK_BRIGHT = "\u001B[100m";
        public static final String REDBACK_BRIGHT = "\u001B[101m";
        public static final String GREENBACK_BRIGHT = "\u001B[102m";
        public static final String YELLOWBACK_BRIGHT = "\u001B[103m";
        public static final String BLUEBACK_BRIGHT = "\u001B[104m";
        public static final String MAGENTABACK_BRIGHT = "\u001B[105m";
        public static final String CYANBACK_BRIGHT = "\u001B[106m";
        public static final String WHITEBACK_BRIGHT = "\u001B[107m";

        public static final String ORANGEBACK_BRIGHT = "\u001B[48;5;202m";
        public static final String CRIMSONBACK_BRIGHT = "\u001B[48;5;124m";
        public static final String NAVYBACK_BRIGHT = "\u001B[48;5;19m";
        public static final String VIOLETBACK_BRIGHT = "\u001B[48;5;56m";
        public static final String SCARLETBACK_BRIGHT = "\u001B[48;5;196m";

        public static final String DARKBLUEBACK_BRIGHT = "\u001B[48;5;21m";
        public static final String DARKGREENBACK_BRIGHT = "\u001B[48;5;28m";

        public static String CUSTOM_FONT(int value) {
            return "\u001B[38;5;" + value + "m";
        }
        public static String CUSTOM_FONT(int value, int format) {
            return "\u001B[" + format + ";38;5;" + value + "m";
        }
        public static String CUSTOM_BACK(int value) {
            return "\u001B[48;5;" + value + "m";
        }

        //Stylingvorlagen
        public static class Templates {
            //Reguläre Stylingvorlagen
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

            //Spezielle Stylingvorlagen
            public static String FALLOUT(String text) { //Styling ähnlich dem Dialog in Fallout 1
                return DARKGREEN_BOLD + BLACKBACK + text + RESET;
            }
            public static String FALLOUTINVERSE(String text) { //Invertierte Version von FALLOUT
                return BLACK_BOLD + DARKGREENBACK + text + RESET;
            }
            public static String FALLOUTNV(String text) { //Styling ähnlich dem Dialog in Fallout New Vegas
                return YELLOW_BOLD + BLACKBACK + text + RESET;
            }
            public static String FALLOUTNVINVERSE(String text) { //Invertierte Version von FALLOUTNV
                return BLACK_BOLD + YELLOWBACK + text + RESET;
            }
            public static String POLKADOT(String text) {
                return SCARLET_BRIGHT + YELLOWBACK_BRIGHT + text + RESET;
            }
            public static String RAINBOW(String text) {
                StringBuilder text2 = new StringBuilder();
                String[] colours = {SCARLETBACK, ORANGEBACK_BRIGHT, YELLOWBACK_BRIGHT, GREENBACK_BRIGHT, CYANBACK, DARKBLUEBACK_BRIGHT, VIOLETBACK};
                for (int i = 0; i < text.length(); i++) {
                    text2.append(colours[i % colours.length]).append(text.charAt(i));
                }
                return BLACK + text2 + RESET;
            }
        }
    }
}