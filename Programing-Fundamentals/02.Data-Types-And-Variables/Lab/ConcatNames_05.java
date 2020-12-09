package Lab;

import java.util.Scanner;

public class ConcatNames_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nameOne = scan.nextLine();
        String nameTwo = scan.nextLine();
        String delimiter = scan.nextLine();

        System.out.printf("%s%s%s",nameOne,delimiter,nameTwo);
    }
}
