import java.util.function.Function;

public class FunctionDemo {
    public static void show() {
        // function interface takes one argument and returns a result
        // String is the argument type, Integer is the return type

        Function<String, Integer> map = String::length;
        var length = map.apply("Sky");
        System.out.println(length);
    }
}
