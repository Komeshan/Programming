import java.util.*;

class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

public class CustomerLogIn {
    static List<Product> productList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Initialize sample product data
        productList.add(new Product("Bakery Item", 2.5));
        productList.add(new Product("Beverage", 1.0));
        productList.add(new Product("Pharmacy Product", 5.0));
        productList.add(new Product("Meat", 8.0));
        productList.add(new Product("Seafood", 12.0));

        customerLogin();
    }

    static void customerLogin() {
        // You might implement actual customer authentication here
        System.out.println("Customer Login Successful!");
        viewProductList();
    }

    static void viewProductList() {
        System.out.println("Available Products:");
        for (int i = 0; i < productList.size(); i++) {
            Product product = productList.get(i);
            System.out.println((i + 1) + ". " + product.name + " (Price: " + product.price + ")");
        }
    }
}