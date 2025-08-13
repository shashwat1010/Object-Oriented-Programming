import java.util.Scanner;

class Book {
    String title;
    String author;
    double price;

    // Constructor
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display details
    void displayDetails() {
        System.out.println("\nBook Details:");
        System.out.println("Title : " + title);
        System.out.println("Author: " + author);
        System.out.println("Price : $" + price);
    }
}

public class BookDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter Book Title: ");
        String title = sc.nextLine();

        System.out.print("Enter Author Name: ");
        String author = sc.nextLine();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        // Create Book object
        Book book = new Book(title, author, price);

        // Display book details
        book.displayDetails();
    }
}
