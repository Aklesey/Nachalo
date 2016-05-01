package lesson5;

/**
 * Created by user on 01.05.2016.
 */
public class LogicOperations {
    public static void main(String[] args) {
        int x = 5, y = 10,  z = 15;
        x += y >> x++ * z;
        System.out.println(x+"   "+y+"   "+z);
        z = ++x & y * 5;
        System.out.println(x+"   "+y+"   "+z);
        y /= x + 5 | z;
        System.out.println(x+"   "+y+"   "+z);
        z = x++ & y * 5;
        System.out.println(x+"   "+y+"   "+z);
        x = y << x++ ^ z;
        System.out.println(x+"   "+y+"   "+z);
    }
}
