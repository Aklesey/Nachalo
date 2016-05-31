package hard.sorting;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by user on 29.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter array size ");
        int size = input.nextInt();
        int myArray[] = new int[size];
        for (int i = 0; i < myArray.length; i++) {
            System.out.print("enter " + (i+1) + " element of array: ");
            myArray[i] = input.nextInt();
        }

        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
        Arrays.sort(myArray);
        System.out.println("");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
    }
}
