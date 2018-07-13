import java.util.InputMismatchException;
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
        int code = 0;
        CheckoutBook checkoutBook = new CheckoutBook();

        // Reader.readNumberFromKeyboard

        printer.print("\nWhich is code the book? ");

        Scanner choose = new Scanner(System.in);

        try {
            code = choose.nextInt();
        } catch (InputMismatchException e) {
            printer.print(checkoutBook.unsuccessfulCheckout());
            execute();
        }

        if(checkoutBook.validateBookOption(code, listBook)){
            if(checkoutBook.checkout(code, listBook)){
                printer.print(checkoutBook.successfulCheckout());
                MenuOptions.LIST_BOOK.setStatus("show");
                MenuOptions.CHECKOUT_BOOK.setStatus("hiden");
            } else {
                printer.print(checkoutBook.unsuccessfulCheckout());
                execute();
            }

        } else {
            printer.print(checkoutBook.unsuccessfulCheckout());
            execute();
        }
    }
}
