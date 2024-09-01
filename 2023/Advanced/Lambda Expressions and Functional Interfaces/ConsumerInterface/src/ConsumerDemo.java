import java.util.Iterator;
import java.util.List;

public class ConsumerDemo {
    public static void show() {
        List<Integer> list = List.of(1, 2, 3, 4);

        // imperative programming style (for, if, else, etc.)
        for (var item : list)
            System.out.println(item);

        list.forEach(System.out::println);
    }
}
