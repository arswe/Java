public class Main {
    public static void main(String[] args) {
        var employee = new Employee(50_000, 20);
        int wage = employee.calculateWage();
        System.out.println(wage);

        // This is the same as calling the calculateWage() method with 0 as the argument.
        int wage2 = employee.calculateWage();
        System.out.println(wage2);

    }
}