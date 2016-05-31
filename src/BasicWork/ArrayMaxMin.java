package BasicWork;

/**
 * Created by user on 30.05.2016.
 */
public class ArrayMaxMin {
    public static void main(String[] args) {
        int max = 0;
        int min = 0;
        int da[];
        da = new int[(int) (Math.random() * 15)];
        for (int i = 0; i < da.length; i++) {
            da[i] = (int) (Math.random() * 100);
            System.out.print(da[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < da.length; i++) {
            if (da[i] > da[max]) max = i;
            if (da[i] < da[min]) min = i;
        }
        System.out.println("min " + da[min]);
        System.out.println("max " + da[max]);
        int temp = da[min];
        da[min] = da[max];
        da[max] = temp;
        for (int i = 0; i < da.length; i++) {
            System.out.print(da[i] + " ");
        }
    }
}
