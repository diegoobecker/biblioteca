import org.hamcrest.MatcherAssert;
import org.hamcrest.core.Is;
import org.junit.*;

public class ListBookTest {

    @Test
    public void listBookIsNotEmpty() {
        ListBook listBook = new ListBook();

        MatcherAssert.assertThat(listBook.getBookList().isEmpty(), Is.is(false));
    }
}
