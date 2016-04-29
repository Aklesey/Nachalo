package lesson3;

/**
 * Created by user on 29.04.2016.
 */
public class Volume {
    public static void main(String[] args) {
        double r =3, h=4, v, s;
        final double pi= Math.PI;
        v = pi * Math.pow(r, 2);
        s= 2*pi*r*h + 2*pi*Math.pow(r, 2);

        System.out.println(v);
        System.out.println(s);
    }

}
