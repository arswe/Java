public class Main {
    public static void main(String[] args) {
        var list = new CollectionList<String>();
        list.add("Hello");
        list.add("World");

        for (var item : list.items) {
            System.out.println(item);
        }

    }
}