import java.util.LinkedList;
import java.util.List;

public abstract class Subject<T> {
    private List<Observer<T>> observers = new LinkedList<>();

    public void subscribe(Observer<T> observer) {
        observers.add(observer);
    }

    public void notifyAllObservers(T change) {
        for (Observer<T> observer : observers) {
            observer.update(change);
        }
    }
}
