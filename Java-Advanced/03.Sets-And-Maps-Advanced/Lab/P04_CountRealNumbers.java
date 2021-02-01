package Lab;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P04_CountRealNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<Double, Integer> numbers = new LinkedHashMap<>();

        String[] input = scan.nextLine().split("\\s+");

        for (String s : input) {
            double num = Double.parseDouble(s);
            numbers.putIfAbsent(num, 0);
            numbers.put(num, numbers.get(num)+1);
        }

        for (var entry : numbers.entrySet()) {
            System.out.printf("%.1f -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
