import org.hamcrest.MatcherAssert;
import org.hamcrest.core.IsNot;
import org.junit.*;
import static org.mockito.Mockito.*;

public class BookListTest {

    @Test
    public void returnTrueWhenBookAddList() {

        Book book = mock(Book.class);

        BookList booklist = new BookList();

        MatcherAssert.assertThat(booklist.addBook(book).size(), IsNot.not(0));

        ;
    }
}
