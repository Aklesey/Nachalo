package old.lesson5;

import java.util.Scanner;

/**
 * Created by user on 01.05.2016.
 */
public class Parity {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите целое число:");
        float number = input.nextFloat();
        if (number % 2 == 0) {
            System.out.println("Введеное вами число " + number + " четное");
        } else {
            System.out.println("Введеное вами число " + number + " не четное");
        }

    }
}
