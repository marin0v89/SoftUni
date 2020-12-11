package Excersice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        List<String> guests = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = scan.nextLine().split(" ", 2);
            String name = tokens[0];
            String presence = tokens[1];
            if ("is going!".equals(presence)) {
                if (guests.contains(name)) {
                    System.out.printf("%s is already in the list!%n", name);
                } else {
                    guests.add(name);
                }
            }else if ("is not going!".equals(presence)){
                if (guests.contains(name)) {
                    guests.remove(name);
                } else {
                    System.out.printf("%s is not in the list!%n", name);
                }
            }
        }
        for (String guest : guests) {
            System.out.println(guest);
        }
    }
}
