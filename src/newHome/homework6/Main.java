package newHome.homework6;

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
        System.out.println(str);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}

