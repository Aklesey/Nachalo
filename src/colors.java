/**
 * Created by user on 19.06.2016.
 */
public class colors {
    public static void main(String[] args) {
        int[] colorss = {4, 7, 30, 31, 32, 33, 34, 35, 36, 37, 40, 41, 42, 43, 44, 45, 46, 47,
                90, 91, 92, 93, 94, 95, 96, 97, 100, 101, 102, 103, 104, 105, 106, 107};
        for (int i = 0; i < colorss.length; i++) {
            System.out.printf((char)27 + "[%smDelete operation is failed. " + (char) 27 + "[0m" + colorss[i] + "\n", colorss[i]);
        }
    }
}
