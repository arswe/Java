public class Main {
    public static void main(String[] args) {
        // Debugging code
        System.out.println("Start of program");
        // End of debugging code
        printNumbers(4);
        System.out.println("End of program");
    }

    public static void printNumbers(int limit) {
        for (int i = 0; i <= limit; i+=2) {
            System.out.println(i);
        }
    }
}