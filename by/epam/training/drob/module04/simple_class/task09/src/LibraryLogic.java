import java.util.ArrayList;

public class LibraryLogic {
    public ArrayList<Book> searchByAuthor(Library library, String author) {
        ArrayList<Book> sortedList = new ArrayList<>();
        for (Book book : library.getListOfBooks()) {
            if (book.getAuthor().equals(author)) {
                sortedList.add(book);
            }
        }
        return sortedList;
    }

    public ArrayList<Book> searchByYear(Library library, int year) {  // список книг, выпущенных после заданного года.
        ArrayList<Book> sortedList = new ArrayList<>();
        for (Book book : library.getListOfBooks()) {
            if (book.getYear() > year) {
                sortedList.add(book);
            }
        }
        return sortedList;
    }

    public ArrayList<Book> searchByPublishingHouse(Library library, String publishingHouse) {  //  список книг, выпущенных заданным издательством;
        ArrayList<Book> sortedList = new ArrayList<>();
        for (Book book : library.getListOfBooks()) {
            if (book.getPublishingHouse().equals(publishingHouse)) {
                sortedList.add(book);
            }
        }
        return sortedList;
    }
}
