
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Which file should have its contents printed?");
        String txt = scanner1.nextLine();
        try ( Scanner scanner2 = new Scanner(Paths.get(txt))) {
            while (scanner2.hasNextLine()) {
                String row = scanner2.nextLine();
                System.out.println(row);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
