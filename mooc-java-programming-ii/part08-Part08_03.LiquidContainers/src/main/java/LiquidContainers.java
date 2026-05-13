
import java.util.ArrayList;
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] amounts = {0, 0};

        while (true) {
            System.out.println("First: " + amounts[0] + "/100");
            System.out.println("Second: " + amounts[1] + "/100");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            } else {
                String[] parts = input.split(" ");

                String command = parts[0];
                int n = Integer.valueOf(parts[1]);
                if (command.equals("add") && n > 0) {

                    int sum = n + amounts[0];
                    amounts[0] = (sum >= 100) ? 100 : sum;

//                    System.out.println("First:" + amounts[0]);
                }

                if (command.equals("move") && n > 0) {
                    if (n > amounts[0]) {
                        n = amounts[0];
                    }
                    amounts[0] = amounts[0] - n;

                    amounts[1] = (n + amounts[1]) > 100 ? 100 : n + amounts[1];

                }

                if (command.equals("remove") && n > 0) {
                    if (n > amounts[1]) {
                        amounts[1] = 0;
                    } else {
                        amounts[1] -= n;
                    }
                }

            }

        }
    }

}
