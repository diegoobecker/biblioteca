public enum MenuOptions {
    LIST_BOOK(1, "List Books", "LIST_BOOK"),
    QUIT(0, "Quit", "QUIT");

    private int option;
    private String description;
    private String action;

    MenuOptions(int option, String description, String action) {
        this.option = option;
        this.description = description;
        this.action = action;
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
