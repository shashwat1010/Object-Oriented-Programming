// Base Class
public class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public method to modify salary
    public void updateSalary(double newSalary) {
        if (newSalary > 0) {
            this.salary = newSalary;
            System.out.println("Salary updated to: " + salary);
        }
    }

    public double getSalary() {
        return salary;
    }
}

// Subclass
class Manager extends Employee {
    public Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    public void displayEmployeeDetails() {
        // Can access public employeeID
        System.out.println("Employee ID: " + employeeID);
        // Can access protected department
        System.out.println("Department: " + department);
        // Cannot access private salary directly
        System.out.println("Salary: " + getSalary());
    }
}
