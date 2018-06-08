import org.hamcrest.MatcherAssert;
import org.hamcrest.core.Is;
import org.junit.*;

public class BookListTest {

    @Test
    public void bookListIsNotEmpty() {
        ListBook booklist = new ListBook();

        MatcherAssert.assertThat(booklist.getBookList().isEmpty(), Is.is(false));
    }
}
