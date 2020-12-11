package Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GaussTrick_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] parts = scan.nextLine().split("\\s+");

        List<Integer> numbers = new ArrayList<>();

        for (String part : parts) {
            int current = Integer.parseInt(part);

            numbers.add(current);
        }
        for (int i = 0; i < numbers.size() - 1; i++) {
            if (i == numbers.size() - 1) {
                break;
            }
            int fist = numbers.get(i);
            int last = numbers.get(numbers.size() - 1);

            numbers.set(i, fist + last);
            numbers.remove(numbers.size() - 1);
        }
        for (Integer number : numbers) {

            System.out.print(number + " ");
        }
    }
}
