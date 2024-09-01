import java.util.Comparator;
import java.util.List;

public class SortingStreamsDemo {
    public static void show() {
        List<Movie> movies = List.of(
                new Movie("b", 10),
                new Movie("c", 15),
                new Movie("a", 20),
                new Movie("d", 25),
                new Movie("f", 30),
                new Movie("e", 35)
        );

        movies.stream()
//                .sorted((a, b) -> a.getTitle().compareTo(b.getTitle()))
                .sorted(Comparator.comparing(Movie::getTitle).reversed())
                .sorted(Comparator.comparing(Movie::getTitle))
                .forEach(m -> System.out.println(m.getTitle()));

    }
}
