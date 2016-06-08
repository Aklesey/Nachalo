package homeFrom01_06_2016.vaz;

import java.util.*;

/**
 * Created by user on 05.06.2016.
 */
public enum Color {
    RED ("красный"),
    BLACK ("черный"),
    WHITE ("белый"),
    ORANGE ("оранжевый"),
    YELLOW("желтый"),
    GREEN ("зеленый"),
    BLUE("синий"),
    PURPLE ("фиолетовый");
    String value;

    Color(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    private static final List<Color> VALUES =
            Collections.unmodifiableList(Arrays.asList(values()));
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    public static Color randomCollor() {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }

}
