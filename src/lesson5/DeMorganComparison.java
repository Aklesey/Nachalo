package lesson5;

import java.util.Scanner;

/**
 * Created by user on 01.05.2016.
 */
public class DeMorganComparison {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        // Условие до применения теоремы Де Моргана.
        if (a | b)
            System.out.println("A | B = " + (a | b));
        else
            System.out.println("A | B = " + (a | b));

        // Условие после применения теоремы Де Моргана.
        if (!(!a & !b))
            System.out.println("!(!A & !B) = " + !(!a & !b));
        else
            System.out.println("!(!A & !B) = " + !(!a & !b));


    }
}
