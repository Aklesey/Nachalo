package homeFrom01_06_2016;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by user on 01.06.2016.
 */
public class SortFast {
    public static void main(String[] args) {
        int array[] = new int[(int) (Math.random() * 1000)];
//        int array[] = new int[(10)];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() * 10000) + 1);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        qsort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    private static void qsort(int[] arr) {
        ArrayList<Integer> temp1 = new ArrayList<Integer>();
        ArrayList<Integer> temp2 = new ArrayList<Integer>();
        int t1[], t2[];
        int sum = 0;
        for (int anArr : arr) sum += anArr;
        int mediana = sum / arr.length;
        for (int anArr : arr)
            if (anArr < mediana) temp1.add(anArr);
            else temp2.add(anArr);
        t1 = new int[temp1.size()];
        t2 = new int[temp2.size()];
        for (int i = 0; i < t1.length; i++) t1[i] = temp1.get(i);
        for (int i = 0; i < t2.length; i++) t2[i] = temp2.get(i);
        if (t1.length > 2) qsort(t1);
        if (t2.length > 2) qsort(t2);
        System.arraycopy(t1, 0, arr, 0, t1.length);
        System.arraycopy(t2, 0, arr, t1.length, t2.length);
    }
}