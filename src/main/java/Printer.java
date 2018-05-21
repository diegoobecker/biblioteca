import java.util.ArrayList;
import java.util.List;

public class Printer {

    public void printMessage(String message) {

        System.out.print(message);
    }

    public void printBookList(List<Book> bookList) {

        for (Book book : bookList) {
            System.out.print("\n" + book.getName());
        }
    }
}
