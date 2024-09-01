import java.util.*;

public class SetDemo {
    public static void show() {
//        Collection<String> collection = new ArrayList<>();
//        Collections.addAll(collection, "a", "c", "b", "c");
//        Set<String> set = new HashSet<>(collection);
//
//        System.out.println(set);

        Set<String> set1 = new HashSet<>(Arrays.asList("A", "B", "C"));
        Set<String> set2 = new HashSet<>(Arrays.asList("B", "C", "D"));

        // Union of two sets (set1 and set2)
//        set1.addAll(set2);
//        System.out.println(set1);

        // Intersection of two sets (set1 and set2)
//        set1.retainAll(set2);
//        System.out.println(set1);

//        // Difference of two sets (set1 and set2)
        set1.removeAll(set2);
        System.out.println(set1);
    }
}
