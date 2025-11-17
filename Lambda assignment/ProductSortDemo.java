import java.util.*;

class Product {
    String name;
    double price;
    double rating;
    double discount;

    Product(String name, double price, double rating, double discount) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.discount = discount;
    }
}

public class ProductSortDemo {
    public static void main(String[] args) {

        List<Product> list = Arrays.asList(
            new Product("Shoes", 2000, 4.5, 20),
            new Product("Watch", 1500, 4.2, 10),
            new Product("Bag", 1000, 4.8, 30)
        );


        list.sort((a, b) -> Double.compare(a.price, b.price));
        System.out.println("Sorted by Price");


        list.sort((a, b) -> Double.compare(b.rating, a.rating));
        System.out.println("Sorted by Rating");


        list.sort((a, b) -> Double.compare(b.discount, a.discount));
        System.out.println("Sorted by Discount");
    }
}
