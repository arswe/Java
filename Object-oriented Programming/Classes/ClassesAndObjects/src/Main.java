public class Main {
    public static void main(String[] args) {

        TextBox textBox1 = new TextBox(); // textBox1 is a reference to a TextBox object
        textBox1.setText("Box 1");

        System.out.println(textBox1.text.toUpperCase());

        TextBox textBox2 = textBox1; // textBox2 is a reference to the same TextBox object
        textBox2.setText("Box 2");

        System.out.println(textBox1.text);

        textBox1.clear(); // textBox1 is a reference to a TextBox object
        System.out.println(textBox1.text);
    }
}