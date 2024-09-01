import java.util.Comparator;
import java.util.List;

public class ReducersDemo {
    public static void show() {
        var movies = List.of(
                new Movie("a", 10),
                new Movie("b", 15),
                new Movie("c", 20)
        );

        var result = movies.stream()
//                .anyMatch(movie -> movie.getLikes() > 20); // true: at least one movie has more than 20 likes
//                .allMatch(movie -> movie.getLikes() > 20); // false: not all movies have more than 20 likes
//                .noneMatch(movie -> movie.getLikes() > 20); // false: not all movies have more than 20 likes
//                .findFirst(); // Optional<Movie> // a
//                .findAny(); //
                .max(Comparator.comparing(Movie::getLikes))
                .get(); // Optional<Movie> // e
        System.out.println(result.getTitle());


    }
}
