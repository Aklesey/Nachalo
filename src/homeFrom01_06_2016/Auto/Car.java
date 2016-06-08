package homeFrom01_06_2016.Auto;

import java.time.LocalDate;

/**
 * Created by Andrii Bushlyakov for WebCamp.
 */
public class Car {
    String name;
    Type type;
    String owner;
    String number;
    String color;
    Fabrik manufacturerName;
    Boolean completed;
    String description;
    int price;
    LocalDate data;

    public Car(LocalDate date, String name){
        this.data = date;
        this.name = name;
    }

    @Override
    public String toString() {
        return this.data + " " + this.name;
    }
}
 enum Fabrik {
     FABRIK1, FABRIK2, FABRIK3
 }
enum Type{

}