public class Main {
    public static void main(String[] args) {
        UIControl[] controls = {new UIControl(), new CheckBox()};
        for (var control : controls)
            control.render(); // Polymorphism
    }
}