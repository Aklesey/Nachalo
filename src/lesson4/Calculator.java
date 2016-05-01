package lesson4;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by user on 01.05.2016.
 */
public class Calculator {
    public static void main(String[] args) {
        Random rand = new Random();
        float operand1 = rand.nextInt(10000), operand2 = rand.nextInt(10000);

        Scanner input = new Scanner(System.in);
        System.out.println("Дано: " + operand1 + "\n" + "\t  " + +operand2);
        System.out.println("Введите знак арифметической операции: ");
        String sing = input.next();

        float a;
        switch (sing) {
            case "-": {
                a = operand1 - operand2;
                System.out.println(a);
                break;
            }
            case "+": {
                a = operand1 + operand2;
                System.out.println(a);
                break;
            }
            case "*": {
                a = operand1 * operand2;
                System.out.println(a);
                break;
            }
            case "/": {
                if (operand1 == 0) {
                    System.out.println("Деление на 0 невозможно, перезапустите программу");
                } else {
                    a = operand1 / operand2;
                    System.out.println(a);
                }
                break;
            }
            default: {
                System.out.println("Вы ввели несуществющий знак арифметической операции.");
            }
        }

    }
}
