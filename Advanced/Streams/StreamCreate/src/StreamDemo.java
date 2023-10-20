import java.util.Arrays;
import java.util.stream.Stream;


public class StreamDemo {
    public static void show() {
        Stream.generate(Math::random)
                .limit(3)
                .forEach(System.out::println);
    }
}
