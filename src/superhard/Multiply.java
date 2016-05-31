package superhard;

/**
 * Created by user on 31.05.2016.
 */
public class Multiply {
    public static void main(String[] args) {
        int[][] myArray1;
        int[][] myArray2;
        int[][] myArray3;

        myArray1 = new int[(int) (Math.random() * 10)][(int) (Math.random() * 10)];
        myArray2 = new int[myArray1.length][myArray1[0].length];
//        myArray3 = new int[myArray1.length][myArray1[0].length];

        myArray1 = filling(myArray1);
        myArray2 = filling(myArray2);

        printArray(myArray1);
        printArray(myArray2);

        myArray3 = multiply(myArray1, myArray2);

        printArray(myArray3);
    }

    public static int[][] multiply(int array1[][], int array[][]){
        int result [][];
        result = new int[array.length][array[0].length];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = array[i][j]* array1[i][j];
            }
        }
        return result;
    }

    public static void printArray(int array[][]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int[][] filling(int array[][]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 100);
            }
        }
        return array;
    }
}
