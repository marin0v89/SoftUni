package Excersice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class LegendaryFarming_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, Integer> keyMaterials = new LinkedHashMap<>();

        keyMaterials.put("shards", 0);
        keyMaterials.put("fragments", 0);
        keyMaterials.put("motes", 0);
        Map<String, Integer> junk = new TreeMap<>();

        boolean isObtained = false;

        while (!isObtained) {
            String[] mats = scan.nextLine().split("\\s+");
            for (int i = 0; i < mats.length; i += 2) {
                int quantity = Integer.parseInt(mats[i]);
                String stuff = mats[i + 1].toLowerCase();
                if (keyMaterials.containsKey(stuff)) {
                    addToMap(keyMaterials, stuff, quantity);
                    isObtained = isObtained(keyMaterials, stuff);
                    if (isObtained){
                        break;
                    }
                } else {
                    addToMap(junk, stuff, quantity);
                }
            }
        }
        keyMaterials
                .entrySet()
                .stream()
                .sorted((i1, i2) -> {
                    int result = i2.getValue().compareTo(i1.getValue());
                    if (result == 0) {
                        result = i1.getKey().compareTo(i2.getKey());
                    }
                    return result;
                })
                .forEach(i -> System.out.printf("%s: %d%n", i.getKey(), i.getValue()));
        junk
                .forEach((k, v) -> System.out.printf("%s: %d%n", k, v));
    }


    private static boolean isObtained(Map<String, Integer> map, String stuff) {
        if (map.get(stuff) >= 250) {
            int newQuantity = map.get(stuff) - 250;
            map.put(stuff, newQuantity);
            switch (stuff) {
                case "shards":
                    System.out.println("Shadowmourne obtained!");
                    break;
                case "fragments":
                    System.out.println("Valanyr obtained!");
                    break;
                case "motes":
                    System.out.println("Dragonwrath obtained!");
                    break;
            }
            return true;
        }
        return false;
    }

    private static void addToMap(Map<String, Integer> map, String stuff, int quantity) {
        map.putIfAbsent(stuff, 0);
        int newQuantity = map.get(stuff) + quantity;
        map.put(stuff, newQuantity);
    }


}
