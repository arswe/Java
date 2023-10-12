public class TextBox {
    public String text; // field

    public void setText(String text) {
        this.text = text; // this is a reference to the current object
    }

    // clear() is a method that doesn't return anything
    public void clear() {
        text = ""; // this is a reference to the current object
    }
}

