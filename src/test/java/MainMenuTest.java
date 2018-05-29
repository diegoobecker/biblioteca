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

    @Test
    public void menuOptionsShowed() {
        MainMenu mainMenu = new MainMenu();

        MatcherAssert.assertThat(mainMenu.showMenuOptions(), CoreMatchers.containsString("\nPlease, select menu item!"));
    }

    @Test
    public void optionSelectedIsInt() {
        MainMenu mainMenu = new MainMenu();

        MainMenu mainMenuMock = Mockito.mock(MainMenu.class);

        Mockito.when(mainMenuMock.getOptionSelected()).thenReturn(0);

        MatcherAssert.assertThat(mainMenuMock.getOptionSelected(), CoreMatchers.is(0));

    }
}
