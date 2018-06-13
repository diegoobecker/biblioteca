public class ListBookAction implements ActionMenu {

    @Override
    public void execute() {
        ListBook listBook = new ListBook();
        Converter converter = new Converter();
        Printer printer = new Printer();
        printer.print(converter.bookListToString(listBook.getBookList()));
    }
}
