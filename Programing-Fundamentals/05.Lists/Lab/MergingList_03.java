package Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MergingList_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> first = readList(scan);
        List<Integer> second = readList(scan);


        int minLengh = Math.min(first.size(), second.size());

        for (int i = 0; i < minLengh; i++) {
            System.out.print(first.get(i) + " ");
            System.out.print(second.get(i) + " ");
        }
        printAfterIndex(first, minLengh);
        printAfterIndex(second, minLengh);

    }

    private static void printAfterIndex(List<Integer> to, int from) {
        for (int i = from; i < to.size(); i++) {
            System.out.print(to.get(i) + " ");
        }
    }

    private static List<Integer> readList(Scanner scan) {
        String[] parts = scan.nextLine().split("\\s+");

        List<Integer> numbers = new ArrayList<>();
        for (String part : parts) {
            int current = Integer.parseInt(part);

            numbers.add(current);
        }
        return numbers;
    }
}
