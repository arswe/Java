import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

public class AsynchronousDemo {
    public static void show() {
        var executor = Executors.newFixedThreadPool(2);

        try {
            var future = executor.submit(() -> {
                LongTask.simulate(); // simulate a long task (3 seconds)
                return 1;
            });

            System.out.println("Do more work...");
            try {
                var result = future.get(); // blocking call
                System.out.println(result);
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        } finally {
            executor.shutdown();
        }
    }
}
