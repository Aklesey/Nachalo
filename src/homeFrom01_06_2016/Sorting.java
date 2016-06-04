package homeFrom01_06_2016;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by user on 02.06.2016.
 */
public class Sorting implements Comparable {
    public static void main(String[] args) {

    List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add((int)(Math.random()*1000));
            System.out.print(list.get(i) + " ");
        }
        Collections.sort(list);
        System.out.println();
        for (Integer aList : list) {


            System.out.print(aList + " ");
        }


    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
