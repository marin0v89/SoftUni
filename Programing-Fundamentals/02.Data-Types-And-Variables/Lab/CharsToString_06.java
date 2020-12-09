package Lab;

import java.util.Scanner;

public class CharsToString_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String result = "";

        for (int i = 0; i < 3; i++) {
            char symbol = scan.nextLine().charAt(0);
            result = result + symbol;
        }
        System.out.println(result);
    }
}
