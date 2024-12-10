import java.util.List;

public abstract class Observer<T> {
    public abstract void update(T change);
}
