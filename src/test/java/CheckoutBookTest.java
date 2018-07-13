import org.hamcrest.CoreMatchers;
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

    @Test
    public void returnTrueWhenListBookAreDiferents() {
        CheckoutBook checkoutBook = new CheckoutBook();

        ListBook listBook = new ListBook();

        Book mockbook = listBook.findBookByCode(1);

        checkoutBook.checkout(mockbook.getCode(), listBook);

        MatcherAssert.assertThat(mockbook.isAvailable(), Is.is(false));

    }

    @Test
    public void returnTrueWhenMessageIsSuccessfulCheckout() {
        CheckoutBook checkoutBook = new CheckoutBook();

        MatcherAssert.assertThat(checkoutBook.successfulCheckout(), Is.is(MessageManager.SUCCESSFUL_CHECKOUT));
    }
}
