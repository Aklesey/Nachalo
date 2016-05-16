package lesson7;

import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import java.util.Scanner;

/**
 * Created by user on 06.05.2016.
 */
public class Conversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите сумму валюты");
        float money = input.nextFloat();
        System.out.println("Введите курс");
        float cours = input.nextFloat();
        float result =money*cours;
        System.out.println(result);
    }
}
