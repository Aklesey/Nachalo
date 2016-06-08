package homeFrom01_06_2016.Auto;

import java.time.LocalDate;
import java.time.Month;

/**
 * Created by Andrii Bushlyakov for WebCamp.
 */
public class Main {
    public static void main(String[] args) {
        Car a = new Car(LocalDate.of(2015, Month.values()[1], 15), "name");
        System.out.println(a.toString());
    }
}
