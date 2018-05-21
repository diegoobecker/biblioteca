import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.hamcrest.core.Is;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class PrinterTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(System.out);
    }

    @Test
    public void printMessage() {
        Printer printer = new Printer();

        printer.printMessage("Some Message");

        MatcherAssert.assertThat(outContent.toString(), Is.is("Some Message"));
    }

    @Test
    public void printBookList() {
        BookList bookList = new BookList();

        Printer printer = new Printer();

        printer.printBookList(bookList.getBookList());

        MatcherAssert.assertThat(outContent.toString(), CoreMatchers.containsString("Clean Code"));
    }
}
