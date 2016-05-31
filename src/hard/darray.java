package hard;

/**
 * Created by user on 29.05.2016.
 */
public class darray {
    public static void main(String[] args) {
        int[][] da = new int[6][6];
        for (int i = 0; i < da.length; i++) {
            for (int j = 0; j < da[i].length; j++) {
                da[i][j] = (int) (Math.random() * 10);
            }
        }
        int[][] da2 = new int[6][6];
        for (int i = 0; i < da2.length; i++) {
            for (int j = 0; j < da2[i].length; j++) {
                da2[i][j] = (int) (Math.random() * 10);
            }
        }
        int[][] da3 = new int[6][6];
        for (int i = 0; i < da3.length; i++) {
            for (int j = 0; j < da3[i].length; j++) {
                da3[i][j] = (da[i][j] + da2[i][j]);
            }
        }
        for (int i = 0; i < da.length; i++) {
            for (int j = 0; j < da[i].length; j++) {
                System.out.print(da[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < da2.length; i++) {
            for (int j = 0; j < da2[i].length; j++) {
                System.out.print(da2[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < da3.length; i++) {
            for (int j = 0; j < da3[i].length; j++) {
                System.out.print(da3[i][j] + "\t");
            }
            System.out.println(); // Переходим на следующую строку
        }
    }
}
