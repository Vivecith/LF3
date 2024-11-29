import java.io.IOException;

public class TestIO_Arbeit {

    public static void main(String[] args) throws IOException  {

        do {
            System.out.print("Wie heißen Sie: ");
            String name = IO.readString();
            System.out.println("Hallo " + name + "!");

            System.out.print("Wie alt sind Sie: ");
            int alter = IO.readInteger();
            System.out.println("Sie sind " + alter + " Jahre alt!");

            System.out.print("Wie groß sind Sie in m? ");
            System.out.println("Sie sind " + IO.readDouble() + "m groß!");

            System.out.println("Soll das Programm wiederholt werden?");
        } while (IO.readBoolean());
    }

}