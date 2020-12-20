package Excersice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        Map<String, String> parkingUser = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = scan.nextLine().split("\\s+");
            String command = tokens[0];
            String name = tokens[1];
            switch (command) {
                case "register":
                    String plateNumber = tokens[2];

                    if (!parkingUser.containsKey(name)) {
                        parkingUser.put(name, plateNumber);
                        System.out.printf("%s registered %s successfully%n", name, plateNumber);
                    } else {
                        System.out.println("ERROR: already registered with plate number " + plateNumber);
                    }
                    break;
                case "unregister":
                    if (!parkingUser.containsKey(name)) {
                        System.out.printf("ERROR: user %s not found%n", name);
                    } else {
                        parkingUser.remove(name);
                        System.out.println(name + " unregistered successfully");
                    }
                    break;
            }
        }
        for (var entry:parkingUser.entrySet()) {
            System.out.printf("%s => %s%n",entry.getKey(),entry.getValue());
        }
    }
}
