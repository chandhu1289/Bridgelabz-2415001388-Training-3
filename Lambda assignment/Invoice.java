
class Invoice {
    String transactionId;

    Invoice(String transactionId) {
        this.transactionId = transactionId;
        System.out.println("Invoice Created for: " + transactionId);
    }
}

