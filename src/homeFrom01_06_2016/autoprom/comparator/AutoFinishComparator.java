package homeFrom01_06_2016.autoprom.comparator;

import homeFrom01_06_2016.autoprom.vaz.Auto;

import java.util.Comparator;

/**
 * Created by user on 09.06.2016.
 */
public class AutoFinishComparator implements Comparator<Auto> {
    @Override
    public int compare(Auto o1, Auto o2) {
        return o1.getCompleted().compareTo(o2.getCompleted());
    }
}
