import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionDemo {
    public static void show() throws FileNotFoundException {
        var reader = new FileReader("file.txt"); // name of exception is FileNotFoundException
    }
}
