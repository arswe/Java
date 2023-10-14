public class UIControl {
    private boolean isEnabled = true;

    public UIControl(boolean isEnabled) {
        this.isEnabled = isEnabled;
        System.out.println("UIControl");
    }


    public void enable() {
        System.out.println("Enabled");
    }

    public void focus() {
        System.out.println("Focused");
    }

    public void render() {
        System.out.println("Rendered");
    }
}
