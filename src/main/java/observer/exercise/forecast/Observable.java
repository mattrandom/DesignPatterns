package observer.exercise.forecast;

import observer.exercise.notification.Observer;

public interface Observable {
    void registerObserver(Observer observer);

    void unregisterObserver(Observer observer);

    void notifyObservers();
}

