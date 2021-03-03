package Excercise;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class P02_SetsOfElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int one = scan.nextInt();
        int two = scan.nextInt();

        Set<Integer> setOne = new LinkedHashSet<>();
        Set<Integer> setTwo = new LinkedHashSet<>();

        scan.nextLine();

        for (int i = 0; i < one; i++) {
            int num = Integer.parseInt(scan.nextLine());
            setOne.add(num);
        }

        for (int i = 0; i < two; i++) {
            int num = Integer.parseInt(scan.nextLine());
            setTwo.add(num);
        }

        for (Integer intOne : setOne) {
            for (Integer intTwo : setTwo) {
                if (intOne.equals(intTwo)){
                    System.out.print(intOne+" ");
                }
            }
        }
    }
}
