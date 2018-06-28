public class Book {

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

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
