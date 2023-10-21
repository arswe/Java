import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        // Primitive Type Streams
        IntStream.range(1, 10).forEach(System.out::println);
    }
}