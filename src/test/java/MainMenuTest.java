import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.hamcrest.core.IsNot;
import org.junit.Test;
import org.mockito.Mockito;


public class MainMenuTest {

    @Test
    public void menuOptionsIsNotEmpty() {
        MainMenu mainMenu = new MainMenu();

        MatcherAssert.assertThat(mainMenu.getMenuOptions().length, IsNot.not(0));
    }
}
