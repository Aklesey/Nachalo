package hard;

import java.util.Arrays;

/**
 * Created by user on 30.05.2016.
 */
public class DoubleSort {
    public static void main(String[] args) {
        int da[][];
        da = new int[3][10];
        for (int i = 0; i < da.length; i++) {
            for (int j = 0; j < da[i].length; j++) {
                da[i][j] = (int) (Math.random() * 10);
            }
        }
        for (int i = 0; i < da.length; i++) {
            for (int j = 0; j < da[i].length; j++) {
                System.out.print(da[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < da.length; i++) {
            Arrays.sort(da[i]);
        }
        System.out.println();
        System.out.println();
        for (int i = 0; i < da.length; i++) {
            for (int j = 0; j < da[i].length; j++) {
                System.out.print(da[i][j] + " ");
            }
            System.out.println();
        }
    }
}
