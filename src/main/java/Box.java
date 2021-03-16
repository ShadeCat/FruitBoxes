import java.util.ArrayList;

public class Box<T> {
    private ArrayList<T> items = new ArrayList<T>();

    public void putItem(final T item) {
        items.add(item);
    }

    public T getItem() {
        return items.get(0);
    }
}
