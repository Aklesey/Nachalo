package homeFrom01_06_2016;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by user on 02.06.2016.
 */
public class ListCreating {
    public static void main(String[] args) {
        List<Fabric> list = new ArrayList<>();
        list.add(new Fabric(12118951, 16816.6121));
        list.add(new Fabric(9999951, 16816.6121));
        list.add(new Fabric(1211251, 16816.6121));
        list.add(new Fabric(1200011951, 16816.6121));
        list.add(new Fabric(12118951, 16816.6121));
        Fabric a = new Fabric(999999999, 123.25);
        list.add(a);
        ListIterator iter;
        iter = list.listIterator();
        while (iter.hasNext()) {

            System.out.println(iter.next().toString() + " ");
        }
        System.out.println();

    }
}

class Fabric {
    long invoice;
    double price;

    public Fabric(long  invoice, double price) {
        this.invoice = invoice;
        this.price = price;

    }

    @Override
    public String toString() {
        return "invoice = " + invoice + ", price = " + price;
    }
}
