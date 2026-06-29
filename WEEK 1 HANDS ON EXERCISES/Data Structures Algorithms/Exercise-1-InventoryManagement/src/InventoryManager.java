import java.util.HashMap;

public class InventoryManager {

    HashMap<Integer, Product> inventory = new HashMap<>();

    public void addProduct(Product product) {
        inventory.put(product.getProductId(), product);
        System.out.println("Product added successfully.");
    }

    public void updateProduct(int id, int quantity, double price) {

        if (inventory.containsKey(id)) {
            Product product = inventory.get(id);

            product.setQuantity(quantity);
            product.setPrice(price);

            System.out.println("Product updated successfully.");
        } else {
            System.out.println("Product not found.");
        }
    }

    public void deleteProduct(int id) {

        if (inventory.containsKey(id)) {
            inventory.remove(id);
            System.out.println("Product deleted successfully.");
        } else {
            System.out.println("Product not found.");
        }
    }

    public void displayProducts() {

        for (Product product : inventory.values()) {
            System.out.println(product);
        }
    }
}