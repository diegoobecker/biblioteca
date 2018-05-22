public enum MainMenuOption {
    QUIT(0),
    BOOK_LIST(1);

    private final int option;

    MainMenuOption(int option) {
        this.option = option;
    }

    public int getOption() {
        return this.option;
    }
}
