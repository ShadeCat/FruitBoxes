import java.util.ArrayList;

public class Box<T> {
    private ArrayList<T> items = new ArrayList<T>();

    public void putItem(final T item) {
        if (item != null) {
            items.add(item);
        }
    }

    public T getItem() {
        try {
            return items.get(0);
        } catch (IndexOutOfBoundsException e) {
            return null;
        }
    }
}
