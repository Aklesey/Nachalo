package lesson3;


public class Lesson_3_1 {
    public static void main(String[] args) {
        int x=10, y=12, z=3;
        x += y - x++ * z;//z=3 y=12
        z = --x - y * 5;
        y /= x + 5 % z;
        z = x++ + y * 5;
        x = y - x++ * z;
        System.out.println(x + y + z);
    }
}
