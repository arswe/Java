
import java.util.List;

public class PeekingElementsDemo {
    public static void show() {
        var movies = List.of(
                new Movie("a", 10),
                new Movie("b", 15),
                new Movie("c", 20)
        );

        movies.stream()
                .filter(m -> m.getLikes() > 10) // filter out movies with less than 10 likes

                .peek(m -> System.out.println("filtered: " + m.getTitle())) // peek at the filtered movies

                .map(Movie::getTitle) // map the movies to their titles

                .peek(t -> System.out.println("mapped: " + t)) // peek at the mapped titles

                .forEach(System.out::println); // print the titles


    }

}