import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ExceptionsDemo {
    public static void main() {
        // this is a try-with-resources statement
        try (
                var reader = new FileReader("file.txt");
                var writer = new FileWriter("output.txt")

        ) {
            var value = reader.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
