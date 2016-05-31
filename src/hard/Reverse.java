package hard;

/**
 * Created by user on 28.05.2016.
 */
public class Reverse {
    public static void main(String[] args) {
        int[] myArray;
        myArray = new int[15];
        int[] myArrayChek = new int[myArray.length];

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i + 1;
            System.out.print(myArray[i] + " ");
        }
        System.arraycopy(myArray, 0, myArrayChek, 0, myArray.length);
        System.out.println("");

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = myArrayChek[myArrayChek.length - (i + 1)];
            System.out.print(myArray[i] + " ");
        }

    }
}
