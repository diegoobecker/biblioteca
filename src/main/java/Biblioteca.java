public class Biblioteca {

    private final Printer printer;

    public Biblioteca(Printer printer) {

        this.printer = printer;
    }

    public void run() {
        printer.printMessage(MessageManager.WELCOME_MESSAGE);

        BookList bookList = new BookList();

        printer.printBookList(bookList.getBookList());
    }

    public static void main(String[] args) {
        Printer printer = new Printer();

        Biblioteca biblioteca = new Biblioteca(printer);

        biblioteca.run();
    }

}
