import java.util.function.Predicate;

public class PredicateDemo {

    public static void show() {

        Predicate<String> isLessThan5 = str -> str.length() > 5;
        var result = isLessThan5.test("Hello");
        System.out.println(result);
    }
}
