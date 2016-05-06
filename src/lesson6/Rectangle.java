package lesson6;

import java.util.Scanner;

/**
 * Created by user on 05.05.2016.
 */
public class Rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите ширину прямоугольника: ");
        int w = input.nextInt();
        System.out.println("Введите высоту прямоугольника: ");
        int h = input.nextInt();
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
