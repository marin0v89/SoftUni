import java.lang.invoke.SwitchPoint;
import java.util.Locale;
import java.util.Scanner;

public class Problem_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String stringInput = scan.nextLine();
        StringBuilder sb = new StringBuilder(stringInput);

        String input = scan.nextLine();
        while (!"Done".equals(input)) {
            String[] tokens = input.split(" ");
            String command = tokens[0];
            switch (command) {
                case "Change":
                    String replace = tokens[1];
                    String replacement = tokens[2];
                    sb = new StringBuilder(sb.toString().replace(replace, replacement));
                    System.out.println(sb.toString());
                    break;
                case "Includes":
                    String stringToCheck = tokens[1];
                    if (sb.toString().contains(stringToCheck)) {
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }
                    break;
                case "End":
                    String endingString = tokens[1];
                    if (sb.toString().endsWith(endingString)) {
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }
                    break;
                case "Uppercase":
                    sb = new StringBuilder(sb.toString().toUpperCase());
                    System.out.println(sb.toString());
                    break;
                case "FindIndex":
                    String charToFind = tokens[1];
                    System.out.println(sb.toString().indexOf(charToFind));
                    break;
                case "Cut":
                    int startIndex = Integer.parseInt(tokens[1]);
                    int length = Integer.parseInt(tokens[2]);
                    String first = sb.toString().substring(startIndex, startIndex + length);
                    System.out.println(first);
                    break;
            }

            input = scan.nextLine();
        }
    }
}
