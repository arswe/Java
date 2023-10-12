import java.util.Scanner;

public class Console {
    private static Scanner scanner = new Scanner(System.in); // create a new scanner

    public static double readNumber(String prompt) {
        return scanner.nextDouble(); // read a number from the console
    }

    public static double readNumber(String prompt, double min, double max) {
        double value; // create a new value
        while (true) { // loop until a valid value is entered
            System.out.print(prompt); // print the prompt
            value = scanner.nextDouble(); // read a number from the console
            if (value >= min && value <= max) // if the value is valid
                break; // break out of the loop
            System.out.println("Enter a value between " + min + " and " + max);
        }
        return value;
    }
}
