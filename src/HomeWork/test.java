package HomeWork;

import java.util.Scanner;

/**
 * Created by user on 30.04.2016.
 */
public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите целое число :");
        int n = input.nextInt();
        int count = 1;
        int b = n;
        do{
            if (n<=0){
                if (n==0) {
                    System.out.println("факториал введеного вами числа = 1");
                    break;
                } else{
                    System.out.println("факториал введеного вами числа несуществует");
                    break;
                }
            }else{
              count=n*(n-1);
            }
        }
        while (count == n);
    }
}

