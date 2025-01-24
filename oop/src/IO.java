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
        public static String RESET = "\u001B[0m";
        public static String BLACK = "\u001B[30m";
        public static String RED = "\u001B[31m";
        public static String GREEN = "\u001B[32m";
        public static String YELLOW = "\u001B[33m";
        public static String BLUE = "\u001B[34m";
        public static String PURPLE = "\u001B[35m";
        public static String CYAN = "\u001B[36m";
        public static String WHITE = "\u001B[37m";
        public static String BLACKBACK = "\u001B[40m";
        public static String REDBACK = "\u001B[41m";
        public static String GREENBACK = "\u001B[42m";
        public static String YELLOWBACK = "\u001B[43m";
        public static String BLUEBACK = "\u001B[44m";
        public static String PURPLEBACK = "\u001B[45m";
        public static String CYANBACK = "\u001B[46m";
        public static String WHITEBACK = "\u001B[47m";
    }
}