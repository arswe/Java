public class Main {
    public static void main(String[] args) {
        var list = new List();
        list.add(Integer.valueOf(1));
        list.add("1");
        list.add(new User("John"));

        int number = (int) list.get(1);
    }
}