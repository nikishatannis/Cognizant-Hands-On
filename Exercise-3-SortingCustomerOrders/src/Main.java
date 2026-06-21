public class Main {

    public static void main(String[] args) {

        Order[] orders = {
                new Order(101, "Alice", 4500),
                new Order(102, "Bob", 2000),
                new Order(103, "Charlie", 7000),
                new Order(104, "David", 3500)
        };

        System.out.println("Before Sorting:");

        for (Order order : orders) {
            System.out.println(order);
        }

        // Bubble Sort
        SortingAlgorithms.bubbleSort(orders);

        System.out.println("\nAfter Bubble Sort:");

        for (Order order : orders) {
            System.out.println(order);
        }

        // Quick Sort
        SortingAlgorithms.quickSort(orders, 0, orders.length - 1);

        System.out.println("\nAfter Quick Sort:");

        for (Order order : orders) {
            System.out.println(order);
        }
    }
}