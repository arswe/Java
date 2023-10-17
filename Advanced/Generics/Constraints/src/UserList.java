public class UserList {
    private User[] items = (User[]) new Object[10];
    private int count;

    public void add(User item) {
        items[count++] = item;
    }

    public User get(int index) {
        return items[index];
    }
}
