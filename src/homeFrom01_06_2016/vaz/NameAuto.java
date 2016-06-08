package homeFrom01_06_2016.vaz;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created by user on 05.06.2016.
 */
public enum  NameAuto {
    NISSAN("Nissan"),
    PORSCHE("Porsche"),
    AUDI("Audi"),
    HYUNDAI("Hyundai"),
    FORD ("Ford"),
    VOLKSVAGEN ("Volkswagen"),
    HONDA ("Honda"),
    BMW ("BMW"),
    MERCEDES_BENZ ("Mercedes-Benz"),
    TOYOTA ("Toyota");
    String value;

    NameAuto(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    private static final List<NameAuto> VALUES =
            Collections.unmodifiableList(Arrays.asList(values()));
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    public static NameAuto randomNameAuto() {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }

}
