package homeFrom01_06_2016.vaz;

import java.util.ArrayList;

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
        int[] red = new int[autoprom.size()];
        int c1 = 0;
        int[] black = new int[autoprom.size()];
        int c2 = 0;
        int[] white = new int[autoprom.size()];
        int c3 = 0;
        int[] orange = new int[autoprom.size()];
        int c4 = 0;
        int[] yellow = new int[autoprom.size()];
        int c5 = 0;
        int[] green = new int[autoprom.size()];
        int c6 = 0;
        int[] blue = new int[autoprom.size()];
        int c7 = 0;
        int[] purpule = new int[autoprom.size()];
        int c8 = 0;
        for (int i = 0; i < autoprom.size(); i++) {
            switch (autoprom.get(i).getColor()) {
                case RED:
                    red[c1] = i;
                    c1++;
                    break;
                case BLACK:
                    black[c2] = i;
                    c2++;
                    break;
                case WHITE:
                    white[c3] = i;
                    c3++;
                    break;
                case ORANGE:
                    orange[c4] = i;
                    c4++;
                    break;
                case YELLOW:
                    yellow[c5] = i;
                    c5++;
                    break;
                case GREEN:
                    green[c6] = i;
                    c6++;
                    break;
                case BLUE:
                    blue[c7] = i;
                    c7++;
                    break;
                case PURPLE:
                    purpule[c8] = i;
                    c8++;
                    break;
            }
        }
//        c1 = c2 = c3 = c4 = c5 = c6  = c7 = c8 = 0;
        ArrayList<Auto> list1 = new ArrayList<>();
        for (int j = 0; j < c1; j++) {
            list1.add(autoprom.get(red[j]));
        }
        for (int j = 0; j < c2; j++) {
            list1.add(autoprom.get(black[j]));
        }
        for (int j = 0; j < c3; j++) {
            list1.add(autoprom.get(white[j]));
        }
        for (int j = 0; j < c4; j++) {
            list1.add(autoprom.get(orange[j]));
        }
        for (int j = 0; j < c5; j++) {
            list1.add(autoprom.get(yellow[j]));
        }
        for (int j = 0; j < c6; j++) {
            list1.add(autoprom.get(green[j]));
        }
        for (int j = 0; j < c7; j++) {
            list1.add(autoprom.get(blue[j]));
        }
        for (int j = 0; j < c8; j++) {
            list1.add(autoprom.get(purpule[j]));
        }
        for (Auto aAu :
                list1) {
            System.out.println(aAu);
        }

    }
}
