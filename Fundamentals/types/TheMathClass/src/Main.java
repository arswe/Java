public class Main {
    public static void main(String[] args) {
        // The Math Class
        // Math.abs()
        // Math.ceil()
        // Math.floor()
        // Math.max()
        // Math.min()
        // Math.pow()
        // Math.sqrt()
        // Math.round()
        // Math.random()

        int result = Math.round(1.1F);
        int result2 = (int) Math.ceil(1.1F);
        int result3 = (int) Math.floor(1.1F);
        int result4 = Math.max(1, 2);
        int result5 = Math.min(1, 2);
        double result6 = Math.pow(1, 2);
        double result7 = Math.sqrt(1);
        double result8 = Math.random();
        double result9 = Math.random() * 100;
        int result10 = (int) (Math.random() * 100);

        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);
        System.out.println(result7);
        System.out.println(result8);
        System.out.println(result9);
        System.out.println(result10);


    }
}