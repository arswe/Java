import java.time.LocalTime;
import java.util.Locale;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class Demo {
    public static void show() {

        var start = LocalTime.now();

        var service = new FlightService();
        var futures = service.getQuotes()
                .map(future -> future.thenAccept(System.out::println))
                .toList();

        CompletableFuture.allOf(
                        futures.toArray(CompletableFuture[]::new))
                .thenRun(() -> {
                    var end = LocalTime.now();
                    var duration = end.getSecond() - start.getSecond();
                    System.out.println("Retrieved all quotes in " + duration + " seconds.");
                });


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
