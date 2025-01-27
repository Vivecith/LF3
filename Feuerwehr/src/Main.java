public class Main {
    public static void main(String[] args) {
        Brandmeister brandmeister = new Brandmeister();
        Feuerwehrmann feuerwehrmann1 = new Feuerwehrmann("Hans","Günter");
        Feuerwehrmann feuerwehrmann2 = new Feuerwehrmann("Jason", "Momoa");

        brandmeister.addObserver(feuerwehrmann1);
        brandmeister.addObserver(feuerwehrmann2);

        brandmeister.work();
    }
}