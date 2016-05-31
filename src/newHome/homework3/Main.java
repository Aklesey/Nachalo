package newHome.homework3;

/**
 * Created by user on 28.05.2016.
 */

public class Main {
    public static void main(String[] args) {
        int[] myArray = new int[10];

        for (int i = 0; i < (myArray.length); i++) {
            myArray[i] = (i + 14 + 654 - i) * i;
            if (myArray[i] == 0) myArray[i] = 1445151;
        }
        for (int i = 0; i < (myArray.length / 2); i++) {
            System.out.println(myArray[(myArray.length / 2) + i]);
        }
    }
}




