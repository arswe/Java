import java.io.FileReader;
import java.io.IOException;

public class ExceptionsDemo {
    public static void show() {
        FileReader reader = null;
        try {
            reader = new FileReader("file.txt"); // This is a must, otherwise the file will be locked
            var value = reader.read(); // This is a must, otherwise the file will be locked
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (reader != null) {
                try {
                    reader.close(); // This is a must, otherwise the file will be locked
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
