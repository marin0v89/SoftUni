package Excersice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> waggons = readIntList(scan);
        int capacity = Integer.parseInt(scan.nextLine());

        String input = scan.nextLine();
        while (!"end".equals(input)) {
            String[] tokens = input.split("\\s+");
            if ("Add".equals(tokens[0])) {
                int people = Integer.parseInt(tokens[1]);
                waggons.add(people);
            } else {
                int people = Integer.parseInt(tokens[0]);
                for (int i = 0; i < waggons.size(); i++) {
                    int maxCapacity = people + waggons.get(i);
                    if (maxCapacity <= capacity) {
                        waggons.set(i, maxCapacity);
                        break;
                    }
                }
            }

            input = scan.nextLine();
        }
        for (Integer waggon : waggons) {
            System.out.print(waggon + " ");
        }
    }

    private static List<Integer> readIntList(Scanner scan) {
        String[] parts = scan.nextLine().split("\\s+");
        List<Integer> waggons = new ArrayList<>();
        for (String part : parts) {
            int current = Integer.parseInt(part);

            waggons.add(current);
        }
        return waggons;
    }
}
