package newHome.homework1;

/**
 * Created by user on 28.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        Input a = new Input();
        Input b = new Input();
        Input c = new Input();
        Max max = new Max(a.a, b.a, c.a);
        Min min = new Min(a.a, b.a, c.a);
        System.out.println("maximal: " + max.getMax());
        System.out.println("minimal: " + min.getMin());



    }
}
