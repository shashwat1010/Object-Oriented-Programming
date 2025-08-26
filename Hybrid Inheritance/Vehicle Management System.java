// Interface: Refuelable
interface Refuelable {
    void refuel();
}

// Superclass: Vehicle
class Vehicle {
    private String model;
    private int maxSpeed;

    public Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public void displayInfo() {
        System.out.println("Model: " + model + ", Max Speed: " + maxSpeed + " km/h");
    }
}

// Subclass: ElectricVehicle
class ElectricVehicle extends Vehicle {
    private int batteryCapacity;

    public ElectricVehicle(String model, int maxSpeed, int batteryCapacity) {
        super(model, maxSpeed);
        this.batteryCapacity = batteryCapacity;
    }

    public void charge() {
        System.out.println("Charging... Battery capacity: " + batteryCapacity + " kWh");
    }
}

// Subclass: PetrolVehicle
class PetrolVehicle extends Vehicle implements Refuelable {
    private int fuelCapacity;

    public PetrolVehicle(String model, int maxSpeed, int fuelCapacity) {
        super(model, maxSpeed);
        this.fuelCapacity = fuelCapacity;
    }

    @Override
    public void refuel() {
        System.out.println("Refueling... Fuel capacity: " + fuelCapacity + " liters");
    }
}

// Test class
public class VehicleTest {
    public static void main(String[] args) {
        ElectricVehicle tesla = new ElectricVehicle("Tesla Model 3", 250, 75);
        PetrolVehicle honda = new PetrolVehicle("Honda City", 180, 40);

        tesla.displayInfo();
        tesla.charge();

        System.out.println("------");

        honda.displayInfo();
        honda.refuel();
    }
}

