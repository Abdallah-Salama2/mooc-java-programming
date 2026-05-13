
import java.util.*;

public class Searching {

    public static void main(String[] args) {
        // The program below is meant for testing the search algorithms you'll write
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        System.out.println("How many books to create?");
        int numberOfBooks = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i < numberOfBooks; i++) {
            books.add(new Book(i, "name for the book " + i));
        }
        printBook(books);

        System.out.println("Id of the book to search for?");
        int idToSearchFor = Integer.valueOf(scanner.nextLine());

        System.out.println("");
        System.out.println("Searching with linear search:");
        long start = System.currentTimeMillis();
        int linearSearchId = linearSearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (linearSearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(linearSearchId));
        }

        System.out.println("");

        System.out.println("");
        System.out.println("Seaching with binary search:");
        start = System.currentTimeMillis();
        int binarySearchId = binarySearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (binarySearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(binarySearchId));
        }

    }

    public static int linearSearch(ArrayList<Book> books, int searchedId) {
        int index = 0;
        for (Book book : books) {
            if (book.getId() == searchedId) {
                return index;
            }
            index++;
        }
        return -1;
    }

    public static void printBook(ArrayList<Book> books) {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public static int indexOfSmallestFrom(ArrayList<Book> books, int startIndex) {
        // write your code heref
        int smallestIndex = startIndex;
        for (int i = startIndex; i < books.size(); i++) {
            if (books.get(i).getId() < books.get(smallestIndex).getId()) {
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static void swap(ArrayList<Book> books, int idx1, int idx2) {
        // write your code here
        Book temp = books.get(idx1);
        books.set(idx1, books.get(idx2));
        books.set(idx2, temp);
    }

    public static void sort(ArrayList<Book> books) {
        for (int i = 0; i < books.size(); i++) {
            int idx = indexOfSmallestFrom(books, i);
            swap(books, i, idx);
        }
    }

    public static int binarySearch(ArrayList<Book> books, long searchedId) {
        int begin = 0;
        int end = books.size() - 1;
        while (begin <= end) {
            int middleIdx = (begin + end) / 2;
            long currentId = books.get(middleIdx).getId();

            if (currentId == searchedId) {
                return middleIdx; // Found it!
            }

            if (searchedId < currentId) {
                end = middleIdx - 1; // Look in the left half
            } else {
                begin = middleIdx + 1; // Look in the right half
            }
        }

        return -1; // Not found
    }

    public static int RecrusivebinarySearch(ArrayList<Book> books, long searchedId, int begin, int end) {
        if (begin > end) {
            return -1; // Or some indicator that the ID wasn't found
        }
        begin = 0;
        end = books.size() - 1;
        int middleIdx = (begin + end) / 2;
        long currentId = books.get(middleIdx).getId();
        if (currentId == searchedId) {
            return middleIdx; // Found it!
        }
        if (searchedId < currentId) {
            return RecrusivebinarySearch(books, searchedId,
                    begin, middleIdx - 1
            );
        } else {
            return RecrusivebinarySearch(books, searchedId, middleIdx + 1, end);
        }

    }

}
