package newHome.homework1;

/**
 * Created by user on 28.05.2016.
 */
public class Min {
    public int getMin() {
        return min;
    }

    int min;

    public Min(int a, int b, int c) {

        min = (a <= b) ? a : b;
        min = (min <= c) ? min : c;

    }
}

