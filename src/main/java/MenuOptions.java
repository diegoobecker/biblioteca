public enum MenuOptions {
    LIST_BOOK(1, "List Books", "show"),
    INVALID_MENU_OPTION(0, "Invalid Menu Option", "hiden");

    private int option;
    private String description;
    private String status;

    MenuOptions(int option, String description, String status) {
        this.option = option;
        this.description = description;
        this.status = status;
    }

    public static MenuOptions resolveMenuOption(int optionCode) {
        for (MenuOptions option : MenuOptions.values()) {
            if (option.getOption() == optionCode) {
                return option;
            }
        }
        throw new IllegalArgumentException("There is not option with the code: " + optionCode);
    }

    public static boolean validateOption(int optionCode) {

        for (MenuOptions option : MenuOptions.values()) {
            if (option.getOption() == optionCode && option.getStatus().equalsIgnoreCase("show")) {
                return true;
            } else {
                return false;
            }
        }

        return false;
    }

    public int getOption() {
        return option;
    }

    public String getDescription() {
        return description;
    }

    public String getStatus() { return status;}

}
