public class Main {
    public static void main(String[] args) {
        var textBox1 = new TextBox(); // textBox1 is a reference to a TextBox object

        var textBox2 = textBox1; // textBox2 is a reference to the same TextBox object

        textBox2.setText("Hello World"); // textBox1.text is now "Hello World"
        System.out.println(textBox1.text); // "Hello World"


    }
}