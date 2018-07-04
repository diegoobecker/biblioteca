import org.hamcrest.MatcherAssert;
import org.hamcrest.core.Is;
import org.junit.Test;

public class CheckoutBookTest {

    @Test
    public void validateBookOption() {
        CheckoutBook checkoutBook = new CheckoutBook();
        ListBook listBook = new ListBook();

        MatcherAssert.assertThat(checkoutBook.validateBookOption(1, listBook), Is.is(true));
    }
}
