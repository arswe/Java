public class LambdasDemo {
    public static void show() {
        // lambda expression
        greet(message -> System.out.println(message));

        Printer printer = message -> System.out.println(message);
    }

    public static void greet(Printer printer) {
        printer.print("Hello World");
    }
}
