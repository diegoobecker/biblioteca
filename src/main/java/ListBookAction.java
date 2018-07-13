public class ListBookAction implements ActionMenu {

    private Printer printer;
    private Converter converter;
    private ListBook listBook;

    public ListBookAction(Printer printer, Converter converter, ListBook listBook) {
        this.printer = printer;
        this.converter = converter;
        this.listBook = listBook;
    }

    @Override
    public void execute() {
        printer.print(converter.bookListToString(listBook.getBookList()));

        //ver outra maneira de fazer, pois o set pode ser passado com qualquer coisa
        MenuOptions.LIST_BOOK.setStatus("hiden");
        MenuOptions.CHECKOUT_BOOK.setStatus("show");
    }
}
