import java.util.Scanner;

public class Moiving_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int width = Integer.parseInt(scan.nextLine());
        int lenght = Integer.parseInt(scan.nextLine());
        int hight = Integer.parseInt(scan.nextLine());
        int freeSpace = width * lenght * hight;

        String input = scan.nextLine();

        while (!input.equals("Done")) {
            int moves = Integer.parseInt(input);
            freeSpace = freeSpace - moves;

            if (freeSpace < 0) {
                break;
            }
            input = scan.nextLine();
        }
        if (freeSpace < 0) {
            int spaceNeedet = Math.abs(freeSpace);
            System.out.printf("No more free space! You need %d Cubic meters more.", spaceNeedet);
        } else {
            System.out.printf("%d Cubic meters left.", freeSpace);
        }
    }
}
