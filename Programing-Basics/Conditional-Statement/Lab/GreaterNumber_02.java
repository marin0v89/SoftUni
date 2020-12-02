import java.util.Scanner;

public class GreaterNumber_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numOne = Integer.parseInt(scan.nextLine());
        int numTwo = Integer.parseInt(scan.nextLine());
        if (numOne > numTwo)
            System.out.println(numOne);
        else
            System.out.println(numTwo);
    }
}
