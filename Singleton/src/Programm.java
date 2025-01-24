public class Programm {

    public static void doWork() {
        Klasse.getInstance().setSpeicherort("Hello World");
        System.out.println(IO.Colours.Templates.BLUE(Klasse.getInstance().getSpeicherort()));
    }
}
