import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("akaid"));
        customers.add(new Customer("brian"));
        customers.add(new Customer("charlie"));

        // Sort by name
        Collections.sort(customers);
        System.out.println(customers);

        // Sort by age

    }
}