public class FilterRole implements IFilter {
    private IFilter next = null;

    @Override
    public void setNext(IFilter next) {
        this.next = next;
    }

    @Override
    public boolean checkRequest() {
        System.out.println(
                "\u001B[38;5;88m"
                        + "Role checked"
                        + IO.Colours.RESET
        );
        return false;
    }
}
