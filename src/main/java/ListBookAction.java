public class ListBookAction implements ActionMenu {

    @Override
    public void execute() {
        ListBook listBook = new ListBook();
        Converter converter = new Converter();
        System.out.println(converter.bookListToString(listBook.getBookList()));
    }
}
