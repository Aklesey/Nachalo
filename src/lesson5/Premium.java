package lesson5;

import java.util.Scanner;

/**
 * Created by user on 01.05.2016.
 */
public class Premium {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите свою ставку");
        double money = input.nextDouble(), premium;
        System.out.println("Введите количество отработаных лет");
        int years = input.nextInt();
        if (years >= 0 && years < 5) {
            premium = (money * 1.1);
            premium = premium - money;
            System.out.println("Премиальная надбавка состовляет 10 % от вашей текущей заработной платы: " + premium);
        } else {
            if (years >= 5 && years < 10) {
                premium = (money * 1.15);
                premium = premium - money;
                System.out.println("Премиальная надбавка состовляет 15 % от вашей текущей заработной платы: " + premium);
            } else {
                if (years >= 10 && years < 15) {
                    premium = (money * 1.25);
                    premium = premium - money;
                    System.out.println("Премиальная надбавка состовляет 25 % от вашей текущей заработной платы: " + premium);
                } else {
                    if (years >= 15 && years < 20) {
                        premium = (money * 1.35);
                        premium = premium - money;
                        System.out.println("Премиальная надбавка состовляет 35 % от вашей текущей заработной платы: " + premium);
                    } else {
                        if (years >= 20 && years < 25) {
                            premium = (money * 1.45);
                            premium = premium - money;
                            System.out.println("Премиальная надбавка состовляет 45 % от вашей текущей заработной платы: " + premium);
                        } else {
                            if (years >= 25) {
                                premium = (money * 1.5);
                                premium = premium - money;
                                System.out.println("Премиальная надбавка состовляет 50 % от вашей текущей заработной платы: " + premium);
                            } else {
                                System.out.println("Вы значит не работаете в нашей компании =(");
                            }

                        }
                    }
                }
            }
        }
    }
}