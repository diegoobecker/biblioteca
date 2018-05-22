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
        Book b1 = new Book(codeBook, nameBook, authorBook, publisherBook);

        this.bookList.add(b1);
    }

    public String getAllBookListAsString() {

        String bookList = "";

        bookList += "\nCode / Name / Author / Publisher";

        for (Book book : this.bookList) {
            bookList += "\n" + book.getCode();
            bookList += " / " + book.getName();
            bookList += " / " + book.getAuthor();
            bookList += " / " + book.getPublisher();
        }
        return bookList;
    }

}
