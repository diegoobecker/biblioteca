import org.hamcrest.MatcherAssert;
import org.hamcrest.core.Is;
import org.junit.Test;

public class BookTest {

    @Test
    public void returnTrueWhenBookIsInvalid() {
//        Book book = new Book(0,"","","", false);
        Book book = Book.INVALID_BOOK;

        MatcherAssert.assertThat(book.isInvalid(), Is.is(true));
    }

    @Test
    public void changeAvaliability() {
        Book book = new Book(0,"Nome", "Autor", "2018", true);

        MatcherAssert.assertThat(book.isAvailable(), Is.is(true));

        book.changeAvailability();

        MatcherAssert.assertThat(book.isAvailable(), Is.is(false));
    }
}
