import java.util.Scanner;

public class EqualSumsEvenOddPosition_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstNum = Integer.parseInt(scan.nextLine());
        int secondNumb = Integer.parseInt(scan.nextLine());

        for (int i = firstNum; i <= secondNumb; i++) {

            String curentNum = "" + i;
            int oddSum = 0;
            int evenSum = 0;
            for (int j = 0; j < curentNum.length(); j++) {
                int currentDigit = Integer.parseInt("" + curentNum.charAt(j));
                if (j % 2 == 0) {
                    evenSum += currentDigit;
                } else {
                    oddSum += currentDigit;
                }

            }
            if (oddSum == evenSum) {
                System.out.print(i + " ");
            }

        }
    }
}
