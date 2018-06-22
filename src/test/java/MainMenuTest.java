import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.hamcrest.core.IsNot;
import org.junit.Test;
import org.mockito.Mockito;


public class MainMenuTest {
    @Test
    public void getMenuOptionsIsNotEmpty() {
        Printer printer = new Printer();
        MainMenu mainMenu = new MainMenu(printer);

        MatcherAssert.assertThat(MenuOptions.getMenuOptions(), IsNot.not(""));
    }

//    @Test
//    public void getMenuOptionsWasCalled() {
//        MainMenu mainMenuMock = Mockito.mock(MainMenu.class);
//
//        Mockito.when(mainMenuMock.getMenuOptions()).thenReturn("A");
//
//        Mockito.verify(mainMenuMock, Mockito.never()).getMenuOptions();
//    }

//    @Test
//    public void getMenuOptionsReturnStringMenu() {
//        Printer printer = new Printer();
//        MainMenu mainMenu = new MainMenu(printer);
//
//        MatcherAssert.assertThat(mainMenu.getMenuOptions(), CoreMatchers.containsString("\nPlease, select option menu item!"));
//    }

    @Test
    public void getChosenOptionWasCalled() {
        MainMenu mainMenuMock = Mockito.mock(MainMenu.class);

        Mockito.when(mainMenuMock.getChosenOption()).thenReturn(0);

        Mockito.verify(mainMenuMock, Mockito.never()).getChosenOption();
    }
}
