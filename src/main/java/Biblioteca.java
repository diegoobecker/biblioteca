public class Biblioteca {

    private final Printer printer;
    private final BookList bookList;
    private final MainMenu mainMenu;

    public Biblioteca(Printer printer, BookList bookList, MainMenu mainMenu) {
        this.printer = printer;
        this.bookList = bookList;
        this.mainMenu = mainMenu;
    }

    public void run() {
        printer.print(MessageManager.WELCOME_MESSAGE);

//        printer.print(mainMenu.showMenuOptions());
        mainMenu.showMenuOptions(printer);

        mainMenu.actionMenu(printer);
    }

    public static void main(String[] args) {
        Printer printer = new Printer();
        BookList bookList = new BookList();
        MainMenu mainMenu = new MainMenu();

        Biblioteca biblioteca = new Biblioteca(printer, bookList, mainMenu);

        biblioteca.run();
    }

}
