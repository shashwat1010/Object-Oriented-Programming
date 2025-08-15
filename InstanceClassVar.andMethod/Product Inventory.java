public class Product {
    private String productName;
    private double price;
    private static int totalProducts = 0; // class variable

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; // increment whenever a new product is created
    }

    // Instance Method
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
    }

    // Class Method
    public static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }
}
