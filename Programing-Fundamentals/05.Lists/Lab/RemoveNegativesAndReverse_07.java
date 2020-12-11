package Lab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RemoveNegativesAndReverse_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] parts = scan.nextLine().split("\\s+");

        List<Integer> numbers = new ArrayList<>();

        for (String part : parts) {
            int current = Integer.parseInt(part);
            numbers.add(current);
        }

        numbers.removeIf(number -> number < 0);

        Collections.reverse(numbers);

        if (numbers.size() <= 0) {
            System.out.println("empty");
        } else {
            for (Integer number : numbers) {
                System.out.print(number + " ");
            }
        }
    }
}
