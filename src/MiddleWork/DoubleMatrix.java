package MiddleWork;

/**
 * Created by user on 30.05.2016.
 */
public class DoubleMatrix {
    public static void main(String[] args) {
        int maxSum[];
        int minSum[];

        int da2[][];
        da2 = new int[6][6];

        System.out.println("original");
        da2 = filling(da2);
        printArray(da2);

        System.out.println("invert");
        da2 = invert(da2);
        printArray(da2);

        int da[][];
        da = new int[(int) (Math.random() * 10)][(int) (Math.random() * 10)];
        System.out.println("dano");
        da = filling(da);
        printArray(da);

        System.out.println("max");
        maxSum = da[max(da)];
        printArray(maxSum);

        System.out.println("min");
        minSum = da[min(da)];
        printArray(minSum);

        System.out.println("result");
        change(da);
        printArray(da);


    }

    public static int[][] filling(int array[][]) {
        int result[][];
        result = new int[array.length][array[0].length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                result[i][j] = (int) (Math.random() * 10);
            }
        }
        return result;
    }

    public static void printArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println();
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

    public static int[][] invert(int array[][]) {
        int result[][];

        result = new int[array.length][array[0].length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                result[i][j] = array[array.length - (i + 1)][array[i].length - (j + 1)];

            }
        }
        return result;
    }

    public static int sum(int array[]) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }


    private static int max(int array[][]) {
        int max = 0;
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (sum(array[i]) > max) {
                max = sum(array[i]);
                result = i;
            }
        }
        return result;
    }

    private static int min(int array[][]) {
        int min = Integer.MAX_VALUE;
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (sum(array[i]) < min) {
                min = sum(array[i]);
                result = i;
            }

        }
        return result;
    }

    private static int[][] change(int array[][]) {
        int result[][];
        result = array;
        int min = min(result);
        int max = max(result);
        int temp[];
        temp = result[min];
        result[min] = result[max];
        result[max] = temp;
        return result;
    }
}


