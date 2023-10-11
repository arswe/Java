public class TextBox extends UIControl {
    private String text = "";

    @Override
    public void render() {
        System.out.println("Render TextBox");
    }

    public TextBox() {
        System.out.println("TextBox");
    }

    public void setText(String text) {
        this.text = text;
    }

    public void clear() {
        text = "";
    }
}
