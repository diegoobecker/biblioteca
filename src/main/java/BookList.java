import java.util.ArrayList;
import java.util.List;

public class BookList {

    private List<Book> list = new ArrayList<>();

    public List<Book> addBook(Book book) {

        list.add(book);

        return list;
    }
}
