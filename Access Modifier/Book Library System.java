// Base Class
public class Book {
    public String ISBN;
    protected String title;
    private String author;

    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Public getter & setter for author
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

// Subclass
class EBook extends Book {
    public EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    public void displayBookInfo() {
        // Can access public ISBN
        System.out.println("ISBN: " + ISBN);
        // Can access protected title
        System.out.println("Title: " + title);
        // Cannot access private author directly
        System.out.println("Author: " + getAuthor());
    }
}
