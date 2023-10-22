import java.util.concurrent.CompletableFuture;

public class RunningCompletions {
    public static void show() {

        var tufure = CompletableFuture.supplyAsync(() -> 1);
//        tufure.thenRun(() -> System.out.println("Done")); // thenRun() is a void method
//        tufure.thenRunAsync(() -> { // thenRunAsync() is a void method
//
//            System.out.println(Thread.currentThread().getName());
//            System.out.println("Done");
//        });

//        tufure.thenAccept(result -> { // thenAccept() is a void method
//            System.out.println(Thread.currentThread().getName());
//            System.out.println(result);
//        });


        tufure.thenAcceptAsync(result -> {
            System.out.println(Thread.currentThread().getName());
            System.out.println(result);
        });

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
