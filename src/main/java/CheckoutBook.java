public class CheckoutBook {

    public boolean validateBookOption(int code) {
        ListBook listBook = new ListBook();

        for(Book book : listBook.getBookList()){
            if(code == book.getCode()){
                return true;
            }
        }
        return false;
    }

    public void checkout(int code) {
        ListBook listBook = new ListBook();

        for(Book book : listBook.getBookList()){
            if(code == book.getCode()){
                System.out.println(book.isAvailable());
                book.setAvailable(false);
                System.out.println(book.isAvailable());
            }
        }
    }
}
