package superhard;

import java.util.Arrays;

/**
 * Created by user on 31.05.2016.
 */
public class SortDouble {
    public static void main(String[] args) {

        int myArray[][];
        myArray = new int[(int) (Math.random() *100)][(int) (Math.random() *100)];
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                myArray[i][j] = (int)(Math.random() * 10000);
            }
        }
        printArray(myArray);
        float temp [] = new float [myArray.length * myArray[0].length];
        int count = 0;
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                temp[count] = myArray[i][j];
                count ++;
            }
        }
        Arrays.sort(temp);
        count = 0;
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                myArray[i][j] =(int) temp[count];
                count ++;
            }
        }
        printArray(myArray);
    }

    public static void  printArray  (int [][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
