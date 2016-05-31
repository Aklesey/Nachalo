package hard.longword;

import java.util.Scanner;

/**
 * Created by user on 29.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        int max = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string with words");
        String str = input.nextLine();
        String myArray[];
        myArray = str.split(" ");
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i].length() > myArray[max].length()) {
                max = i;
            }
        }
        for (int i = 0; i < myArray.length; i++) {
            if(myArray[i].length()==myArray[max].length())


            System.out.println(myArray[i]);
        }
    }
}
