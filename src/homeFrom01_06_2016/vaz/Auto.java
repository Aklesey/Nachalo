package homeFrom01_06_2016.vaz;

import java.util.Date;
import java.util.Random;

import static homeFrom01_06_2016.vaz.Color.randomCollor;

/**
 * Created by Aklesey on 02.06.2016.
 */

public class Auto implements Comparable<Auto>{
    private String name;
    private TypeAuto typeAuto;
    private String owner;
    private int number;
    private Color color;
    private Fabric manufacturerName;
    private Boolean completed;
    private String description;
    private int price;
    private Date data;
    private static int count = 0000001;

    public Auto() {
        name = NameAuto.randomNameAuto().getValue();
        typeAuto = TypeAuto.randomType();
        number = count++;
        color = randomCollor();
        price = 100000 + (int) (Math.random() * ((10000000 - 100000) + 1));
        completed = Math.random() < 0.5;
        manufacturerName = Fabric.randomFabric();
        data = randomeDate();
        description = typeAuto.name();
    }

    public Auto(String owner, int number, Color color, TypeAuto typeAuto) {
        this.owner = owner;
        this.number = number;
        this.color = color;
        this.typeAuto = typeAuto;
        price = 100000 + (int) (Math.random() * ((10000000 - 100000) + 1));
        completed = Math.random() < 0.5;
        manufacturerName = Fabric.randomFabric();
        name = NameAuto.randomNameAuto().getValue();
        data = randomeDate();

        description = typeAuto.name();
    }

    public Auto(String owner, TypeAuto typeAuto, int number, Color color) {
        this.owner = owner;
        this.number = number;
        this.color = color;
        this.typeAuto = typeAuto;
        price = 100000 + (int) (Math.random() * ((10000000 - 100000) + 1));
        completed = Math.random() < 0.5;
        manufacturerName = Fabric.randomFabric();
        name = NameAuto.randomNameAuto().getValue();
        data = randomeDate();
        description = typeAuto.name();
    }

    public Auto(String owner, int number, TypeAuto typeAuto, Color color) {
        this.owner = owner;
        this.number = number;
        this.color = color;
        this.typeAuto = typeAuto;
        price = 100000 + (int) (Math.random() * ((10000000 - 100000) + 1));
        completed = Math.random() < 0.5;
        manufacturerName = Fabric.randomFabric();
        name = NameAuto.randomNameAuto().getValue();
        data = randomeDate();
        description = typeAuto.name();
    }

    public Auto(String owner, Color color, TypeAuto typeAuto, int number) {
        this.owner = owner;
        this.number = number;
        this.color = color;
        this.typeAuto = typeAuto;
        price = 100000 + (int) (Math.random() * ((10000000 - 100000) + 1));
        completed = Math.random() < 0.5;
        manufacturerName = Fabric.randomFabric();
        name = NameAuto.randomNameAuto().getValue();
        data = randomeDate();
        description = typeAuto.name();
    }

    public Auto(String owner, TypeAuto typeAuto, Color color, int number) {
        this.owner = owner;
        this.number = number;
        this.color = color;
        this.typeAuto = typeAuto;
        price = 100000 + (int) (Math.random() * ((10000000 - 100000) + 1));
        completed = Math.random() < 0.5;
        manufacturerName = Fabric.randomFabric();
        name = NameAuto.randomNameAuto().getValue();
        data = randomeDate();
        description = typeAuto.name();
    }

    public Auto(String owner, Color color, int number, TypeAuto typeAuto) {
        this.owner = owner;
        this.number = number;
        this.color = color;
        this.typeAuto = typeAuto;
        price = 100000 + (int) (Math.random() * ((10000000 - 100000) + 1));
        completed = Math.random() < 0.5;
        manufacturerName = Fabric.randomFabric();
        name = NameAuto.randomNameAuto().getValue();
        data = randomeDate();
        description = typeAuto.name();
    }

    public Auto(String owner, Color color, int number) {
        this.owner = owner;
        this.number = number;
        this.color = color;
        typeAuto = TypeAuto.randomType();
        price = 100000 + (int) (Math.random() * ((10000000 - 100000) + 1));
        completed = Math.random() < 0.5;
        manufacturerName = Fabric.randomFabric();
        name = NameAuto.randomNameAuto().getValue();
        description = typeAuto.name();
    }

    public Auto(String owner, TypeAuto typeAuto, Color color) {

        this.owner = owner;
        this.typeAuto = typeAuto;
        this.color = color;
        number = count++;
        price = 100000 + (int) (Math.random() * ((10000000 - 100000) + 1));
        completed = Math.random() < 0.5;
        manufacturerName = Fabric.randomFabric();
        name = NameAuto.randomNameAuto().getValue();
        data = randomeDate();
        description = typeAuto.name();
    }

