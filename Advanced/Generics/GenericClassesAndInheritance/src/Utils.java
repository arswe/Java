public class Utils {
    public static <T extends Comparable<T>> T max(T first, T second) {
        return (first.compareTo(second) < 0) ? second : first;
    }

    public static void printUsers(User user) {
        System.out.println(user);
    }

    public static void printUsers(GenericList<? super User> users) {
        users.add(new User(10));
        users.add(new Instructor(10));
    }
}
