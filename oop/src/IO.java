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
}