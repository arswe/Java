import java.util.function.Predicate;

public class CombiningPredicatesDemo {
    public static void show() {
        Predicate<String> hasLeftBrace = str -> str.startsWith("{");
        Predicate<String> hasRightBrace = str -> str.endsWith("}");

        // Combining Predicates. The following two lines are equivalent.
        Predicate<String> hasLeftAndRightBraces = hasLeftBrace.and(hasRightBrace);
        var result = hasLeftAndRightBraces.test("{key:value}");

        System.out.println(result);
    }
}
