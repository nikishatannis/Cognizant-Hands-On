import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        Product[] products = {
                new Product(101, "Keyboard", "Electronics"),
                new Product(102, "Laptop", "Electronics"),
                new Product(103, "Mouse", "Electronics"),
                new Product(104, "Speaker", "Electronics")
        };

        // Linear Search
        int index1 = SearchAlgorithms.linearSearch(products, "Mouse");

        if (index1 != -1) {
            System.out.println("Linear Search: Product found at index " + index1);
        } else {
            System.out.println("Product not found");
        }

        // Sort array before Binary Search
        Arrays.sort(products, Comparator.comparing(p -> p.productName));

        int index2 = SearchAlgorithms.binarySearch(products, "Mouse");

        if (index2 != -1) {
            System.out.println("Binary Search: Product found at index " + index2);
        } else {
            System.out.println("Product not found");
        }
    }
}