public class Main {
    public static void main(String[] args) {
        // Order of Operations
        // 1. Parentheses () (2 * (3 + 4))
        // 2. Exponents ** or ^ (right to left) (2^3^2 = 2^9) (2^9 = 512) (2^9 = 512)
        // 3. Multiplication * or / (left to right) (2 * 3 = 6) (6 / 2 = 3)
        // 4. Addition + or - (left to right) (3 + 4 = 7) (7 - 2 = 5)
        // 5. Assignment = (right to left) (x = 5)
        // 6. Left to right
        // 7. Right to left

        int x = 2 + 3 * 4 - 6; // 8
        System.out.println(x);
    }
}