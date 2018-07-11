import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;
import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.hamcrest.core.Is;
import org.hamcrest.core.IsEqual;
import org.hamcrest.core.IsInstanceOf;
import org.junit.*;

public class ListBookTest {

    private ListBook listBook;

    @Before
    public void init() {
        listBook = new ListBook();
    }

    @Test
    public void listBookIsNotEmpty() {
        MatcherAssert.assertThat(listBook.getBookList().isEmpty(), Is.is(false));
    }

    @Test
    public void returnBookToValidCode() {
        //como deixar o codigo flexivel
        MatcherAssert.assertThat(listBook.findBookByCode(1), IsInstanceOf.any(Book.class));
    }

    @Test
    public void returnBookInvalidToInvalidCode() {
        //como deixar o codigo flexivel
        MatcherAssert.assertThat(listBook.findBookByCode(3), IsEqual.equalTo(Book.INVALID_BOOK));
    }
}
