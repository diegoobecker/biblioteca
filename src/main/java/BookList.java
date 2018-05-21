import java.util.ArrayList;
import java.util.List;

public class BookList {

    private List<Book> bookList;

    public BookList() {
        this.bookList = new ArrayList();

        addBook("Java Prático");
        addBook("Clean Code");
        addBook("Test-Driven Developement");

    }

    private void addBook(String bookName) {
        Book b1 = new Book();

        b1.setName(bookName);

        this.bookList.add(b1);
    }

    public List<Book> getBookList() {
        return bookList;
    }


}
