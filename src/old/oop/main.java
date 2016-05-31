package old.oop;

import java.util.Scanner;

/**
 * Created by user on 16.05.2016.
 */
public class main {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Введите сторону а:");
        double a = input.nextInt();
        System.out.println("Введите сторону b:");
        double b= input.nextInt();
        Rectangle per = new Rectangle(a, b);
        System.out.println(""+ per.areaCalculator()+" "+ per.perimeterCalculator());

    }
}