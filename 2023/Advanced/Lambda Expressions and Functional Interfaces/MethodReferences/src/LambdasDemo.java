public class LambdasDemo {

    public LambdasDemo(String message) {
    }

//    public void print(String message) {
//    }

    public static void show() {
//        var demo = new LambdasDemo();
//        greet(demo::print);

        greet(LambdasDemo::new);
    }

    public static void greet(Printer printer) {
        printer.print("Method References");
    }
}
