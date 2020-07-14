import java.util.ArrayList;

public class View {
    public void viewBook(Book book){
        System.out.println(book);
    }
    public void viewListBook(ArrayList<Book> list){
        for (Book book:list) {
            System.out.println(book);
        }
    }
}
