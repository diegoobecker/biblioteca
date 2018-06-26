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

    @Test
    public void getActionIsCalledWithParameterNull() {
        ActionsFactory.getAction(null);
    }

    @Test
    public void getActionIsCalledWithParameterInvalid() {
        MenuOptions options = MenuOptions.values()[999];
        ActionsFactory.getAction(options);
    }
}
