package lesson5;

import java.util.Scanner;

/**
 * Created by user on 01.05.2016.
 */
public class Parity_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите целое число");
        float n = input.nextFloat();
        boolean b = (n % 2 == 0);
        System.out.println("Сейчас мы проверим Ваше число на четность");
        System.out.println(b);
    }
}
