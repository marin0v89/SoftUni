package Excercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class P03_PeriodicTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        Set<String> periodicTable = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = scan.nextLine().split("\\s+");
            periodicTable.addAll(Arrays.asList(tokens));
        }

        for (String s : periodicTable) {
            System.out.print(s+" ");
        }
    }
}

