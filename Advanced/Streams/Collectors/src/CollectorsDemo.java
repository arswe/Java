import java.util.List;
import java.util.stream.Collectors;

public class CollectorsDemo {
    public static void show() {
        var movies = List.of(
                new Movie("a", 10),
                new Movie("b", 15),
                new Movie("c", 20)
        );


        var result = movies.stream()
                .filter(m -> m.getLikes() > 10)
//                .collect(Collectors.toMap(Movie::getTitle, m -> m))
//                .collect(Collectors.toMap(Movie::getTitle, Function.identity()));
//                .collect((Collectors.summarizingInt(Movie::getLikes)));
                .map(Movie::getTitle)
                .collect(Collectors.joining(", "));
        System.out.println(result);

    }
}
