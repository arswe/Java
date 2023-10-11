import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Reading Input from the user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String name = input.nextLine().trim();

        // Printing the name
        System.out.println("Hello " + name);

    }
}