package ProductCompare;

public class Product implements Comparable<Product> {
    private int id;
    private double weight;
    private double price;

    // Constructor
    public Product(int id, double weight, double price) {
        this.id = id;
        this.weight = weight;
        this.price = price;
    }

    // Getter methods
    public int getId() {
        return id;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    // compareTo method for Comparable interface
    @Override
    public int compareTo(Product otherProduct) {
        double priceDifference = this.price - otherProduct.price;
        return Double.compare(priceDifference, 0);
    }

    // toString method for better representation
    @Override
    public String toString() {
        return "Product [id=" + id + ", weight=" + weight + ", price=" + price + "]";
    }
}
