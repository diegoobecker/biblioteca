public enum MenuOptions {
    INVALID_MENU_OPTION(0, "Invalid Menu Option", "hiden"),
    LIST_BOOK(1, "List Books", "show"),
    QUIT(2, "Quit", "show");

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
            if (option.getOption() == optionCode) {
                return true;
            }
        }
        return false;
    }

    public static String getMenuOptions() {
        String menu = "\n\nPlease, select option menu item!";

        for (MenuOptions option : MenuOptions.values()) {
            if (option.getStatus().equalsIgnoreCase("show")) {
                menu += "\n" + option.getOption() + " - " + option.getDescription();
            }
        }

        return menu;
    }

    public int getOption() {
        return option;
    }

    public String getDescription() {
        return description;
    }

    public String getStatus() {
        return status;
    }

}
