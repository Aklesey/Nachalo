package BasicWork;

/**
 * Created by user on 30.05.2016.
 */
public class DoubleArray {
    public static void main(String[] args) {
        float sum = 0;
        float countEl = 0;
        int[][] da = new int[(int) (Math.random() * 10)][(int) (Math.random() * 10)];
        for (int i = 0; i < da.length; i++) {
            for (int j = 0; j < da[i].length; j++) {
                da[i][j] = (int) (Math.random() * 10);
                System.out.print(da[i][j] + " ");
            countEl++;
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < da.length; i++) {
            for (int j = 0; j < da[i].length; j++) {
                sum += da[i][j];
            }
        }
        System.out.println((int)sum);
        System.out.println(sum/countEl);
    }
}
