package C01.StacksAndQueues.Lab;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P01_BrowserHistory {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        ArrayDeque<String> history = new ArrayDeque<>();

        while (!"Home".equals(input)) {
            if (!"back".equals(input)) {
                history.push(input);
                System.out.println(history.peek());
            } else {
                if (history.size() < 2) {
                    System.out.println("no previous URLs");
                } else {
                    history.pop();
                    System.out.println(history.peek());
                }
            }
            input = scan.nextLine();
        }
    }
}
