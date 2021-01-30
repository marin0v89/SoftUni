package Lab;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class P01_ParkingLot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        Set<String> numbers = new LinkedHashSet<>();

        while (!"END".equals(input)) {
            String[] tokens = input.split(", ");
            String command = tokens[0];
            String carNumber = tokens[1];

            if ("IN".equals(command)) {
                numbers.add(carNumber);
            } else if ("OUT".equals(command)) {
                numbers.remove(carNumber);
            }

            input = scan.nextLine();
        }
        if (numbers.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        } else {
            for (String number : numbers) {
                System.out.println(number);
            }
        }
    }
}
