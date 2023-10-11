import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        int[] numbers = {11, 145, 61, 7, 0};

        int len = numbers.length;

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(numbers));


    }
}