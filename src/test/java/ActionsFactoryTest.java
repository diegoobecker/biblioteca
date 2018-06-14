import org.hamcrest.MatcherAssert;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;

public class ActionsFactoryTest {

    @Test
    public void allMenuOptionsMustHaveAnAction() {
        MenuOptions[] options = MenuOptions.values();

        for (int i = 0; i < options.length; i++) {
            MenuOptions option = options[i];

            ActionMenu action = ActionsFactory.getAction(option);
            MatcherAssert.assertThat(action, is(notNullValue()));
        }
    }
}
