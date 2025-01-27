import java.util.ArrayList;
import java.util.List;

public class Brandmeister {
    private List<IObserver> befehlsempfaengerList = new ArrayList<IObserver>();

    public void addObserver(IObserver observer) {
        befehlsempfaengerList.add(observer);
    }

    public void removeObserver(IObserver observer) {
        befehlsempfaengerList.remove(observer);
    }

    public void work() {
        ICommand command = new CommandWasserMarsch();
        notifyObservers(command);
    };

    private void notifyObservers(ICommand command) {
        System.out.println(
                IO.Colours.Templates.GREEN("Brandmeister gibt Befehle weiter!")
        );
        for (IObserver observer : befehlsempfaengerList) {
            observer.notify(command);
        }
    }
}
