public class Circle {
    private double radius;

    // Default Constructor
    public Circle() {
        this(1.0); // calling parameterized constructor
    }

    // Parameterized Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}
