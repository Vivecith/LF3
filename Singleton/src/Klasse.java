public class Klasse {
    private String speicherort;
    private static Klasse instance;

    private Klasse() {}

    public static Klasse getInstance() {
        if (instance == null) {
            instance = new Klasse();
            System.out.println(IO.Colours.Templates.YELLOW("Klasse erstellt!"));
        }
        return instance;
    }

    public void setSpeicherort(String speicherort) {
        this.speicherort = speicherort;
        System.out.println(IO.Colours.Templates.RED("Speicherort: " + speicherort));
    }

    public String getSpeicherort() {
        return speicherort;
    }
}
