public class Book {

    public static final Book INVALID_BOOK = new Book(0, "", "", "", false);

    private int code;
    private String name;
    private String author;
    private String publisher;
    private boolean available;

    public Book(int code, String name, String author, String publisher, boolean available) {
        this.code = code;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.available = available;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public boolean isAvailable() {
        return available;
    }

    public boolean isInvalid() {
        return this.equals(INVALID_BOOK);
    }

    public void changeAvailability() {
        this.available = !this.available;
    }


}
