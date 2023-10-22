import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Transformings {

    public static int toFahrenheit(int celsius) {
        return (int) ((celsius * 1.8) + 32);
    }


    public static void show() {
        var future = CompletableFuture.supplyAsync(() -> 20);

//        future
//                .thenApply(celsius -> (celsius * 1.8) + 32)
//                .thenAccept(System.out::println);
        future
                .thenApply(Transformings::toFahrenheit)
                .thenAccept(System.out::println);

//        try {
//            var result = future
//                    .thenApply(Transformings::toFahrenheit)
//                    .get();
//            System.out.println(result);
//        } catch (InterruptedException | ExecutionException e) {
//            e.printStackTrace();
//        }
    }
}
