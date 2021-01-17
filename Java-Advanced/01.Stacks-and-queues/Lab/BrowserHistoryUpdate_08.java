package Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistoryUpdate_08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        ArrayDeque<String> history = new ArrayDeque<>();
        ArrayDeque<String> forward = new ArrayDeque<>();

        while (!"Home".equals(input)) {

            if (input.equals("back")) {
                if (history.size() < 2) {
                    System.out.println("no previous URLs");
                } else {
                    forward.push(history.peek());
                    history.pop();
                    System.out.println(history.peek());
                }
            } else if (input.equals("forward")) {
                if (forward.size() < 1) {
                    System.out.println("no next URLs");
                } else {
                    System.out.println(forward.peek());
                    history.push(forward.pop());
                }
            } else {
                System.out.println(input);
                history.push(input);
                forward.clear();
            }

            input = scan.nextLine();
        }
    }
}
