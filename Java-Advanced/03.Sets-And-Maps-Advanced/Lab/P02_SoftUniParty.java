package Lab;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class P02_SoftUniParty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Set<String> guests = new TreeSet<>();


        String firstInput = scan.nextLine();

        while (!"PARTY".equals(firstInput)){
            guests.add(firstInput);
            firstInput = scan.nextLine();
        }
        String secondInput = scan.nextLine();
        while (!"END".equals(secondInput)){
            guests.remove(secondInput);
            secondInput = scan.nextLine();
        }
        System.out.println(guests.size());
        for (String guest : guests) {
            System.out.println(guest);
        }
    }
}
