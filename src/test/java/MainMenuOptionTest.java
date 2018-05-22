import org.hamcrest.MatcherAssert;
import org.hamcrest.core.Is;
import org.junit.Test;

public class MainMenuOptionTest {

    @Test
    public void bookListOptionSelected() {
        MainMenuOption mainMenuOption = MainMenuOption.BOOK_LIST;

        MatcherAssert.assertThat(mainMenuOption.getOption(), Is.is(1));
    }
}
