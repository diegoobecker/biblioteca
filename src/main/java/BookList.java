import java.util.ArrayList;
import java.util.List;

public class BookList {

    private List<Book> bookList;

    public BookList() {
        this.bookList = new ArrayList();

        addBook(1, "Clean Code", "Robert C Martin", "2008");
    }

    private void addBook(int codeBook ,String nameBook, String authorBook, String publisherBook) {
        Book b1 = new Book(codeBook, nameBook, authorBook, publisherBook);

        this.bookList.add(b1);
    }

    public List<Book> getBookList() {
        return bookList;
    }

}
