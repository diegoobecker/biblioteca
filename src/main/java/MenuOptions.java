public enum MenuOptions {
    LIST_BOOK(1, "List Books", "LIST_BOOK");

    private int option;
    private String description;
    private String action;

    MenuOptions(int option, String description, String action) {
        this.option = option;
        this.description = description;
        this.action = action;
    }

    public static MenuOptions resolveMenuOption(int optionCode) {

        for (MenuOptions option : MenuOptions.values()) {
            if (option.getOption() == optionCode) {
                return option;
            }
        }

        throw new IllegalArgumentException("Nao existe Option com o codigo: " + optionCode);
    }

    public int getOption() {
        return option;
    }

    public String getDescription() {
        return description;
    }

    public String getAction() {
        return action;
    }
}
