import java.util.stream.Collectors;

public class Demo {
    public static void show() {
        var service = new FlightService();
        service.getQuotes()
                .map(future -> future.thenAccept(System.out::println))
                .collect(Collectors.toList());

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
