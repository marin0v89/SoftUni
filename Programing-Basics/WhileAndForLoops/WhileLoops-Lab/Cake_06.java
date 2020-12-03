import java.util.Scanner;

public class Cake_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cakeWidht = Integer.parseInt(scan.nextLine());
        int cakeLenght = Integer.parseInt(scan.nextLine());
        int cakeVolume = cakeLenght * cakeWidht;
        String input = scan.nextLine();
        while (!input.equals("STOP")) {
            int pieces = Integer.parseInt(input);
            cakeVolume = cakeVolume - pieces;
            if (cakeVolume < 0) {
                break;
            }
            input = scan.nextLine();

        }
        if (cakeVolume < 0) {
            int cakeNeed = Math.abs(cakeVolume);
            System.out.printf("No more cake left! You need %d pieces more.", cakeNeed);
        } else {
            System.out.printf("%d pieces are left.", cakeVolume);
        }
    }
}

