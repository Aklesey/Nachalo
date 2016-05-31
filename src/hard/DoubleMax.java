package hard;

/**
 * Created by user on 30.05.2016.
 */
public class DoubleMax {
    public static void main(String[] args) {
        int max = 1;
        int[][] da = new int[6][6];
        for (int i = 0; i < da.length; i++) {
            for (int j = 0; j < da[i].length; j++) {
                da[i][j] = (int) (Math.random() * 1000);
            }
        }
        for (int i = 0; i < da.length; i++) {
            for (int j = 0; j < da[i].length; j++) {
                System.out.print(da[i][j] + "\t");
            }
            System.out.println();
        }
        for (int i = 0; i < da.length; i++) {
            for (int j = 0; j < da[i].length; j++) {
                if (da[i][j]>max) max = da[i][j];
            }
        }
        System.out.println(max);
    }
}
