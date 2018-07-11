import java.util.ArrayList;
import java.util.List;

public class ListBook {

    private List<Book> listBook;

    public ListBook() {
        this.listBook = new ArrayList();

        addBook(1, "Clean Code", "Robert C Martin", "2008", true);
        addBook(2, "Test-Driven Developement By Example", "Kent Back", "2000", true);
    }

    private void addBook(int codeBook ,String nameBook, String authorBook, String publisherBook, boolean availableBook) {
        Book book = new Book(codeBook, nameBook, authorBook, publisherBook, availableBook);

        this.listBook.add(book);
    }

    public List<Book> getBookList() {
        return listBook;
    }

    public Book findBookByCode(int code) {
        return listBook.stream()
                .filter(book -> book.getCode() == code)
                .findFirst()
                .orElse(Book.INVALID_BOOK);
    }

}
