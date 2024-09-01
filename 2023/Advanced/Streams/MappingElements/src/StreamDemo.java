import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {
    public static void show() {
//        var movies = List.of(
//                new Movie("a", 10),
//                new Movie("b", 15),
//                new Movie("c", 20)
//        );

//        movies.stream()
//                .map(Movie::getTitle)
//                .forEach(System.out::println);


//        movies.stream()
//                .mapToInt(Movie::getLikes)
//                .forEach(System.out::println);


//        var stream = Stream.of(List.of(1, 2, 3), List.of(4, 5, 6));
//        stream.forEach(System.out::println);

        var stream = Stream.of(List.of(1, 2, 3), List.of(4, 5, 6));
        stream
                .flatMap(Collection::stream)
                .forEach(System.out::println);
    }
}
