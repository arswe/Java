import java.util.ArrayList;

public class CollectionList<T> {
    public ArrayList<T> items = new ArrayList<T>();
    private int size;

    public void add(T item) {
        items.add(item);
        size++;
    }
}
