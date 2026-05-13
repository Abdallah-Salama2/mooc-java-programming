
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // implement here the program that allows the user to enter 
        // book information and to examine the
        Scanner scan = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        while (true) {
            System.out.println("Title: ");
            String input = scan.nextLine();
            if (input.isEmpty()) {
                break;
            }
            System.out.println("Pages: ");
            int pages = Integer.valueOf(scan.nextLine());
            System.out.println("Publication year: ");
            int publicationYear = Integer.valueOf(scan.nextLine());

            books.add(new Book(input, pages, publicationYear));
        }
        System.out.println("What information will be printed? ");
        String input = scan.nextLine();
        if (input.equals("everything")) {
            for (Book book : books) {
                System.out.println(book);
            }
        } else {
            for (int i = 0; i < books.size(); i++) {
                System.out.println(books.get(i).getTitle());
            }
        }

    }
}
