package lesson4;

import java.util.Scanner;

/**
 * Created by user on 01.05.2016.
 */

public class Interva {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number from 0 to 100: ");
        int a = input.nextInt();
        if (a <= 0 && a >= 100) System.out.println("Number you entered does not belongs to the segment [0-100]");
        if (a >= 0 && a <= 14) System.out.println("Number you entered belongs to the segment [0-14]");
        if (a >= 15 && a <= 35) System.out.println("Number you entered belongs to the segment [15-35]");
        if (a >= 35 && a <= 50) System.out.println("Number you entered belongs to the segment [36-50]");
        if (a >= 51 && a <= 100) System.out.println("Number you entered belongs to the segment [51-100]");

    }
}
