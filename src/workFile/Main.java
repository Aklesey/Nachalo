package workFile;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by user on 11.06.2016.
 */
public class Main {
    public static void main(String[] args) {
       Main main = new Main();
        main.hello();
        main.operation();

    }
    public void hello(){
        System.out.println("Добрый день!");
        System.out.println("Рады приветсвовать вас в приложении которое упрастит вашу работу с файлами");
        System.out.println("Виберите из предложенного списка операцию которую желаете выполнить:");
        System.out.println();
    }

    public  boolean yesNo(){
        System.out.println("");
        return true;
    }
    public void operation(){
        System.out.println("Для создания файла введите       NEW");
        System.out.println("Для удаления файла введите       DEL");
        System.out.println("Для чтения файла введите         OPN");
        System.out.println("Для переименования файла введите REN");
        System.out.println("Для копирования файла введите    COP");
        System.out.println("Для перемещения файла введите    MOV");
        System.out.println("Для изменения файла введите      CNG");
        System.out.println("Для завершения работы программы введите EXIT");

        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

    }
    public static void write(String fileName, String text) {

        //Определяем файл

        File file = new File(fileName);

        try {
            //проверяем, что если файл не существует то создаем его
            if(!file.exists()){
                file.createNewFile();
            }

            //PrintWriter обеспечит возможности записи в файл
            PrintWriter out = new PrintWriter(file.getAbsoluteFile());

            try {
                //Записываем текст у файл
                out.print(text);
            } finally {
                //После чего мы должны закрыть файл
                //Иначе файл не запишется
                out.close();
            }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
    }



}
