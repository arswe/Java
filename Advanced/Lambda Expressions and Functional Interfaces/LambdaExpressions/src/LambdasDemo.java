public class LambdasDemo {
    public static void show() {
        // lambda expression
        greet(System.out::println);

        Printer printer = System.out::println;
    }

    public static void greet(Printer printer) {
        printer.print("Hello World");
    }
}
