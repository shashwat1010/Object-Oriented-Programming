// Superclass
class Device {
    String deviceId;
    String status;

    Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
    }
}

// Subclass
class Thermostat extends Device {
    int temperatureSetting;

    Thermostat(String deviceId, String status, int temperatureSetting) {
        super(deviceId, status); // call to Device constructor
        this.temperatureSetting = temperatureSetting;
    }

    @Override
    void displayStatus() {
        super.displayStatus(); // show device info
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}

// Main Class
public class SmartHomeSystem {
    public static void main(String[] args) {
        Thermostat thermostat = new Thermostat("T1001", "ON", 24);

        thermostat.displayStatus();
    }
}

