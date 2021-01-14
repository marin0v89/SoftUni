package Excersice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String regex = ">>(?<furniture>[A-Za-z]+)<<(?<price>[\\d+\\.?\\d]+)!(?<quantity>\\d+)";
        Pattern pattern = Pattern.compile(regex);

        double sum = 0;

        List<String> furniture = new ArrayList<>();
        String input = scan.nextLine();

        while (!"Purchase".equals(input)) {
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                String name = matcher.group("furniture");
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));

                furniture.add(name);
                sum += price * quantity;
            }
            input= scan.nextLine();
        }

        System.out.println("Bought furniture:");
        furniture.forEach(System.out::println);
        System.out.println(String.format("Total money spend: %.2f", sum));
    }
}
