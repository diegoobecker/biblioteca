public class CheckoutBook {

    public boolean validateBookOption(int code, ListBook listBook) {
        Book book = listBook.findBookByCode(code);
        return !book.isInvalid();
    }

    public void checkout(int code, ListBook listBook) {
        Book book = listBook.findBookByCode(code);
        book.changeAvailability();
    }

    public String successfulCheckout() {
        return MessageManager.SUCCESSFUL_CHECKOUT;
    }
}
