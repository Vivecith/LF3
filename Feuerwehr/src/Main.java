public class Main {
    public static void main(String[] args) {
        Brandmeister brandmeister = new Brandmeister();

        Feuerwehrmann feuerwehrmann1 = new Feuerwehrmann("Hans","Günter");
        Feuerwehrmann feuerwehrmann2 = new Feuerwehrmann("Jason", "Momoa");
        Feuerwehrmann feuerwehrmann3 = new Feuerwehrmann("Johnathan", "Smith");

        brandmeister.addObserver(feuerwehrmann1);
        brandmeister.addObserver(feuerwehrmann2);
        brandmeister.addObserver(feuerwehrmann3);

        brandmeister.work();
    }
}