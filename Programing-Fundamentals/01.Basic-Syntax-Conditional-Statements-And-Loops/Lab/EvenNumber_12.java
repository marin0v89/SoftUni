package Lab;

import java.util.Scanner;

public class EvenNumber_12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            int number = Integer.parseInt(scan.nextLine());

            if (number%2!=0){
                System.out.println("Please write an even number.");
            }else{
                System.out.printf("The number is: %d",Math.abs(number));
                return;
            }
        }
    }
}
