package hard.sorting;

import java.util.Scanner;

/**
 * Created by user on 29.05.2016.
 */
public class Sorting1 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter array size ");
        int size = input.nextInt();
        int myArray[] = new int[size];
        for (int i = 0; i < myArray.length; i++) {
            System.out.print("enter " + (i + 1) + " element of array: ");
            myArray[i] = input.nextInt();
        }

        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
        System.out.println("");
        for (int i = 1; i < myArray.length; i++) {
            int currElem = myArray[i];
            int prevKey = i - 1;
            while (prevKey >= 0 && myArray[prevKey] > currElem) {
                myArray[prevKey + 1] = myArray[prevKey];
                prevKey--;
            }
            myArray[prevKey + 1] = currElem;
        }
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
    }
}