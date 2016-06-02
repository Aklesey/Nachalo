package homeFrom01_06_2016;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by user on 01.06.2016.
 */
public class Lottery {
    static String a = "Введите диапазон выпадаемых чисел : ";
    static String b = "Введите необходимое количество чисел которых нужно угадать для выиграша джекпота : ";
    static String c = "Введите стоимость одного лотерейного билета : ";
    static String d = "Введите сумму ДЖЕКПОТа : ";


    public static void main(String[] args) {
        int rangeField, winNumber, ticketPrice, jackpot;
        rangeField = getInt(a);
        winNumber = getInt(b);
        ticketPrice = getInt(c);
        jackpot = getInt(d);

        long n = 1;
        long n1 = 1;
        long x = 1;
        long x1 = 1;
        long chanse;
        long chanse1;
        for (int i = 1; i <= winNumber; i++) {
            n *= rangeField - (i - 1);
            x *= i;

        }
        System.out.println("Шанс угадать " + winNumber + " из " + winNumber
                + " при покупке 1-го лотерейного билета составляет: 1:" + (n / x));
        chanse = n / x;


        for (int i = 1; i < winNumber; i++) {
            n = 1;
            x = 1;
            for (int j = 1; j < winNumber - (i - 1); j++) {
                n *= winNumber - (j - 1);
                x *= j;
            }
            n1 *= (rangeField - winNumber) - (i - 1);
            x1 *= i;
            chanse1 = chanse / ((n / x) * (n1 / x1));
            System.out.println("Шанс угадать " + (winNumber - i) + " из " +
                    winNumber + " при покупке 1-го лотерейного билета составляет: 1:" + chanse1);

        }
        System.out.println("На сумму Джекпота: " + jackpot + " и цене лотерейного билета " + ticketPrice +
                "\n можно приобрести: " + (jackpot / ticketPrice) + " билетов.");
        System.out.println("Так же шанс выиграша в лотерею при покупке " + (jackpot / ticketPrice) + " билетов," +
                "составит 1:" + (chanse/(jackpot/ticketPrice)));


    }

    public static int getInt(String str) {
        Scanner in = new Scanner(System.in);
        String s = null;
        Pattern p = Pattern.compile("^\\d+$");
        Matcher m = null;

        for (; ; ) {
            System.out.print(str);

            s = in.nextLine();
            m = p.matcher(s);
            if (!m.matches()) {
                continue;
            }
            return Integer.parseInt(s);


        }
    }
}