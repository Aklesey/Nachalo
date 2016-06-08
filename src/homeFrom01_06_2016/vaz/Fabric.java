package homeFrom01_06_2016.vaz;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created by user on 05.06.2016.
 */
public enum Fabric {
    FABRIC1,
    FABRIC2,
    FABRIC3,
    FABRIC4,
    FABRIC5,
    FABRIC6,
    FABRIC7,
    FABRIC8,
    FABRIC9;


    private static final List<Fabric> VALUES =
            Collections.unmodifiableList(Arrays.asList(values()));
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    public static Fabric randomFabric() {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }
}
