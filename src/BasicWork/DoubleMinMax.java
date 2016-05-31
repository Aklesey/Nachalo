package BasicWork;

/**
 * Created by user on 30.05.2016.
 */
public class DoubleMinMax {
    public static void main(String[] args) {
        int max = 0;
        int maxI = 0;
        int min = 0;
        int minI = 0;
        int temp;
        int da[][];
        da = new int[(int) (Math.random() * 10)][(int) (Math.random() * 10)];
        for (int i = 0; i < da.length; i++) {
            for (int j = 0; j < da[i].length; j++) {
                da[i][j] = (int) (Math.random() * 100);
                System.out.print(da[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < da.length; i++) {
            for (int j = 0; j < da[i].length; j++) {
                if (da[i][j] > da[maxI][max]) {
                    maxI = i;
                    max = j;
                }
                if (da[i][j] < da[minI][min]) {
                    minI = i;
                    min = j;
                }


            }
        }
        System.out.println("max = " + da[maxI][max]);
        System.out.println("min = " + da[minI][min]);
        temp = da[minI][min];
        da[minI][min] = da[maxI][max];
        da[maxI][max] = temp;
        for (int i = 0; i < da.length; i++) {
            for (int j = 0; j < da[i].length; j++) {
                System.out.print(da[i][j] + " ");
            }
            System.out.println();
        }
    }
}
