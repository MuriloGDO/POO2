package fourth_project;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Subject {
    List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        Iterator<Observer> it = observers.iterator();
        while (it.hasNext()) {
            Observer obs = it.next();
            obs.update(this);
        }
    }
}
