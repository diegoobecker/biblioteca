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
        printer.printMessage(MessageManager.WELCOME_MESSAGE);

//        Converter converter = new Converter();
//
//        printer.printMessage(converter.bookListToString(bookList.getBookList()));

        printer.printMessage(mainMenu.showMenuOptions());

        printer.printMessage("\nOption: ");
        int option = mainMenu.optionSelected();

        mainMenu.actionAfterOptionSelected(option);

    }

    public static void main(String[] args) {
        Printer printer = new Printer();
        BookList bookList = new BookList();
        MainMenu mainMenu = new MainMenu();

        Biblioteca biblioteca = new Biblioteca(printer, bookList, mainMenu);

        biblioteca.run();
    }

}
