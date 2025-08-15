class Product {
    // Static variable shared across all products
    private static double discount = 10.0; // in percentage

    // Final variable - cannot be changed after initialization
    private final int productID;

    // Instance variables
    private String productName;
    private double price;
    private int quantity;

    // Constructor using 'this'
    public Product(int productID, String productName, double price, int quantity) {
        this.productID = productID; // final variable initialized
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // Static method to update discount
    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
        System.out.println("Discount updated to " + discount + "%");
    }

    // Method to display product details with instanceof check
    public void displayProductDetails(Object obj) {
        if (obj instanceof Product) {
            Product p = (Product) obj;
            System.out.println("Product ID: " + p.productID);
            System.out.println("Product Name: " + p.productName);
            System.out.println("Price: ₹" + p.price);
            System.out.println("Quantity: " + p.quantity);
            System.out.println("Discount: " + discount + "%");
            System.out.println("Total Price after discount: ₹" + 
                (p.price * p.quantity * (1 - discount / 100)));
            System.out.println("---------------------------");
        } else {
            System.out.println("Invalid object type.");
        }
    }
}

public class ShoppingCartSystem {
    public static void main(String[] args) {
        // Creating products
        Product p1 = new Product(201, "Laptop", 55000, 1);
        Product p2 = new Product(202, "Headphones", 2000, 2);

        // Displaying product details
        p1.displayProductDetails(p1);
        p2.displayProductDetails(p2);

        // Updating discount for all products
        Product.updateDiscount(15.0);

        // Displaying again with updated discount
        p1.displayProductDetails(p1);
        p2.displayProductDetails(p2);
    }
}
