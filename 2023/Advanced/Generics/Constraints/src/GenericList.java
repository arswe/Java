
// constraint: T extends number
// constraint: T extends Comparable
// constraint: T extends Number & Comparable
// constraint: T extends Cloneable & Serializable



public class GenericList<T extends Comparable & Cloneable> {
    private T[] items = (T[]) new Object[10];
    private int count;

    public void add(T item) {
        items[count++] = item;
    }

    public T get(int index) {
        return items[index];
    }
}
