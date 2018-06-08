
import org.junit.*;
import org.mockito.Mockito;

import static org.mockito.Mockito.mock;


public class BibliotecaTest {

    @Test
    public void printWelcomeMessage() {

        Printer printerMock = mock(Printer.class);
        MainMenu mainMenu = mock(MainMenu.class);

        Biblioteca biblioteca = new Biblioteca(printerMock, mainMenu);

        biblioteca.run();

        Mockito.verify(printerMock).print("Welcome Biblioteca");
    }
}
