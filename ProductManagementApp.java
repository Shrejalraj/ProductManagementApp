package ProductManagementApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManagementApp {
	private List<Product> products;
    private Scanner scanner;

    public ProductManagementApp() {
        products = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void addProduct() {
        System.out.println("Adding a new product:");
        System.out.print("Enter product name: ");
        String name = scanner.nextLine();

        System.out.print("Enter product description: ");
        String description = scanner.nextLine();

        System.out.print("Enter product SKU: ");
        String SKU = scanner.nextLine();

        System.out.print("Enter product price: ");
        double price = scanner.nextDouble();

        Product product = new Product(name, description, SKU, price);
        products.add(product);

        System.out.println("Product added successfully!");
    }

    public void deleteProduct() {
        System.out.println("Deleting a product:");
        System.out.print("Enter product SKU to delete: ");
        String SKU = scanner.nextLine();

        Product productToRemove = null;
        for (Product product : products) {
            if (product.getSKU().equals(SKU)) {
                productToRemove = product;
                break;
            }
        }

        if (productToRemove != null) {
            products.remove(productToRemove);
            System.out.println("Product deleted successfully!");
        } else {
            System.out.println("Product not found with the given SKU.");
        }
    }

    public void displayProducts() {
        System.out.println("Products List:");
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public void start() {
        boolean exit = false;

        while (!exit) {
            System.out.println("\nProduct Management App");
            System.out.println("1. Add Product");
            System.out.println("2. Delete Product");
            System.out.println("3. Display Products");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    deleteProduct();
                    break;
                case 3:
                    displayProducts();
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }

    public void close() {
        scanner.close();
        System.out.println("Exiting the application.");
    }

}
