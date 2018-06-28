public final class ActionsFactory {

    public static ActionMenu getAction(MenuOptions option) {
        if (option != null) {
            switch (option) {
                case LIST_BOOK:
                    return new ListBookAction();
                case INVALID_MENU_OPTION:
                    return new InvalidMenuOptionAction();
                case QUIT:
                    return new QuitAction();
                case CHECKOUT_BOOK:
                    return new CheckoutBookAction();
            }
        } else {
            return new InvalidMenuOptionAction();
        }
        throw new IllegalStateException("There is not implemented action for option: " + option.getDescription());
    }
}
