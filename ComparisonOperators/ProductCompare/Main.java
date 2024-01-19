package ProductCompare;

public class Main {
    public static void main(String[] args) {
        // Creating products
        Product product1 = new Product(1, 2.5, 15.99);
        Product product2 = new Product(2, 1.8, 10.99);
        Product product3 = new Product(3, 3.2, 25.99);

        // Comparing products based on price
        int comparisonResult = product1.compareTo(product2);

        // Displaying the comparison result
        if (comparisonResult < 0) {
            System.out.println(product1 + " is cheaper than " + product2);
        } else if (comparisonResult > 0) {
            System.out.println(product1 + " is more expensive than " + product2);
        } else {
            System.out.println(product1 + " has the same price as " + product2);
        }
    }
}
