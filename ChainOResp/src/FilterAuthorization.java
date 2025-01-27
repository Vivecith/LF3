import org.w3c.dom.ls.LSOutput;

public class FilterAuthorization implements IFilter{
    private IFilter next = null;

    @Override
    public void setNext(IFilter next) {
        this.next = next;
    }

    @Override
    public boolean checkRequest() {
        System.out.println(
                IO.Colours.ORANGE
                        + "Authorization checked"
                        + IO.Colours.RESET
        );
        if(next != null && next.checkRequest()) {
            System.out.println(
                    IO.Colours.Templates.GREEN("Authorized")
            );
            return true;
        } else {
            System.out.println(
                    "\u001B[38;5;196m"
                            + "not Authorized"
                            + IO.Colours.RESET
            );
            return false;
        }
    }
}
