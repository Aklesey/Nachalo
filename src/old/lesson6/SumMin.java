package old.lesson6;

/**
 * Created by user on 05.05.2016.
 */
public class SumMin {
    public static void main(String[] args) {
        int a=10, b=54;
        int sum = 0;
        for (int j = a; j <= b; j++) {
            sum = sum + j;
        }
        System.out.println(sum);
        for (int j= a; j<=b; j++){
            if (j % 2 == 0) {
                continue;
            }else{
                System.out.println(j);
            }
        }
    }
}
