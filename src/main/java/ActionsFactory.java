public final class ActionsFactory {

    private ActionsFactory(){};


    public static ActionMenu getAction(MenuOptions option) {

        switch (option) {
            case LIST_BOOK:
                return new ListBookAction();

        }

        throw new IllegalStateException("There is not implemented action for option: " + option.getDescription());
    }
}