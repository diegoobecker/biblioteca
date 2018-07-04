import java.util.Scanner;


public class CheckoutBookAction implements ActionMenu {

    private Printer printer;
    private ListBook listBook;

    public CheckoutBookAction(Printer printer, ListBook listBook) {
        this.printer = printer;
        this.listBook = listBook;
    }

    @Override
    public void execute() {
        printer.print("Which is code the book? ");

        Scanner choose = new Scanner(System.in);
        // Reader.readNumberFromKeyboard
        int code = choose.nextInt();
//        Aqui fazer checkout do livro que foi digitado o código

        // DRY = dont repeat yourself

        CheckoutBook checkoutBook = new CheckoutBook();

        if(checkoutBook.validateBookOption(code, listBook)){
            checkoutBook.checkout(code, listBook);
        }

        MenuOptions.LIST_BOOK.setStatus("show");
        MenuOptions.CHECKOUT_BOOK.setStatus("hiden");
    }
}
