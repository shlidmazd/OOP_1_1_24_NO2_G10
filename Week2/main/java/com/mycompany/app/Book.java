package Week2.main.java.com.mycompany.app;


public class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Sách [Tiêu đề: " + title + ", Tác giả: " + author + "]";
    }
}
