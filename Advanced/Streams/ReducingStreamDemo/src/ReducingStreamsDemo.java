import java.util.List;

public class ReducingStreamsDemo {
    public static void show() {
        var movies = List.of(
                new Movie("a", 10),
                new Movie("b", 15),
                new Movie("c", 20)
        );
        // The following code is equivalent to the code in the previous example
        movies.stream()
                .map(Movie::getLikes) // map() takes a Function<T, R> as an argument
                .reduce(Integer::sum) // reduce() takes a BinaryOperator<T> as an argument
                .ifPresent(System.out::println); // prints 45
    }
}
