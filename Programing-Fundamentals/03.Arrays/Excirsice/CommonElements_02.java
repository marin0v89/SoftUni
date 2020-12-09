package Excirsice;

import java.util.Scanner;

public class CommonElements_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String []arrOne = scan.nextLine().split("\\s+");
        String []arrTwo = scan.nextLine().split("\\s+");

        for (int i = 0; i < arrTwo.length; i++) {
            for (int j = 0; j < arrOne.length; j++) {
                if (arrTwo[i].equals(arrOne[j])){
                    System.out.print(arrTwo[i]+" ");
                }
            }
        }
    }
}
