// Base Class
class Course {
    String courseName;
    int duration; // in weeks

    Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    void displayDetails() {
        System.out.println("Course: " + courseName + ", Duration: " + duration + " weeks");
    }
}

// First Level Subclass
class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;

    OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Platform: " + platform + ", Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}

// Second Level Subclass
class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount;

    PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    double getFinalFee() {
        return fee - (fee * discount / 100);
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Fee: " + fee + ", Discount: " + discount + "%, Final Fee: " + getFinalFee());
    }
}

// Main Class
public class CourseHierarchy {
    public static void main(String[] args) {
        Course course = new Course("Basic Programming", 6);
        OnlineCourse online = new OnlineCourse("Data Structures", 8, "Coursera", true);
        PaidOnlineCourse paid = new PaidOnlineCourse("Machine Learning", 12, "Udemy", true, 5000, 20);

        course.displayDetails();
        System.out.println("-------------------------");

        online.displayDetails();
        System.out.println("-------------------------");

        paid.displayDetails();
    }
}
