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
        CheckoutBook checkoutBook = new CheckoutBook();

        // Reader.readNumberFromKeyboard

        printer.print("Which is code the book? ");

        Scanner choose = new Scanner(System.in);

        int code = choose.nextInt();


        if(checkoutBook.validateBookOption(code, listBook)){
            checkoutBook.checkout(code, listBook);
            printer.print(checkoutBook.successfulCheckout());
            MenuOptions.LIST_BOOK.setStatus("show");
            MenuOptions.CHECKOUT_BOOK.setStatus("hiden");
        } else {
            printer.print(checkoutBook.unsuccessfulCheckout());
            execute();
        }
    }

    private int getOption() {



        printer.print("Which is code the book? ");

        Scanner choose = new Scanner(System.in);

        return choose.nextInt();
    }
}
