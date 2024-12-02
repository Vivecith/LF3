public class GastCheckedInException extends Exception {
    private Gast gast;

    public GastCheckedInException(Gast gast) {
        this.gast = gast;
    }

    @Override
    public String getMessage() {
        String text = "Der Gast "+gast.getFullName()+" ist schon eingecheckt!";
        return text;
    }
}
