import java.util.Scanner;

public class Login_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        String reverse = "";


        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        boolean isLogged = false;
        for (int i = 0; i < 4; i++) {
            String input = scan.nextLine();
            if (input.equals(reverse)) {
                isLogged = true;
                System.out.printf("User %s logged in.%n", str);
                break;
            }
            if (i<3) {
                System.out.println("Incorrect password. Try again.");
            }
        }
        if (!isLogged) {
            System.out.printf("User %s blocked!", str);
        }
    }
}


