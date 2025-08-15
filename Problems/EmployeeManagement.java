class Employee {
    // Static variable shared across all employees
    private static String companyName = "Tech Innovators Pvt. Ltd.";
    private static int totalEmployees = 0;

    // Final variable - ID cannot be changed once assigned
    private final int id;

    // Instance variables
    private String name;
    private String designation;

    // Constructor using 'this'
    public Employee(int id, String name, String designation) {
        this.id = id;                 // final variable initialization
        this.name = name;
        this.designation = designation;
        totalEmployees++;             // increment total employees count
    }

    // Method to display employee details with instanceof check
    public void displayEmployeeDetails(Object obj) {
        if (obj instanceof Employee) {
            Employee emp = (Employee) obj;
            System.out.println("Company: " + companyName);
            System.out.println("Employee ID: " + emp.id);
            System.out.println("Name: " + emp.name);
            System.out.println("Designation: " + emp.designation);
            System.out.println("---------------------------");
        } else {
            System.out.println("Invalid object type.");
        }
    }

    // Static method to display total employees
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Ravi Kumar", "Software Engineer");
        Employee e2 = new Employee(102, "Priya Sharma", "Project Manager");

        e1.displayEmployeeDetails(e1);
        e2.displayEmployeeDetails(e2);

        Employee.displayTotalEmployees();
    }
}
