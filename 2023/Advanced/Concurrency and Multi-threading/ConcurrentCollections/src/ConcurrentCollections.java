import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


public class ConcurrentCollections {
    public static void show() {
        // Concurrent Collections:

        Map<Integer, String> map = new ConcurrentHashMap<>(); // Concurrent Collections are thread-safe
        map.put(1, "a");
        map.get(1);
        map.remove(1);
        map.replace(1, "a", "b");
        map.containsKey(1);


    }
}
