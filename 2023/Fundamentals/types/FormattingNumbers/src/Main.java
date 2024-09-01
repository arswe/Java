import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        // Formatting Numbers
        System.out.println("Formatting Numbers");
        System.out.println("======================");
        System.out.println("Number\tSquare\tCube");
        System.out.println("0\t0\t0");
        System.out.println("1\t1\t1");
        System.out.println("2\t4\t8");

        System.out.println(" ");

        String result = NumberFormat.getCurrencyInstance().format(1234567.891);
        System.out.println(result);


    }
}