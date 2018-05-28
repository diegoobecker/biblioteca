public enum MainMenuOptions {
    BOOK_LIST(1, "Book List");

    private int option;
    private String description;

    MainMenuOptions(int option, String description) {
        this.option = option;
        this.description = description;
    }

    public int getOption() {
        return option;
    }

    public String getDescription() {
        return description;
    }
}
