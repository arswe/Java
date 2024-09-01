import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionDemo {
    public static void show() {
        try {
            var reader = new FileReader("file.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
