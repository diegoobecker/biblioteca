
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

        Biblioteca biblioteca = new Biblioteca(printerMock, bookListMock);

        biblioteca.run();

        Mockito.verify(printerMock).printMessage("Welcome Biblioteca");
    }

//    @Test
//    public void printBooks() {
//        Printer printerMock = mock(Printer.class);
//
//        BookList bookListMock = mock(BookList.class);
//        when(bookListMock.getAllBookListAsString()).thenReturn("\nFake Book 1\nFake Book 2");
//
////        List<Book> fakeBooks = Collections.singletonList(new Book(1, "Fake book 1", null, null));
////        when(bookListMock.getBooks()).thenReturn(fakeBooks);
//
//        Biblioteca biblioteca = new Biblioteca(printerMock, bookListMock);
//
//        biblioteca.run();
//
//        Mockito.verify(printerMock).printMessage("\nFake Book 1\nFake Book 2");
//    }
}
