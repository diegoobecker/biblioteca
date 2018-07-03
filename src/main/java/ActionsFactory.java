public final class ActionsFactory {

    private static final Printer printer = new Printer();
    private static final Converter converter = new Converter();

    private static final ListBook listBook = new ListBook();

    public static ActionMenu getAction(MenuOptions option) {
        if (option != null) {
            switch (option) {
                case LIST_BOOK:
                    return new ListBookAction(printer, converter, listBook);
                case INVALID_MENU_OPTION:
                    return new InvalidMenuOptionAction(printer);
                case QUIT:
                    return new QuitAction();
                case CHECKOUT_BOOK:
                    return new CheckoutBookAction(printer, listBook);
            }
        } else {
            return new InvalidMenuOptionAction(printer);
        }
        throw new IllegalStateException("There is not implemented action for option: " + option.getDescription());
    }
}
