import java.util.ArrayList;
import java.util.List;

public class BookList {

    private List<Book> bookList;

    public BookList() {
        this.bookList = new ArrayList();

        addBook(1, "Clean Code", "Robert C Martin", "2008");
        addBook(2, "Test-Driven Developement By Example", "Kent Back", "2000");

    }

    private void addBook(int codeBook ,String nameBook, String authorBook, String publisherBook) {
        Book book = new Book(codeBook, nameBook, authorBook, publisherBook);

        this.bookList.add(book);
    }

    public List<Book> getBookList() {
        return bookList;
    }

}
