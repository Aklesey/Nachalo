package old.lesson6;

/**
 * Created by user on 05.05.2016.
 */
public class ex3 {
    public static void main(String[] args) {
//        прямоуголный треугольник
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.println("\n --------------------------------- \n");
        //      прямоуголник
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.println("\n --------------------------------- \n");
        // равносторонний
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.println("\n --------------------------------- \n");
        for (int i = 0; i < 10; i++) {
            for (int j = 10 ; j > i ; j--) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 9 ; j > 0 ; j--) {
                if (j == 9/2) System.out.print("*");
                else System.out.println(" ");
            }
            System.out.print("\n");
        }




    }
}
