
import org.junit.*;
import org.mockito.Mockito;

import java.util.Collections;
import java.util.List;

import static java.util.Collections.emptyList;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class BibliotecaTest {

    @Test
    public void printWelcomeMessage() {

        Printer printerMock = mock(Printer.class);
        BookList bookListMock = mock(BookList.class);
        MainMenu mainMenu = mock(MainMenu.class);

        Biblioteca biblioteca = new Biblioteca(printerMock, bookListMock, mainMenu);

        biblioteca.run();

        Mockito.verify(printerMock).printMessage("Welcome Biblioteca");
    }
}
