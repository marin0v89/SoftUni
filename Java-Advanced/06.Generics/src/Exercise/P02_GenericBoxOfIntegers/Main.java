package Exercise.P02_GenericBoxOfIntegers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            int input = Integer.parseInt(scan.nextLine());
            Box<Integer> box = new Box<>(input);
            System.out.println(box);
        }
    }
}