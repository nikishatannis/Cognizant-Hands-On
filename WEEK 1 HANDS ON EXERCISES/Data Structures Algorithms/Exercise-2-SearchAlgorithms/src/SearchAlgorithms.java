public class SearchAlgorithms {

    // Linear Search
    public static int linearSearch(Product[] products, String target) {

        for (int i = 0; i < products.length; i++) {

            if (products[i].productName.equalsIgnoreCase(target)) {
                return i;
            }
        }

        return -1;
    }

    // Binary Search
    public static int binarySearch(Product[] products, String target) {

        int left = 0;
        int right = products.length - 1;

        while (left <= right) {

            int mid = (left + right) / 2;

            int comparison = products[mid].productName.compareToIgnoreCase(target);

            if (comparison == 0) {
                return mid;
            }

            if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}