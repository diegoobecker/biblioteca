public enum MenuOptions {
    LIST_BOOK(1, "List Books");

    private int option;
    private String description;

    MenuOptions(int option, String description) {
        this.option = option;
        this.description = description;
    }

    public static MenuOptions resolveMenuOption(int optionCode) {

        for (MenuOptions option : MenuOptions.values()) {
            if (option.getOption() == optionCode) {
                return option;
            }
        }

        throw new IllegalArgumentException("There is not option with the code: " + optionCode);
    }

    public int getOption() {
        return option;
    }

    public String getDescription() {
        return description;
    }

}
