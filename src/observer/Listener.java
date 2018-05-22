package observer;

public class Listener implements IObserver {

    public Listener() {
    }

    @Override
    public void observableStateIsChanged() {
        System.out.println("State of the radio is changed");
    }
}
