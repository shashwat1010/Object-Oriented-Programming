import java.util.Scanner;

class Item {
    int itemCode;
    String itemName;
    double price;

    // Constructor
    Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    // Method to display item details
    void displayDetails() {
        System.out.println("\nItem Details:");
        System.out.println("Item Code : " + itemCode);
        System.out.println("Item Name : " + itemName);
        System.out.println("Price     : $" + price);
    }

    // Method to calculate total cost
    double calculateTotalCost(int quantity) {
        return price * quantity;
    }
}

public class InventoryTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter Item Code: ");
        int code = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Item Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Item Price: ");
        double price = sc.nextDouble();

        // Create item object
        Item item = new Item(code, name, price);

        // Display item details
        item.displayDetails();

        // Get quantity and calculate total
        System.out.print("\nEnter Quantity: ");
        int qty = sc.nextInt();

        double totalCost = item.calculateTotalCost(qty);
        System.out.println("Total Cost for " + qty + " items: $" + totalCost);
    }
}
