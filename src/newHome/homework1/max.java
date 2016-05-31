package newHome.homework1;

/**
 * Created by user on 28.05.2016.
 */
public class Max {
    int max;

    public Max(int a, int b, int c) {

        max = (a >= b) ? a : b;
        max = (max >= c) ? max : c;

    }

    public int getMax() {
        return max;
    }
}
