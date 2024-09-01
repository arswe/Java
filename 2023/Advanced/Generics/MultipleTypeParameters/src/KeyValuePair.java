public class KeyValuePair<K, V> {
    private final K key;
    private final V value;

    // multiple type parameters
    public KeyValuePair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public void print() {
        System.out.println(key + "=" + value);
    }
}
