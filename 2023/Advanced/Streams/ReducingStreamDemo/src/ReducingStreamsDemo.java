import java.util.List;
import java.util.Optional;

public class ReducingStreamsDemo {
    public static void show() {
        var movies = List.of(
                new Movie("a", 10),
                new Movie("b", 15),
                new Movie("c", 20)
        );
//        movies.stream()
//                .map(Movie::getLikes) // map() takes a Function<T, R> as an argument
//                .reduce(Integer::sum) // reduce() takes a BinaryOperator<T> as an argument
//                .ifPresent(System.out::println); // prints 45


//        Optional<Integer> sum = movies.stream()
//                .map(Movie::getLikes)
//                .reduce(Integer::sum);
//
//        System.out.println(sum.orElse(0));
        Integer sum = movies.stream()
                .map(Movie::getLikes)
                .reduce(0, Integer::sum);
        System.out.println(sum);
    }
}
