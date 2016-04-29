package lesson3;

import java.math.BigDecimal;

/**
 * Created by user on 29.04.2016.
 */
public class Lesson_3_2 {
    public static void main(String[] args) {
    //    int x = 43, y = 9, z = 123;
   //     double sum;
   //     sum = x + y + z;
        BigDecimal x = new BigDecimal(43) ;
        BigDecimal y= new BigDecimal(9) ;
        BigDecimal z = new BigDecimal(123) ;
        BigDecimal e = new BigDecimal(3) ;
        BigDecimal sum = x.add(y.add(z));
        BigDecimal average = sum.divide(e, 120, 1);


        System.out.println(average);
    }
}
