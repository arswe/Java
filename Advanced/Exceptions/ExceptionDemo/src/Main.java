
public class Main {
    public static void main(String[] args) {
        try {
            ExceptionDemo.show();
        } catch (NullPointerException ex) {
            System.out.println("An unexpected error occurred.");
            System.out.println(ex.getMessage());
        }
        System.out.println("End of program."   );
    }
}