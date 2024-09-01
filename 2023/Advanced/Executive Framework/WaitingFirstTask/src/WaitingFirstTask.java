import java.util.concurrent.CompletableFuture;

public class WaitingFirstTask {
    public static void show() {
        var first = CompletableFuture.supplyAsync(() -> {
            LongTask.simulate();
            return 20;
        });

        var second = CompletableFuture.supplyAsync(() -> 20);

        var fastest = CompletableFuture
                .anyOf(first, second)
                .thenAccept(System.out::println);


    }
}
