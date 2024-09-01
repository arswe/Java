public class Main {
    public static void main(String[] args) {
        // reference type
        // i) primitive type
        // ii) non-primitive type

        // primitive types
        // i) byte -> 1 byte
        // ii) short -> 2 bytes
        // iii) int -> 4 bytes
        // iv) long -> 8 bytes
        // v) float -> 4 bytes
        // vi) double -> 8 bytes
        // vii) char -> 2 bytes
        // viii) boolean -> 1 byte


        GenericList<Integer> numbers = new GenericList<>();
        numbers.add(1); // boxing

        numbers.get(0); // unboxing

    }
}