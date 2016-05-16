package oop;

/**
 * Created by user on 16.05.2016.
 */
public class Rectangle {
    public double side1;
    public double side2;

    public Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    public double areaCalculator(){
        return this.side1*this.side2;

    }


    public double perimeterCalculator (){
        return (this.side1+this.side2)*2;

    }
    @Override
    public String toString() {
        return "Rectangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                '}';
    }
}
