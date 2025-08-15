class Vehicle {
    // Static variable common for all vehicles
    private static double registrationFee = 1500.0;

    // Final variable - registration number cannot be changed
    private final String registrationNumber;

    // Instance variables
    private String ownerName;
    private String vehicleType;

    // Constructor using 'this'
    public Vehicle(String registrationNumber, String ownerName, String vehicleType) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Static method to update registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration fee updated to: ₹" + registrationFee);
    }

    // Method to display vehicle details with instanceof check
    public void displayVehicleDetails(Object obj) {
        if (obj instanceof Vehicle) {
            Vehicle v = (Vehicle) obj;
            System.out.println("Registration Number: " + v.registrationNumber);
            System.out.println("Owner Name: " + v.ownerName);
            System.out.println("Vehicle Type: " + v.vehicleType);
            System.out.println("Registration Fee: ₹" + registrationFee);
            System.out.println("-----------------------------");
        } else {
            System.out.println("Invalid object type.");
        }
    }
}

public class VehicleRegistrationSystem {
    public static void main(String[] args) {
        // Creating vehicle objects
        Vehicle v1 = new Vehicle("HP-45-AB-1234", "Rohit Sharma", "Car");
        Vehicle v2 = new Vehicle("HP-45-CD-5678", "Neha Verma", "Bike");

        // Display vehicle details
        v1.displayVehicleDetails(v1);
        v2.displayVehicleDetails(v2);

        // Update registration fee
        Vehicle.updateRegistrationFee(2000.0);

        // Display details again after fee update
        v1.displayVehicleDetails(v1);
        v2.displayVehicleDetails(v2);
    }
}
