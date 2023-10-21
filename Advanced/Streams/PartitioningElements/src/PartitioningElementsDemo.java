import java.util.List;
import java.util.stream.Collectors;

public class PartitioningElementsDemo {
    public static void show() {
        var movies = List.of(
                new Movie("a", Genre.THRILLER, 10),
                new Movie("b", Genre.ACTION, 20),
                new Movie("c", Genre.ACTION, 30)
        );

        var result = movies.stream()
                .collect(Collectors.partitioningBy(
                        m -> m.getLikes() > 20,
                        Collectors.mapping(Movie::getTitle,
                                Collectors.joining(","))));

        System.out.println(result);
    }
}
