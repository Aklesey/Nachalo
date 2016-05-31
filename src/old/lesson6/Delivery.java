package old.lesson6;

import java.util.Scanner;

/**
 * Created by user on 05.05.2016.
 */
public class Delivery {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите количество компаний: ");
        int x = input.nextInt();
        int a = 1;
        do {
            a *= x--;
        }
        while (x > 0);
        System.out.println("Cуществует " + a + " возможных маршрутов доставки товара");


    }
}
