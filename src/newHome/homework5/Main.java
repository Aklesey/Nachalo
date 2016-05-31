package newHome.homework5;

import java.util.Scanner;

/**
 * Created by user on 28.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        for (; ; ) {

            Scanner input = new Scanner(System.in);
            double a, b, c;
            System.out.println("Введите а: ");
            a = input.nextDouble();
            System.out.println("Введите b: ");
            b = input.nextDouble();
            System.out.println("Введите c: ");
            c = input.nextDouble();


            if (a == 0) {

                if (b != 0) {
                    System.out.println("a = 0; уравнение вырождается в линейное: ");
                    System.out.println("x = " + (-1 * (c / b)));
                    break;


                } else if (c == 0) {
                    System.out.println("Все коэффициенты равны нулю; x - любое число.");
                    break;

                } else {
                    System.out.println("Нет решений.");
                    break;

                }
            } else {

                double D = (b * b) - (4 * a * c);
                if (D < 0) {
                    System.out.println("уравнение не имеет решений");
                    break;
                }
                if (D == 0) {
                    System.out.println("уравнение имеет 1 решение:");
                    double x = (b * (-1)) / (2 * a);
                    System.out.println(x);
                    break;

                }
                if (D > 0) {
                    System.out.println("уравнение имеет 2 решения");
                    System.out.println("решение № 1: ");
                    double x = ((b * (-1)) + Math.sqrt(D)) / (2 * a);
                    System.out.println(x);
                    System.out.println("решение № 2: ");
                    double x1 = ((b * (-1)) - Math.sqrt(D)) / (2 * a);
                    System.out.println(x1);
                    break;

                }

            }
        }

    }
}
