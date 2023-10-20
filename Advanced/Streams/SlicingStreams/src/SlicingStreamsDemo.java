import java.util.function.Predicate;
import java.util.List;

public class SlicingStreamsDemo {
    public static void show() {
        var movies = List.of(
                new Movie("a", 10),
                new Movie("b", 15),
                new Movie("c", 30)
        );


        // 100 movies
        //  10 movies per page
        //  3rd pages
        //  skip(20) = skip((page - 1) * pageSize))
        //  limit(10) = limit(pageSize)

        movies.stream()
                // .skip(2)
//                .skip(20)
//                .limit(10)
                .takeWhile(movie -> movie.getLikes() < 30)
                .forEach(movie -> System.out.println(movie.getTitle()));
    }
}
