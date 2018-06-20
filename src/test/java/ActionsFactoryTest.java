import org.hamcrest.MatcherAssert;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;

public class ActionsFactoryTest {

    @Test
    public void allMenuOptionsMustHaveAnAction() {
        for (MenuOptions option : MenuOptions.values()) {
            ActionMenu action = ActionsFactory.getAction(option);
            MatcherAssert.assertThat(action, is(notNullValue()));
        }
    }
}
