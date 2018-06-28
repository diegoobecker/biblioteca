import java.util.Scanner;

public class CheckoutBookAction implements ActionMenu {
    @Override
    public void execute() {
        CheckoutBook checkoutBook = new CheckoutBook();
        System.out.print("Which is code the book?");
        Scanner choose = new Scanner(System.in);
        int code = choose.nextInt();
//        Aqui fazer checkout do livro que foi digitado o código

        if(checkoutBook.validateBookOption(code)){
            checkoutBook.checkout(code);
        }

        MenuOptions.LIST_BOOK.setStatus("show");
        MenuOptions.CHECKOUT_BOOK.setStatus("hiden");
    }
}
