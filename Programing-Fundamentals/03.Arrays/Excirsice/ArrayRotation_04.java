package Excirsice;

import java.util.Scanner;

public class ArrayRotation_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String []arrayToRotate = scan.nextLine().split("\\s+");
        int timesToRotate = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < timesToRotate; i++) {
            String temp = arrayToRotate[0];
            for (int j = 0; j < arrayToRotate.length-1; j++) {
                arrayToRotate[j]=arrayToRotate[j+1];
            }
            arrayToRotate[arrayToRotate.length-1] = temp;
        }
        for (String s : arrayToRotate) {
            System.out.print(s+" ");
        }
    }
}
