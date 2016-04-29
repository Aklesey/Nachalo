package lesson3;

/**
 * Created by user on 29.04.2016.
 */
public class ArithmeticAverage {
    public static void main(String[] args) {
        int[] numbers = {5, 8, 12};

        double average = 0;
        if (numbers.length > 0)
        {
            double sum = 0;
            for (int j = 0; j < numbers.length; j++) {
                sum += numbers[j];
            }
            average = sum / numbers.length;
        }
        System.out.println(average);
    }
}
