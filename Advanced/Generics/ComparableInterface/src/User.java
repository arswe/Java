public class User implements Comparable<User> {
    private int points;

    // Constructor
    public User(int points) {
        this.points = points;
    }

    // Getter
    @Override // Override the toString method
    public int compareTo(User other) {
        return points - other.points;
    }
}
