package Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory_01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String command = scan.nextLine();

        String currentURL = "";
        ArrayDeque<String> history = new ArrayDeque<>();

        while (!command.equals("Home")) {
            if (!"back".equals(command)){
                history.push(command);
                System.out.println(history.peek());
            }else {
                if (history.size()<2){
                    System.out.println("no previous URLs");
                }else {
                    history.pop();
                    System.out.println(history.peek());
                }
            }
            command = scan.nextLine();
        }
    }
}
