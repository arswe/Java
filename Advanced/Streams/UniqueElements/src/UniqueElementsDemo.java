import java.util.List;

public class UniqueElementsDemo {
    public static void show() {
        List<Movie> movies = List.of(
                new Movie("a", 15),
                new Movie("b", 15),
                new Movie("c", 20),
                new Movie("d", 25),
                new Movie("e", 30)
        );

        movies.stream()
                .map(Movie::getLikes)
                .distinct()
                .forEach(System.out::println);

    }
}
