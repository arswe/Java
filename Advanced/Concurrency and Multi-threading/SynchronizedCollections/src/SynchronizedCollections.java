import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;


public class SynchronizedCollections {
    public static void show() {
        Collection<Integer> collection =
                Collections.synchronizedCollection(new ArrayList<>());

        var thread1 = new Thread(() -> {
            collection.addAll(Arrays.asList(1, 2, 3));
        });

        var thread2 = new Thread(() -> {
            collection.addAll(Arrays.asList(4, 5, 6));
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(collection);

    }
}
