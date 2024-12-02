public class GastNotCheckedInException extends Exception {
    private Gast gast;

    public GastNotCheckedInException(Gast gast) {
        this.gast = gast;
    }

    @Override
    public String getMessage() {
        String text = "Der Gast "+gast.getFullName()+" ist Nicht eingecheckt!";
        return text;
    }
}
