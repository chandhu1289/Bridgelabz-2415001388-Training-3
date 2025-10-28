// Problem 1: Product Inventory
class Product {
    String productName;
    double price;
    static int totalProducts = 0; // Class variable (shared among all objects)

    // Constructor
    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; // Increment total count whenever a new product is created
    }

    // Instance Method
    void displayProductDetails() {
        System.out.println("Product Name: " + productName + ", Price: ₹" + price);
    }

    // Class Method
    static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }
}
// Problem 2: Online Course Management
class Course {
    String courseName;
    int duration; // in months
    double fee;
    static String instituteName = "ABC Institute"; // Common for all courses

    // Constructor
    Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance Method
    void displayCourseDetails() {
        System.out.println("Course: " + courseName + 
                           ", Duration: " + duration + " months" + 
                           ", Fee: ₹" + fee + 
                           ", Institute: " + instituteName);
    }

    // Class Method
    static void updateInstituteName(String newName) {
        instituteName = newName;
        System.out.println("Institute name updated to: " + instituteName);
    }
}
// Problem 3: Vehicle Registration
class Vehicle {
    String ownerName;
    String vehicleType;
    static double registrationFee = 5000.0; // Common for all vehicles

    // Constructor
    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance Method
    void displayVehicleDetails() {
        System.out.println("Owner: " + ownerName + 
                           ", Vehicle Type: " + vehicleType + 
                           ", Registration Fee: ₹" + registrationFee);
    }

    // Class Method
    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration fee updated to ₹" + registrationFee);
    }
}


// MAIN CLASS

public class Main {
    public static void main(String[] args) {

        System.out.println("===== Problem 1: Product Inventory =====");
        Product p1 = new Product("Laptop", 55000);
        Product p2 = new Product("Mobile", 20000);
        p1.displayProductDetails();
        p2.displayProductDetails();
        Product.displayTotalProducts();

        System.out.println("\n===== Problem 2: Online Course Management =====");
        Course c1 = new Course("Java Programming", 3, 15000);
        Course c2 = new Course("Python Basics", 2, 12000);
        c1.displayCourseDetails();
        c2.displayCourseDetails();
        Course.updateInstituteName("XYZ Academy");
        c1.displayCourseDetails();

        System.out.println("\n===== Problem 3: Vehicle Registration =====");
        Vehicle v1 = new Vehicle("Ravi Kumar", "Car");
        Vehicle v2 = new Vehicle("Priya Sharma", "Bike");
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
        Vehicle.updateRegistrationFee(6000);
        v1.displayVehicleDetails();
    }
}
