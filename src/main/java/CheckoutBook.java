public class CheckoutBook {

    public boolean validateBookOption(int code, ListBook listBook) {
        Book book = listBook.findBookByCode(code);
        return !book.isInvalid();
    }

    public boolean checkout(int code, ListBook listBook) {
        Book book = listBook.findBookByCode(code);
        if(book.isAvailable() == true){
            book.changeAvailability();
            return true;
        }

        return false;
    }

    public String successfulCheckout() {
        return MessageManager.SUCCESSFUL_CHECKOUT;
    }

    public String unsuccessfulCheckout() {
        return MessageManager.UNSUCCESSFUL_CHECKOUT;
    }
}
