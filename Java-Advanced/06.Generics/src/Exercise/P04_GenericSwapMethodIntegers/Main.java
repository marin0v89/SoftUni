package Exercise.P04_GenericSwapMethodIntegers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Box<Integer> box = new Box<>();

        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            int value = Integer.parseInt(scan.nextLine());
            box.add(value);
        }
        int indexOne = scan.nextInt();
        int indexTwo = scan.nextInt();
        scan.nextLine();
        box.swap(indexOne,indexTwo);
        System.out.println(box);
    }
}
