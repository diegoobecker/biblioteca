import java.util.List;

public class Converter {

    public String bookListToString(List<Book> bookList) {

        String bookListConverted = "\nCode / Name / Author / Publisher";

        for (Book book : bookList) {
            bookListConverted += book.getCode();
            bookListConverted += book.getName();
            bookListConverted += book.getAuthor();
            bookListConverted += book.getPublisher();

        }

        return bookListConverted;
    }
}
