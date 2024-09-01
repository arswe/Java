import java.util.concurrent.CompletableFuture;

public class Composings {

    public static CompletableFuture<String> getUserEmailAsync() {
        return CompletableFuture.supplyAsync(() -> "email");
    }

    public static CompletableFuture<String> getPlaylistAsync(String email) {
        return CompletableFuture.supplyAsync(() -> "playlist");
    }

    public static void show() {
        getUserEmailAsync()
                .thenCompose(Composings::getPlaylistAsync)
                .thenAccept(System.out::println);
    }
}
