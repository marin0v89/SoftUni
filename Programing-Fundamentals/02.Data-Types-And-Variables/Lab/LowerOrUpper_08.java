package Lab;

import java.util.Scanner;

public class LowerOrUpper_08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char symbol = scan.nextLine().charAt(0);

        if (symbol >= 'A' && symbol <= 'Z') {
            System.out.println("upper-case");
        }
        if (symbol >= 'a' && symbol <= 'z') {
            System.out.println("lower-case");
        }
    }
}
