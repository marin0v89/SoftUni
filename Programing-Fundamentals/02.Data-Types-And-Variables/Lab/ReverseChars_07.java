package Lab;

import java.util.Scanner;

public class ReverseChars_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char symbolOne = scan.nextLine().charAt(0);
        char symbolTwo = scan.nextLine().charAt(0);
        char symbolThree = scan.nextLine().charAt(0);

        System.out.printf("%c %c %c", symbolThree, symbolTwo, symbolOne);
    }
}
