package old.lesson7;

import java.util.Scanner;

/**
 * Created by user on 06.05.2016.
 */
public class Calculator {
    private static float calculate(int a,int b,int c){
        float middle;
        middle = (a+b+c)/3;
        return middle;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ввелите три целых числа:");
        int a= input.nextInt();
        int b= input.nextInt();
        int c= input.nextInt();
        float result = calculate(a,b,c);
        System.out.println(result);
    }

}
