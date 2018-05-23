public class Biblioteca {

    private final Printer printer;
    private final BookList bookList;

    public Biblioteca(Printer printer, BookList bookList) {
        this.printer = printer;
        this.bookList = bookList;
    }

    public void run() {
        printer.printMessage(MessageManager.WELCOME_MESSAGE);

//        printer.printMessage(bookList.getBookList());
    }

    public static void main(String[] args) {
        Printer printer = new Printer();
        BookList bookList = new BookList();

        Biblioteca biblioteca = new Biblioteca(printer, bookList);

        biblioteca.run();
    }

}
