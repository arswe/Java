public class GenericList<T extends Comparable> {
    private T[] items = (T[]) new Object[10];
    private int count;

    public void add(T item) {
        items[count++] = item;
    }

    public void get(int index) {
        items[index] = items[index];
    }
}
