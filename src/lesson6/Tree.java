package lesson6;

/**
 * Created by Andrii Bushlyakov for WebCamp.
 */
public class Tree {
    public static void main(String[] args) {
        int max = 30;
        for (int i = 0; i < max / 2; i++) {
            for (int j = max - 1; j > 0; j--) {
                if (j >= max / 2 - i && j <= max / 2 + i) System.out.print("#");
                else System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = 0; i < max / 2; i++) {
            for (int j = max - 1; j > 0; j--) {
                if (j >= i + 1 && j <= max - i - 1) System.out.print("#");
                else System.out.print(" ");
            }
            System.out.println();
        }

    }
}
