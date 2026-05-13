
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
public class UI {

    private int num;
    private Scanner scanner;

    public UI(Scanner scanner) {
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            String command = scanner.nextLine();
            if (command.equals("end")) {
                break;
            }

            processCommand(command);
        }
    }

    private void processCommand(String command) {
        int num = Integer.parseInt(command);
        System.out.println(num * num * num);
    }
}
