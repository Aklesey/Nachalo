package old.lesson5;

import java.util.Scanner;

/**
 * Created by user on 01.05.2016.
 */
public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите целое число :");
        int number = input.nextInt(), power, i;
        String myString = Integer.toBinaryString(number);
//        char [] myChar = myString.toCharArray ();
        int count = 0;
        for (char element : myString.toCharArray()) {
            if (element == '1') count++;

        }
        if (count == 1) {
            power = number;
            for (i = 1; power != 2; i++) {
                power = power / 2;
            }
            System.out.println("Введеное вами число " + number + " является степенью дваойки");
            System.out.println("Другими словами " + number + "=2^" + i);
        } else System.out.println("Введеное вами число " + number + " НЕ является степенью дваойки");
    }
}
