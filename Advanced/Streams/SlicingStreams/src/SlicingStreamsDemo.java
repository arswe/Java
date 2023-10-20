import java.util.function.Predicate;
import java.util.List;

public class SlicingStreamsDemo {
    public static void show() {
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
