package superhard;

import java.util.Scanner;

/**
 * Created by user on 31.05.2016.
 */
public class Febonachi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("введите сколько чисел фебоначче вывести: ");
        int n = input.nextInt();
        long[] febon = new long[n];
        switch (n) {
            case 2: {
                febon[1] = 1;
            }
            case 1: {
                febon[0] = 1;
                break;
            }
            default: {
                febon[1] = 1;
                febon[0] = 1;
                break;
            }
        }
        for (int i = 2; i < febon.length; i++) {
            febon[i] = febon[i - 1] + febon[i - 2];
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(febon[i] + " ");
        }
    }
}
