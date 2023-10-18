import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {
    public static void show() {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "a", "b", "c");

        System.out.println(list.indexOf("a"));
        System.out.println(list.lastIndexOf("c"));
        System.out.println(list.subList(0, 2));

        System.out.println(list.contains("a"));
        System.out.println(list.contains("x"));

        list.set(0, "a+");
        System.out.println(list);

    }
}
