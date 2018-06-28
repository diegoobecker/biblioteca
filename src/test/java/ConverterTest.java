import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Test;

import java.util.Collections;
import java.util.List;

public class ConverterTest {

    @Test
    public void convertBookListToString() {
        Converter convert = new Converter();

        List<Book> fakeBooks = Collections.singletonList(new Book(1, "Fake book 1", null, null, true));

        MatcherAssert.assertThat(convert.bookListToString(fakeBooks), CoreMatchers.containsString("Fake book 1"));
    }
}