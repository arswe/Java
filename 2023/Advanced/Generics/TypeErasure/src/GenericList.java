public class GenericList<T extends  Comparable & Cloneable> {
    private T[] items;
    private int count;

    public GenericList() {
        items = (T[]) new Object[10];
    }

    public void add(T item) {
        items[count++] = item;
    }

    public T get(int index) {
        return items[index];
    }
}
