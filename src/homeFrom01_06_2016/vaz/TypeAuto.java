package homeFrom01_06_2016.vaz;

import java.util.*;

/**
 * Created by user on 02.06.2016.
 */
public enum TypeAuto {
    HATCHBACK {String s = "хэтчбек";},
    MICRO_COMPACT_CAR {String s = "малолитражный автомобиль";},
    STATION_WAGON {String s = "универсал";},
    LANDAU {String s = "автомобиль с открывающимся верхом";},
    PICKUP_TRUCK {String s = "пикап";},
    VAN {String s = "фургон";},
    MINIVAN {String s = "минивэн";},
    SPORTS_CAR {String s = "спортивный автомобиль";},
    PHAETON {String s = "фаэтон";},
    SEDAN {String s = "седан";},
    CABRIOLET {String s = "кабриолет";},
    OFF_ROAD_CAR {String s = "внедорожник";},
    ROADSTER {String s = "автомобиль с открытым двухместным кузовом";},
    LIMOUSINE {String s = "лимузин";},
    CROSSOVER {String s = "кроссовер";};

    private static final List<TypeAuto> VALUES =
            Collections.unmodifiableList(Arrays.asList(values()));
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    public static TypeAuto randomType() {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }
}