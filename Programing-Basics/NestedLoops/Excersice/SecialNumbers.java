import java.util.Scanner;

public class SecialNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int specialDigit = Integer.parseInt(scan.nextLine());

        for (int currentNumber = 1111; currentNumber < 9999; currentNumber++) {

            String copyNum = currentNumber + "";
            boolean isSpecial = true;
            for (int i = 0; i < copyNum.length(); i++) {
                char currentDigit = copyNum.charAt(i);
                int digitAsInteger = Integer.parseInt(currentDigit + "");
                if (digitAsInteger==0){
                    isSpecial =false;
                    break;
                }
                if (specialDigit % digitAsInteger != 0) {
                    isSpecial = false;
                    break;
                }
            }
            if (isSpecial) {
                System.out.print(currentNumber + " ");
            }
        }
    }
}
