import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void show() {
        List<String> list = List.of("a", "b", "c");

        Consumer<String> print = System.out::println;
        Consumer<String> printUppercase = item -> System.out.println(item.toUpperCase());

        list.forEach(print.andThen(printUppercase).andThen(print));
    }

}
