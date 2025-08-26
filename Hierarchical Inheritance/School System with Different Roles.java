// Superclass
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Subclass 1
class Teacher extends Person {
    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    void displayRole() {
        System.out.println("Role: Teacher");
        System.out.println("Subject: " + subject);
    }
}

// Subclass 2
class Student extends Person {
    String grade;

    Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    void displayRole() {
        System.out.println("Role: Student");
        System.out.println("Grade: " + grade);
    }
}

// Subclass 3
class Staff extends Person {
    String position;

    Staff(String name, int age, String position) {
        super(name, age);
        this.position = position;
    }

    void displayRole() {
        System.out.println("Role: Staff");
        System.out.println("Position: " + position);
    }
}

// Main Class
public class SchoolSystem {
    public static void main(String[] args) {
        Teacher t = new Teacher("Mr. Sharma", 40, "Mathematics");
        Student s = new Student("Rohit", 16, "10th Grade");
        Staff st = new Staff("Anita", 35, "Librarian");

        t.displayDetails();
        t.displayRole();
        System.out.println("-------------------------");

        s.displayDetails();
        s.displayRole();
        System.out.println("-------------------------");

        st.displayDetails();
        st.displayRole();
    }
}
