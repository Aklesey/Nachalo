package homeFrom01_06_2016;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Created by user on 02.06.2016.
 */
public class Iteration {
    public static void main(String[] args) {
        ArrayList<Integer> iteration = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            iteration.add((int) (Math.random() * 1000));
            System.out.print(iteration.get(i) + " ");
        }
        System.out.println();

        ListIterator iter = iteration.listIterator();
        while (iter.hasNext()) {
            int value = (int) iter.next();
            System.out.print(value + " ");
        }
        System.out.println();


        for (int i = 0; i < iteration.size(); i++) {
            System.out.print(iteration.get(i) + " ");
        }


        for (Integer anIteration : iteration) System.out.print(anIteration + " ");
    }

}
