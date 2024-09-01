import java.util.function.Function;

public class ComposingFunctionsDemo {
    public static void show() {
        // "Key: value"
        // First: "key: value"
        // Second: "{key: value}"
        // Third: "{key: value}"

        Function<String, String> replaceColon = str -> str.replace(":", "=");
        Function<String, String> addBraces = str -> "{" + str + "}";
        Function<String, String> quote = str -> "\"" + str + "\"";

        // Declarative programming style (functional programming) is more readable and maintainable
//        var result = replaceColon
//                .andThen(addBraces)
//                .andThen(quote)
//                .apply("key:value");

        // Compose method is the same as andThen method, but the order of execution is reversed

         var result = quote
                .compose(addBraces)
                .compose(replaceColon)
                .apply("key:value");


        System.out.println(result);
    }
}
