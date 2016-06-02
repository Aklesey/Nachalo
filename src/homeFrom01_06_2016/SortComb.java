package homeFrom01_06_2016;

/**
 * Created by user on 01.06.2016.
 */
public class SortComb {

    public static void main(String[] args) {

        int[] myArray;
        myArray = new int[50000];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] =(int)( Math.random()*50000);
        }
        printArray(myArray);
        printArray(sortComb(myArray));

    }

    public static int [] sortComb(int[] array) {
        int step = array.length;
        for (; step > 1; ) {
            step = (int) (step / 1.247330950103979);
            for (int i = 0; i < array.length - step; i++) {
                if (array[i] > array[i + step]) {
                    int t = array[i];
                    array[i] = array[i + step];
                    array[i + step] = t;
                }

            }
            if (step == 1) break;
        }return array;
    }

    public static <E extends Comparable<? super E>> void sort(E[] input) {
        int gap = input.length;
        boolean swapped = true;
        while (gap > 1 || swapped) {
            if (gap > 1)
                gap = (int) (gap / 1.247330950103979);

            int i = 0;
            swapped = false;
            while (i + gap < input.length) {
                if (input[i].compareTo(input[i + gap]) > 0) {
                    E t = input[i];
                    input[i] = input[i + gap];
                    input[i + gap] = t;
                    swapped = true;
                }
                i++;
            }
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length;) {
            for (int j = 0; j < 10020; j++) {
                if ( i ==array.length) break;

                System.out.print(array[i] + " ");
                i++;
            }
            System.out.println();
        }
        System.out.println();
    }
}

