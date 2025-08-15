class Student {
    // Static variable shared across all students
    private static String universityName = "Himalayan University";
    private static int totalStudents = 0;

    // Final variable - roll number cannot be changed
    private final int rollNumber;

    // Instance variables
    private String name;
    private char grade;

    // Constructor using 'this'
    public Student(int rollNumber, String name, char grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
        totalStudents++;
    }

    // Static method to display total students
    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    // Method to display student details with instanceof check
    public void displayStudentDetails(Object obj) {
        if (obj instanceof Student) {
            Student s = (Student) obj;
            System.out.println("University: " + universityName);
            System.out.println("Roll Number: " + s.rollNumber);
            System.out.println("Name: " + s.name);
            System.out.println("Grade: " + s.grade);
            System.out.println("---------------------------");
        } else {
            System.out.println("Invalid object type.");
        }
    }

    // Method to update grade (only if the object is a Student)
    public void updateGrade(Object obj, char newGrade) {
        if (obj instanceof Student) {
            Student s = (Student) obj;
            s.grade = newGrade;
            System.out.println("Grade updated for Roll No " + s.rollNumber + " to " + newGrade);
        } else {
            System.out.println("Invalid object type for grade update.");
        }
    }
}

public class UniversityStudentManagement {
    public static void main(String[] args) {
        // Creating students
        Student st1 = new Student(101, "Amit Kumar", 'A');
        Student st2 = new Student(102, "Priya Sharma", 'B');

        // Display details
        st1.displayStudentDetails(st1);
        st2.displayStudentDetails(st2);

        // Update a grade
        st1.updateGrade(st1, 'A');

        // Display again
        st1.displayStudentDetails(st1);

        // Show total students
        Student.displayTotalStudents();
    }
}
