public class Customer implements Comparable<Customer> {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Customer other) {
        // this  < o  => -1
        // this == o  => 0
        // this  > o  => 1
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return name;
    }
}

