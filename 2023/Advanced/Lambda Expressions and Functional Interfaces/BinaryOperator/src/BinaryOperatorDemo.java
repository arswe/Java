import java.util.function.BinaryOperator;
import java.util.function.Function;

public class BinaryOperatorDemo {
    public static void show() {
        // a, b -> a + b -> square

        BinaryOperator<Integer> add = Integer::sum;
        Function<Integer, Integer> square = a -> a * a;

        var result = add.andThen(square).apply(1, 2);
//        var result = add.apply(1, 2);
        System.out.println(result);
    }
}
