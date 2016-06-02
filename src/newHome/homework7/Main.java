package newHome.homework7;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by user on 28.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string with words");
        String str = input.nextLine();
        String array[];
        array = str.split(" ");
        for (int i = 1; i <= array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                int count = 0;
                for (int k = 0; k < array.length; k++) {
                    if (array[k].length() == i) {
                        System.out.print(array[k] + " ");
                        count++;
                    }
                }
                if (count > 0) {
                    System.out.println();
                    break;
                }

            }

        }
        Arrays.sort(array);
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");

        }

//        int count = 0;
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array.length; j++) {
//                if(array[i].length()<count) continue;
//                if (array[i].length()==array[j].length())
//                    System.out.print(array[j] + " ");
//
//            }
//            if(array[i].length()!=i) continue;
//            System.out.println();
//
//        }
    }
}