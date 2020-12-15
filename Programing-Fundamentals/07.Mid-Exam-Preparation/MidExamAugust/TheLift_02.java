package MidExamAugust;

import java.util.Scanner;

public class TheLift_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int people = Integer.parseInt(scan.nextLine());
        String []parts = scan.nextLine().split("\\s+");
        int []lift = new int[parts.length];

        for (int i = 0; i < parts.length; i++) {
            lift[i] = Integer.parseInt(parts[i]);
        }
        for (int i = 0; i < lift.length; i++) {

        }
    }
}
