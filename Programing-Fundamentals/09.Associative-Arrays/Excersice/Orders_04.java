package Excersice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, Integer> quantityMap = new LinkedHashMap<>();
        Map<String, Double> priceMap = new LinkedHashMap<>();

        String input = scan.nextLine();
        while (!"buy".equals(input)) {

            String[] tokens = input.split("\\s+");

            String keyProduct = tokens[0];
            double price = Double.parseDouble(tokens[1]);
            int quantity = Integer.parseInt(tokens[2]);

            priceMap.put(keyProduct, price);
            quantityMap.putIfAbsent(keyProduct,0);
            int newQuantity = quantityMap.get(keyProduct)+quantity;
            quantityMap.put(keyProduct,newQuantity);

            input = scan.nextLine();
        }
        quantityMap
                .forEach((k,v)-> System.out.printf("%s -> %.2f%n",k,v*priceMap.get(k)));
    }
}
