package old.lesson7;

import java.util.Scanner;

/**
 * Created by user on 06.05.2016.
 */
public class Arithmetics {
    public static float add(float a, float b) {
        float result = a + b;
        return result;
    }

    public static float sub(float a, float b) {
        float result = a - b;
        return result;
    }

    public static float mul(float a, float b) {
        float result = a * b;
        return result;
    }

    public static float div(float a, float b) {
        float result = a / b;
        return result;
    }

    public static void main(String[] args) {
        float result;
        Scanner input = new Scanner(System.in);
        System.out.println("Введите первое число");
        float a = input.nextFloat();
        System.out.println("Введите второе число");
        float b = input.nextFloat();
        System.out.print("Ввдите арифметическую операцию ");
        for (; ; ) {
            System.out.print("(+, -, *, /)");
            String operand = input.next();
            switch (operand) {
                case "+":
                    result = add(a, b);
                    System.out.println(result);
                    break;
                case "-":
                    result = sub(a, b);
                    System.out.println(result);
                    break;
                case "*":
                    result = mul(a, b);
                    System.out.println(result);
                    break;
                case "/":
                    if (b == 0) {
                        System.out.println("Деление на 0 невозможно");
                        break;
                    } else {
                        result = div(a, b);
                        System.out.println(result);
                        break;
                    }

                default:
                    System.out.print("Ваод ошибочен, выберите из одну из предложеных операций");
                    continue;


            }
            break;

        }

    }
}