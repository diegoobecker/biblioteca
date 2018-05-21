
import org.junit.*;
import org.mockito.Mockito;

import static org.mockito.Mockito.mock;


public class BibliotecaTest {

    @Test
    public void printsWelcomeMessage() {

        Printer printerMock = mock(Printer.class);

        Biblioteca biblioteca = new Biblioteca(printerMock);

        biblioteca.run();

        Mockito.verify(printerMock).printMessage("Welcome Biblioteca");
    }
}
