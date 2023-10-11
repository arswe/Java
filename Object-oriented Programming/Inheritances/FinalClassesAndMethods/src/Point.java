public class Point extends UIControl {
    private int x;
    private int y;

    public Point(int x, int y) {
        super(true);
        this.x = x;
        this.y = y;
    }

    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void draw() {
        System.out.println("Point: " + x + ", " + y);
    }

    @Override
    public void render() {
        System.out.println("Render Point");
    }
}

