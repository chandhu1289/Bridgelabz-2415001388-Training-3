class CartItem {
    String itemName;
    double price;
    int quantity;

    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    void addItem(int qty) {
        quantity += qty;
        System.out.println(qty + " " + itemName + "(s) added to cart.");
    }

    void removeItem(int qty) {
        if (qty <= quantity) {
            quantity -= qty;
            System.out.println(qty + " " + itemName + "(s) removed from cart.");
        } else {
            System.out.println("Not enough quantity to remove!");
        }
    }

    void displayTotalCost() {
        double total = price * quantity;
        System.out.println("Item: " + itemName);
        System.out.println("Price: ₹" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: ₹" + total);
    }

    public static void main(String[] args) {
        CartItem item = new CartItem("Laptop", 55000, 1);
        item.addItem(1);
        item.removeItem(1);
        item.displayTotalCost();
    }
}
