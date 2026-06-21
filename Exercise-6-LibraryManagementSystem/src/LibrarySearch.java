public class LibrarySearch {

    // Linear Search
    public static int linearSearch(Book[] books, String target) {

        for (int i = 0; i < books.length; i++) {

            if (books[i].title.equalsIgnoreCase(target)) {
                return i;
            }
        }

        return -1;
    }

    // Binary Search
    public static int binarySearch(Book[] books, String target) {

        int left = 0;
        int right = books.length - 1;

        while (left <= right) {

            int mid = (left + right) / 2;

            int comparison = books[mid].title.compareToIgnoreCase(target);

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