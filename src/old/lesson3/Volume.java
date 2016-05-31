package old.lesson3;

import java.util.Scanner;

/**
 * Created by user on 29.04.2016.
 */
public class Volume {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите радиус: ");
        float r = input.nextFloat();
        System.out.println("Введите высоту: ");
        float h = input.nextFloat();
        double  v, s;
        final double pi= Math.PI;
        v = pi * Math.pow(r, 2) * h;
        s= 2*pi*r*h + 2*pi*Math.pow(r, 2);

        System.out.println("Объем цЫлиндра равен: " + v);
        System.out.println("Площадь: " + s);
    }

}
