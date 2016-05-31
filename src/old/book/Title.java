package old.book;

/**
 * Created by user on 16.05.2016.
 */
public class Title {
    public String title;
    public void show(){
        System.out.println("Название данной книги " + title);
    }

    public Title(String title) {
        this.title = title;
    }
}
