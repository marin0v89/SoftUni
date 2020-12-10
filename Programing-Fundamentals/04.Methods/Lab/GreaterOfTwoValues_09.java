package Lab;

import java.util.Scanner;

public class GreaterOfTwoValues_09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        switch (input) {
            case "int":
                int numOne = Integer.parseInt(scan.nextLine());
                int numTwo = Integer.parseInt(scan.nextLine());
                int result = getMax(numOne, numTwo);
                System.out.println(result);
                break;
            case "char":
                char charOne = scan.nextLine().charAt(0);
                char charTwo = scan.nextLine().charAt(0);
                char charResult = getMax(charOne, charTwo);
                System.out.println(charResult);
                break;
            case "string":
                String strOne = scan.nextLine();
                String strTwo = scan.nextLine();
                String strResult = getMax(strOne, strTwo);
                System.out.println(strResult);
                break;
        }
    }

    private static int getMax(int numOne, int numTwo) {
        return Math.max(numOne, numTwo);
    }

    private static char getMax(char charOne, char charTwo) {
        if (charOne > charTwo) {
            return charOne;
        }
        return charTwo;

    }

    private static String getMax(String strOne, String strTwo) {
        if (strOne.compareTo(strTwo) >= 0) {
            return strOne;
        }
        return strTwo;

    }
}
