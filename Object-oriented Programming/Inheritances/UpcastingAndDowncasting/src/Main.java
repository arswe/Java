// Upcasting and Downcasting in Java

public class Main {
    public static void main(String[] args) {
        // Upcasting
        var control = new TextBox("Hello World");
        show(control);


        // Downcasting
        var control2 = new UIControl(true);
        var textBox = (TextBox) control2;
        textBox.setText("Hello World");
        System.out.println(textBox);

    }

    public static void show(UIControl control) {
        if (control instanceof TextBox) {
            var textBox = (TextBox) control;
            textBox.setText("Hello World");
        }
        System.out.println(control);
    }
}