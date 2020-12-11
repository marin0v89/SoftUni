package Lab;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumAdjacent_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] parts = scan.nextLine().split("\\s+");

        List<Double> numbers = new ArrayList<>();

        for (String part : parts) {
            double current = Double.parseDouble(part);

            numbers.add(current);
        }
        for (int i = 0; i < numbers.size() - 1; i++) {
            double currentNum = numbers.get(i);
            double nextNum = numbers.get(i + 1);
            if (currentNum == nextNum) {
                numbers.set(i, currentNum + nextNum);
                numbers.remove(i + 1);
                i = -1;
            }
        }
        for (double number : numbers) {
            System.out.print(new DecimalFormat("0.#").format(number)+" ");
        }
    }
}
