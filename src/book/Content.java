package book;

/**
 * Created by user on 16.05.2016.
 */
public class Content {
    public String content;
    public void show () {

        System.out.println("Содержание данной книги " + content);
    }

    public Content(String content) {
        this.content = content;
    }
}
