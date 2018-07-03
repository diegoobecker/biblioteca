import java.util.List;

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

//    public void checkout(List<Book> books, int code) {
        public void checkout(int code, ListBook listBook) {
//            ListBook listBook = new ListBook();

            for(Book book : listBook.getBookList()){
            if(code == book.getCode()){
                System.out.println(listBook);
                System.out.println(book.isAvailable());
//                Book checkoutBook = new Book(book.getCode(), book.getName(), book.getAuthor(), book.getPublisher(), false);
//
//                books.remove(book);
//                books.add(checkoutBook);
//
//                book.setAvailable("bananas");
                book.changeAvailability();
                System.out.println(book.isAvailable());
            }
        }
    }
}
