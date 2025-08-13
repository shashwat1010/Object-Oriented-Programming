import java.util.Scanner;

class MobilePhone {
    String brand;
    String model;
    double price;

    // Constructor
    MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display details
    void displayDetails() {
        System.out.println("\nMobile Phone Details:");
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Price : $" + price);
    }
}

public class MobilePhoneDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter Mobile Brand: ");
        String brand = sc.nextLine();

        System.out.print("Enter Mobile Model: ");
        String model = sc.nextLine();

        System.out.print("Enter Mobile Price: ");
        double price = sc.nextDouble();

        // Creating MobilePhone object
        MobilePhone phone = new MobilePhone(brand, model, price);

        // Display phone details
        phone.displayDetails();
    }
}
