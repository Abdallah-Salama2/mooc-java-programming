
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Abdallah Fawzi
 */
public class TextUI {

    private Scanner scanner;
    private SimpleDictionary words;

    public TextUI(Scanner scanner, SimpleDictionary words) {
        this.scanner = scanner;
        this.words = words;
    }

    public void start() {
        while (true) {
            System.out.println("Command:");
            String command = scanner.nextLine();
            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }
            if (command.equals("add")) {
                System.out.println("Word:");
                String word = scanner.nextLine();
                System.out.println("Translation:");
                String translation = scanner.nextLine();
                words.add(word, translation);
            } else if (command.equals("search")) {
                System.out.println("To be translated");
                String word = scanner.nextLine();
                String translation = words.translate(word); // Get the result first

                if (translation != null) {
                    System.out.println("Translation: " + translation);
                } else {
                    System.out.println("Word " + word + " was not found");
                }

            } else {
                System.out.println("Unknown command");

            }
        }
    }

}
