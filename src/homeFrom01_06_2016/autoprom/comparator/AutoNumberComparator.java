package homeFrom01_06_2016.autoprom.comparator;

/**
 * Created by user on 09.06.2016.
 */

import homeFrom01_06_2016.autoprom.vaz.Auto;

import java.util.Comparator;

public class AutoNumberComparator implements Comparator<Auto> {


    @Override
    public int compare(Auto o1, Auto o2) {
        return o1.getNumber() - o2.getNumber();
    }
}
