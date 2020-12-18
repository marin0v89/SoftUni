package MidExamJune;

import java.util.*;

public class Numbers_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] parts = scan.nextLine().split("\\s+");

        ArrayList<Integer> numbers = new ArrayList<>();
        for (String part : parts) {
            numbers.add(Integer.parseInt(part));
        }
        int listSum = 0;
        for (Integer number : numbers) {
            listSum += number;
        }
        double average = listSum * 1.0 / numbers.size();

        List<Integer> aboveAverage = new ArrayList<>();
        for (Integer number : numbers) {
            if (number > average) {
                aboveAverage.add(number);
            }

        }
        Collections.sort(aboveAverage);
        Collections.reverse(aboveAverage);

        if (aboveAverage.isEmpty()) {
            System.out.println("No");
        } else {
            for (int i = 0; i < aboveAverage.size(); i++) {
                if (i < 5) {
                    System.out.print(aboveAverage.get(i) + " ");
                }
            }
        }
    }
}
