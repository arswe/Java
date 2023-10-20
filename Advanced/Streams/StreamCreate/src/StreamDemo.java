import java.util.Arrays;


public class StreamDemo {
    public static void show() {
        int[] numbers = {1, 2, 3};
        Arrays.stream(numbers)
            .forEach(System.out::println);
    }
}
