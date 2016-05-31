package hard.deleting;

import java.util.Scanner;

/**
 * Created by user on 29.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        int count = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string with words");
        String str = input.nextLine();
        String myArray[];
        myArray = str.split(" ");
        for (int i = 0; i < myArray.length - count; i++) {
            for (int j = i + 1; j < myArray.length - count; j++) {
                if (myArray[i].equals(myArray[j])) {
                    myArray[j] = null;
                    count++;
                    for (int k = j; k < myArray.length - 1; k++) {
                        myArray[k] = myArray[k + 1];
                    }
                }
            }
        }
        for (int i = 0; i < myArray.length - count; i++) {
            System.out.print(myArray[i] + " ");
        }
    }
}
