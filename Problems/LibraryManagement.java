class Book {
    // Static variable shared by all books
    private static String libraryName = "City Central Library";

    // Final variable - ISBN cannot be changed once assigned
    private final String isbn;

    // Instance variables
    private String title;
    private String author;

    // Constructor with 'this' keyword
    public Book(String isbn, String title, String author) {
        this.isbn = isbn;       // 'this' resolves ambiguity
        this.title = title;
        this.author = author;
    }

    // Method to display book details with instanceof check
    public void displayBookDetails(Object obj) {
        if (obj instanceof Book) {
            Book b = (Book) obj;
            System.out.println("Library: " + libraryName);
            System.out.println("ISBN: " + b.isbn);
            System.out.println("Title: " + b.title);
            System.out.println("Author: " + b.author);
            System.out.println("---------------------------");
        } else {
            System.out.println("Invalid object type.");
        }
    }

    // Static method to display library name
    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Book b1 = new Book("978-0-123456-47-2", "Java Programming", "John Smith");
        Book b2 = new Book("978-1-234567-89-7", "Data Structures", "Jane Doe");

        b1.displayBookDetails(b1);
        b2.displayBookDetails(b2);

        Book.displayLibraryName();
    }
}
