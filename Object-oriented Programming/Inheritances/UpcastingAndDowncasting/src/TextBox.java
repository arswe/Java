public class TextBox extends UIControl {
        public String text = "";

        public TextBox(String text) {
            super(true);
            this.text = text;
            System.out.println("TextBox");
        }

        @Override
        public String toString() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public void clear() {
            text = "";
        }
}
