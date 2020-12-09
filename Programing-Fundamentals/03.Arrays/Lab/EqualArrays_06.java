package Lab;

import java.util.Scanner;

public class EqualArrays_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] stringArrOne = scan.nextLine().split("\\s+");
        String[] stringArrTwo = scan.nextLine().split("\\s+");

        int[] intArrOne = new int[stringArrOne.length];
        int[] intArrTwo = new int[stringArrTwo.length];

        for (int i = 0; i < intArrOne.length; i++) {
            intArrOne[i] = Integer.parseInt(stringArrOne[i]);
        }
        for (int i = 0; i < intArrTwo.length; i++) {
            intArrTwo[i] = Integer.parseInt(stringArrTwo[i]);
        }

        int sum = 0;
        for (int i = 0; i < intArrOne.length; i++) {
            if (intArrOne[i] != intArrTwo[i]) {
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                return;
            }
            sum += intArrOne[i];
        }
        System.out.printf("Arrays are identical. Sum: %d%n", sum);
    }
}

