public class FilterBody implements IFilter{
    private IFilter next = null;

    @Override
    public void setNext(IFilter next) {
        this.next = next;
    }

    @Override
    public boolean checkRequest() {
        System.out.println(
                IO.Colours.RED
                        + "Body checked"
                        + IO.Colours.RESET
        );
        return next.checkRequest();
    }
}
