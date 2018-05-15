import org.hamcrest.MatcherAssert;
import org.hamcrest.core.Is;
import org.junit.Test;

public class BibliotecaTest {

    @Test
    public void returnMessageWelcome() {
        Biblioteca biblioteca = new Biblioteca();

        MatcherAssert.assertThat(biblioteca.welcome(), Is.is("Welcome Biblioteca"));
    }
}
