public class LibraryBook {
    private String title;
    private String author;
    private double price;
    private boolean available;

    public LibraryBook(String title, String author, double price, boolean available) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
    }

    public boolean borrowBook() {
        if (available) {
            available = false;
            System.out.println(title + " borrowed successfully.");
            return true;
        } else {
            System.out.println(title + " is already borrowed.");
            return false;
        }
    }
}
