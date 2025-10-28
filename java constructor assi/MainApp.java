class CarRental {
    String customerName;
    String carModel;
    int rentalDays;

    // Default Constructor
    CarRental() {
        customerName = "Unknown";
        carModel = "Generic";
        rentalDays = 1;
    }

    // Parameterized Constructor
    CarRental(String c, String m, int d) {
        customerName = c;
        carModel = m;
        rentalDays = d;
    }

    double calculateTotalCost() {
        double ratePerDay = 1000.0; // fixed rate
        return ratePerDay * rentalDays;
    }

    void display() {
        System.out.println("Customer: " + customerName + ", Car: " + carModel + ", Days: " + rentalDays + 
                           ", Total Cost: ₹" + calculateTotalCost());
    }
}