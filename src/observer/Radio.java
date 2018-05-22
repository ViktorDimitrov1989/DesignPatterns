package observer;

import java.util.List;

public class Radio implements IObservable {

    private List<IObserver> observers;

    public Radio() {
    }

    @Override
    public void addObserver(IObserver observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (IObserver observer : this.observers) {
            observer.observableStateIsChanged();
        }
    }
}
