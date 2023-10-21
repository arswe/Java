import java.util.List;

public class SortingStreamsDemo {
    public static void show() {
        List<Movie> movies = List.of(
                new Movie("b", 10),
                new Movie("c", 15),
                new Movie("a", 20)
        );

        movies.stream()
                .sorted((a, b) -> a.getTitle().compareTo(b.getTitle()))
                .forEach(m -> System.out.println(m.getTitle()));

    }
}
