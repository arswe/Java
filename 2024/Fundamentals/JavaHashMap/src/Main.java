import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("Dhaka", "London");
        capitalCities.put("dinajpur", "Berlin");
        capitalCities.put("debiganj", "Oslo");
        capitalCities.put("Bangladesh", "Washington DC");

        for (String i : capitalCities.keySet()) {
            System.out.println("key: " + i + " value: " + capitalCities.get(i));
        }
    }
}

