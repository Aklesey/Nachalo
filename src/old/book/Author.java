package old.book;

/**
 * Created by user on 16.05.2016.
 */
public class Author {
    public String autor;

    public Author(String autor) {
        this.autor = autor;
    }
     public void show(){
        System.out.println("Автором данной книги является " + autor);
    }
}
