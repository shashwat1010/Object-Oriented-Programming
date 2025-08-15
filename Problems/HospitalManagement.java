class Patient {
    // Static variable shared among all patients
    private static String hospitalName = "City Care Hospital";

    // Static variable to keep track of total patients
    private static int totalPatients = 0;

    // Final variable - cannot be changed after assignment
    private final String patientID;

    // Instance variables
    private String name;
    private int age;
    private String ailment;

    // Constructor using 'this'
    public Patient(String patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
    }

    // Static method to get total patients
    public static void getTotalPatients() {
        System.out.println("Total patients admitted: " + totalPatients);
    }

    // Method to display patient details with instanceof check
    public void displayPatientDetails(Object obj) {
        if (obj instanceof Patient) {
            Patient p = (Patient) obj;
            System.out.println("Hospital Name: " + hospitalName);
            System.out.println("Patient ID: " + p.patientID);
            System.out.println("Name: " + p.name);
            System.out.println("Age: " + p.age);
            System.out.println("Ailment: " + p.ailment);
            System.out.println("-----------------------------");
        } else {
            System.out.println("Invalid object type.");
        }
    }
}

public class HospitalManagementSystem {
    public static void main(String[] args) {
        // Creating patients
        Patient p1 = new Patient("P101", "Aman Gupta", 35, "Fever");
        Patient p2 = new Patient("P102", "Priya Sharma", 28, "Fracture");

        // Display details
        p1.displayPatientDetails(p1);
        p2.displayPatientDetails(p2);

        // Display total patients
        Patient.getTotalPatients();
    }
}
