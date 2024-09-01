public class TextBox extends UIControl {
    public String text = ""; // Field

    public TextBox() {
        super(true);
        System.out.println("TextBox");
    }

    @Override // Annotation
    public String toString() {
        return text;
    }

    public void setText(String text) { // Method
        this.text = text;
    }

    public void clear() {
        text = "";
    }
}
