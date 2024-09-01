import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("akaid", "e3"));
        customers.add(new Customer("sakib", "e2"));
        customers.add(new Customer("rakib", "e1"));

        // Sort by name
        customers.sort(new EmailComparator());
        System.out.println(customers);

    }
}