// Superclass
class Book {
    String title;
    int publicationYear;

    Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}

// Subclass
class Author extends Book {
    String name;
    String bio;

    Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear); // call to Book constructor
        this.name = name;
        this.bio = bio;
    }

    @Override
    void displayInfo() {
        super.displayInfo(); // show book info
        System.out.println("Author Name: " + name);
        System.out.println("Author Bio: " + bio);
    }
}

// Main Class
public class LibraryManagement {
    public static void main(String[] args) {
        Author bookWithAuthor = new Author(
            "The Great Gatsby", 
            1925, 
            "F. Scott Fitzgerald", 
            "American novelist widely regarded as one of the greatest writers of the 20th century."
        );

        bookWithAuthor.displayInfo();
    }
}
