import java.io.PipedReader;

public class LambdasDemo {
    public static String preFix = "-";

    public static void show() {
        greet(message -> System.out.println(preFix + message));
    }

    public static void greet(Printer printer) {
        printer.print("Hello Lambda Expressions");
    }
}
