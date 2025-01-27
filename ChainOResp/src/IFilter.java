public interface IFilter {
    public void setNext(IFilter next);
    public boolean checkRequest();
}
