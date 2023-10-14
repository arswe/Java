public class TextBox extends UIControl {
    public String text = "";

    public TextBox(boolean isEnabled, String text) {
        super(isEnabled);
        this.text = text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void clear() {
        text = "";
    }
}
