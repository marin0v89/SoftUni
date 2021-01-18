package Excercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleTextEditor_08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        StringBuilder sb = new StringBuilder();
        ArrayDeque<String> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = scan.nextLine().split("\\s+");
            String command = tokens[0];
            switch (command) {

                case "1":
                    stack.push(sb.toString());
                    String text = tokens[1];
                    sb.append(text);
                    break;
                case "2":
                    stack.push(sb.toString());
                    int countTimes = Integer.parseInt(tokens[1]);
                   int start = sb.length()-countTimes;
                   sb.delete(start,start+countTimes);

                    break;
                case "3":
                    int index = Integer.parseInt(tokens[1]);
                    System.out.println(sb.charAt(index-1));
                    break;
                case "4":
                    if (!stack.isEmpty())
                    sb = new StringBuilder(stack.pop());
                    break;
            }
        }
    }
}
