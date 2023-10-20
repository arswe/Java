import java.util.List;
import java.util.function.Predicate;

public class StreamDemo {
    public static void show() {
        // List.of() is a new feature in Java 9

        var movies = List.of(
                new Movie("a", 10),
                new Movie("b", 15),
                new Movie("c", 20)
        );

        Predicate<Movie> isPopular = movie -> movie.getLikes() > 10;

        movies.stream()
                .filter(isPopular)
                .forEach(movie -> System.out.println(movie.getTitle()));


    }
}
