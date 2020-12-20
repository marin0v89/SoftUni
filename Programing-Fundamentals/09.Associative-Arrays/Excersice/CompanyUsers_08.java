package Excersice;

import java.util.*;

public class CompanyUsers_08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, List<String>> company = new LinkedHashMap<>();

        String input = scan.nextLine();

        while (!"End".equals(input)) {
            String[] tokens = input.split(" -> ");
            String companyName = tokens[0];
            String employee = tokens[1];

            company.putIfAbsent(companyName, new ArrayList<>());
            List<String> list = company.get(companyName);
            if (!list.contains(employee)) {
                list.add(employee);
            }


            input = scan.nextLine();
        }
        company
                .entrySet()
                .stream()
                .sorted((c1, c2) -> c1.getKey().compareTo(c2.getKey()))
                .forEach(c -> {
                    System.out.println(c.getKey());
                    c.getValue().forEach(id -> System.out.printf("-- %s%n", id));
                });

    }
}
