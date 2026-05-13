
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
    private Container container;

    public UI(Scanner scanner, Container container) {
        this.container = container;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            processCommand(command, amount);
        }
    }

    private void processCommand(String command, int amount) {
        if (command.equals("add")) {
            container.add(amount);
        } //        if (command.equals("move")) {
        //            if (n > amounts[0]) {
        //                n = amounts[0];
        //            }
        //            amounts[0] = amounts[0] - n;
        //
        //            amounts[1] = (n + amounts[1]) > 100 ? 100 : n + amounts[1];
        //
        //        }
        else if (command.equals("remove")) {
            container.remove(amount);
        }
    }
}