    public Auto(String owner, Color color, TypeAuto typeAuto) {

        this.owner = owner;
        this.typeAuto = typeAuto;
        this.color = color;
        number = count++;
        price = 100000 + (int) (Math.random() * ((10000000 - 100000) + 1));
        completed = Math.random() < 0.5;
        manufacturerName = Fabric.randomFabric();
        name = NameAuto.randomNameAuto().getValue();
        data = randomeDate();
        description = typeAuto.name();
    }

    public Auto(String owner, int number, Color color) {

        this.owner = owner;
        this.number = number;
        this.color = color;
        typeAuto = TypeAuto.randomType();
        price = 100000 + (int) (Math.random() * ((10000000 - 100000) + 1));
        completed = Math.random() < 0.5;
        manufacturerName = Fabric.randomFabric();
        name = NameAuto.randomNameAuto().getValue();
        data = randomeDate();
        description = typeAuto.name();
    }

    public Auto(String owner, TypeAuto typeAuto, int number) {

        this.owner = owner;
        this.number = number;
        this.typeAuto = typeAuto;
        color = randomCollor();
        price = 100000 + (int) (Math.random() * ((10000000 - 100000) + 1));
        completed = Math.random() < 0.5;
        manufacturerName = Fabric.randomFabric();
        name = NameAuto.randomNameAuto().getValue();
        data = randomeDate();
        description = typeAuto.name();
    }

    public Auto(String owner, int number) {

        this.owner = owner;
        this.number = number;
        typeAuto = TypeAuto.randomType();
        color = randomCollor();
        price = 100000 + (int) (Math.random() * ((10000000 - 100000) + 1));
        completed = Math.random() < 0.5;
        manufacturerName = Fabric.randomFabric();
        name = NameAuto.randomNameAuto().getValue();
        data = randomeDate();
        description = typeAuto.name();
    }

    public Auto(String owner, Color color) {
        this.owner = owner;
        this.color = color;
        number = count++;
        typeAuto = TypeAuto.randomType();


        price = 100000 + (int) (Math.random() * ((10000000 - 100000) + 1));
        completed = Math.random() < 0.5;
        manufacturerName = Fabric.randomFabric();
        name = NameAuto.randomNameAuto().getValue();
        data = randomeDate();
        description = typeAuto.name();
    }

    public Auto(String owner, TypeAuto typeAuto) {

        this.owner = owner;
        this.typeAuto = typeAuto;
        number = count++;
        color = randomCollor();


        price = 100000 + (int) (Math.random() * ((10000000 - 100000) + 1));
        completed = Math.random() < 0.5;
        manufacturerName = Fabric.randomFabric();
        name = NameAuto.randomNameAuto().getValue();
        data = randomeDate();
        description = typeAuto.name();
    }

    public Auto(String owner) {

        this.owner = owner;
        number = count++;
        typeAuto = TypeAuto.randomType();
        color = randomCollor();


        price = 100000 + (int) (Math.random() * ((10000000 - 100000) + 1));
        completed = Math.random() < 0.5;
        manufacturerName = Fabric.randomFabric();
        name = NameAuto.randomNameAuto().getValue();
        data = randomeDate();
        description = typeAuto.name();
    }

    @Override
    public String toString() {
        return
                "Name: " + name +", "+ "\t" +
                        "typeAuto: " + typeAuto +", "+ "\t" +
                        "owner:' " + owner +", "+ '\'' + "\t" +
                        "number: " + number +", "+ "\t" +
                        "color: " + color.getValue() +", "+ "\t" +
                        "manufacturerName: " + manufacturerName +", "+ "\t" +
                        "completed: " + completed +", "+"\t" +
                        "description: '" + description + '\'' +", "+ "\t" +
                        "price: " + price +", "+ "\t" +
                        "data: " + data;
    }

    public String getName() {
        return name;
    }

    public TypeAuto getTypeAuto() {
        return typeAuto;
    }

    public String getOwner() {
        return owner;
    }

    public int getNumber() {
        return number;
    }

    public Color getColor() {
        return color;
    }

    public Fabric getManufacturerName() {
        return manufacturerName;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }

    public Date getData() {
        return data;
    }

    public static int getCount() {
        return count;
    }

    public Date randomeDate() {
        Random rnd;
        Date dt;
        long ms;

        rnd = new Random();
        ms = (Math.abs(rnd.nextLong()) % (46L * 365 * 24 * 60 * 60 * 1000));

        return dt = new Date(ms);

    }

    @Override
    public int compareTo(Auto o) {
        return this.color.compareTo(o.color);
    }
}
