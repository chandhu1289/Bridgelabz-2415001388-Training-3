class Circle {
    double radius;

    // Default Constructor
    Circle() {
        this(1.0); // calling parameterized constructor
    }

    // Parameterized Constructor
    Circle(double r) {
        radius = r;
    }

    double area() {
        return Math.PI * radius * radius;
    }
}