public final class CheckBox extends UIControl {
    public CheckBox(boolean isEnabled) {
        super(isEnabled);
    }

    public CheckBox() {
        super(true);
    }

    @Override
    public void render() {
        System.out.println("Render CheckBox");
    }
}
