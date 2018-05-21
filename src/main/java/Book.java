public class Book {

    private int code;
    private String name;
    private String author;
    private String publisher;

    public Book(int code, String name, String author, String publisher) {
        this.code = code;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
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
}
