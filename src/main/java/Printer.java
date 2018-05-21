import java.util.ArrayList;
import java.util.List;

public class Printer {

    public void printMessage(String message) {

        System.out.print(message);
    }

    public void printBookList(List<Book> bookList) {
        System.out.println("\nCode - Name - Author - Publisher");
        for (Book book : bookList) {
            System.out.print(book.getCode());
            System.out.print(" - " + book.getName());
            System.out.print(" - " + book.getAuthor());
            System.out.print(" - " + book.getPublisher());
        }
    }
}
