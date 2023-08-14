package ProductManagementApp;

public class Product {

    private String name;
    private String description;
    private String SKU;
    private double price;

   
	public Product(String name, String description, String SKU, double price) {
        this.name = name;
        this.description = description;
        this.SKU = SKU;
        this.price = price;
    }

    // Getters and setters for attributes

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getSKU() {
        return SKU;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", SKU='" + SKU + '\'' +
                ", price=" + price +
                '}';
    }

}
