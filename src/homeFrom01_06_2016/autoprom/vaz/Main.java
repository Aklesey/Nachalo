package homeFrom01_06_2016.autoprom.vaz;

import homeFrom01_06_2016.autoprom.comparator.AutoNumberComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by user on 05.06.2016.
 */
public class Main {
    public static void main(String[] args) {


        ArrayList<Auto> autoprom = new ArrayList<Auto>();
        Auto a = new Auto("Vasia", TypeAuto.CROSSOVER, 2623153, Color.GREEN);
        autoprom.add(new Auto("Petia", TypeAuto.LANDAU, 1564713, Color.GREEN));
        autoprom.add(new Auto("Aklesey", TypeAuto.SEDAN, 1622314, Color.BLACK));
        autoprom.add(new Auto("Viktor"));
        autoprom.add(new Auto("Andey", Color.GREEN, TypeAuto.CABRIOLET, 1135623));
        autoprom.add(new Auto("Vasia", 1635623, Color.GREEN));
        autoprom.add(a);
        for (int i = 0; i < 5; i++) {
            autoprom.add(new Auto());
        }
        for (Auto anAutoprom : autoprom) {
            System.out.println(anAutoprom);
        }
        System.out.println("BIG price");
        int temp = 0;
        for (int i = 0; i < autoprom.size(); i++) {
            if (autoprom.get(i).getPrice() > autoprom.get(temp).getPrice())
                temp = i;
        }
        System.out.println(autoprom.get(temp));
        System.out.println("colors");
        Collections.sort(autoprom);

        for (Auto auto : autoprom) {
            System.out.println(auto.getPrice());
        }
        System.out.println();
        System.out.println();

        Collections.sort(autoprom, new Comparator<Auto>() {
            @Override
            public int compare(Auto o1, Auto o2) {
                return Integer.compare(o1.getPrice(), o2.getPrice());
            }
        });
        for (Auto auto : autoprom) {
            System.out.println(auto.getPrice());
        }
        Collections.sort(autoprom, new AutoNumberComparator());
        System.out.println();
        for (Auto auto : autoprom) {
            System.out.println(auto.getNumber());
        }


    }
}
