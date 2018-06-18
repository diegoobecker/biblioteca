import org.hamcrest.MatcherAssert;
import org.hamcrest.core.Is;
import org.junit.Test;

public class MenuOptionsTest {

    @Test
    public void resolveMenuOptionReturnEnumOption() {

        MatcherAssert.assertThat(MenuOptions.resolveMenuOption(1), Is.is(MenuOptions.LIST_BOOK));
    }

    @Test
    public void validateOptionReturnTrueWhenMenuOptionsIsValid() {

        MatcherAssert.assertThat(MenuOptions.validateOption(1), Is.is(true));
    }
}
