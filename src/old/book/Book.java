package old.book;

import java.util.Scanner;

/**
 * Created by user on 16.05.2016.
 */
public class Book {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите автора");
        Author aut = new Author(input.nextLine());
        System.out.println("Введите название");
        Title tit= new Title(input.nextLine());
        System.out.println("Введите содержание");
        Content con = new Content(input.nextLine());
        con.show();
        tit.show();
        aut.show();
    }
}
