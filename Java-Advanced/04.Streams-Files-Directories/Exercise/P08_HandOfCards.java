package Excercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P08_HandOfCards {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String line = scan.nextLine();

        Map<String, Set<String>> playersCards = new LinkedHashMap<>();

        while (!"JOKER".equals(line)) {
            String[] tokens = line.split(": ");
            String name = tokens[0];
            String[] cards = tokens[1].split(",\\s+");

            if (!playersCards.containsKey(name)) {
                playersCards.put(name, new HashSet<>());
            }

            for (String card : cards) {
                playersCards.get(name).add(card);
            }

            String regex = "([0-9]+|[JQKA])([CHDS]{1})";
            Pattern pattern = Pattern.compile(regex);

            for (var entry : playersCards.entrySet()) {
                String namePlayer = entry.getKey();
                int playersScore = 0;

                for (String card : entry.getValue()) {
                    Matcher matcher = pattern.matcher(card);

                    if (matcher.find()) {
                        String power = matcher.group(1);
                        String type = matcher.group(2);

                        int value = getValueByPower(power);
                        int multiplier = getMultiplierByType(type);
                        int scores = value * multiplier;
                        playersScore += scores;
                    }
                }
                System.out.println(String.format("%s: %d", namePlayer, playersScore));

                line = scan.nextLine();
            }
        }
    }

    private static int getMultiplierByType(String type) {
        int multiplier = 0;
        switch (type) {
            case "S":
                multiplier = 4;
                break;
            case "D":
                multiplier = 2;
                break;
            case "H":
                multiplier = 3;
                break;
            case "C":
                multiplier = 1;
                break;
        }
        return multiplier;
    }

    private static int getValueByPower(String power) {
        int value;
        switch (power) {
            case "J":
                value = 11;
                break;
            case "Q":
                value = 12;
                break;
            case "K":
                value = 13;
                break;
            case "A":
                value = 14;
                break;
            default:
                value = Integer.parseInt(power);
                break;

        }
        return value;
    }
}
