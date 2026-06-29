import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        Book[] books = {
                new Book(101, "Data Structures", "Mark Allen"),
                new Book(102, "Java Programming", "Herbert Schildt"),
                new Book(103, "Operating Systems", "Galvin"),
                new Book(104, "Computer Networks", "Tanenbaum")
        };

        System.out.println("Linear Search:");

        int index1 = LibrarySearch.linearSearch(books, "Java Programming");

        if (index1 != -1) {
            System.out.println(books[index1]);
        }

        // Sort books before binary search
        Arrays.sort(books, Comparator.comparing(book -> book.title));

        System.out.println("\nBinary Search:");

        int index2 = LibrarySearch.binarySearch(books, "Java Programming");

        if (index2 != -1) {
            System.out.println(books[index2]);
        }
    }
}