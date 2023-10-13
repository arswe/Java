public class Main {
    public static void main(String[] args) {
        var employee = new Employee(50_000, 20);
        System.out.println(Employee.numberOfEmployees);
        int wage = employee.calculateWage(10);
        System.out.println(wage);
    }
}