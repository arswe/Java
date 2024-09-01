import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class HandlingTimeouts {
    public static void show() {
        var future = CompletableFuture.supplyAsync(() -> {
            LongTask.simulate();
            return 1;
        });

        try {
            var result = future
                    .completeOnTimeout(2, 1, TimeUnit.SECONDS)
                    .get(); // get() will throw a TimeoutException if the task takes longer than 2 seconds
            System.out.println(result);
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }

    }
}
