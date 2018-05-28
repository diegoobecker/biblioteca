import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.hamcrest.core.Is;
import org.hamcrest.core.IsNot;
import org.junit.Test;

import java.util.List;

public class MainMenuTest {

    @Test
    public void menuOptionsIsNotEmpty() {
        MainMenu mainMenu = new MainMenu();

        MatcherAssert.assertThat(mainMenu.getMenuOptions().length, IsNot.not(0));
    }

    @Test
    public void menuOptionsShowed() {
        MainMenu mainMenu = new MainMenu();

//        MatcherAssert.assertThat(mainMenu.showMenuOptions(), CoreMatchers.containsString(""));
    }
}
