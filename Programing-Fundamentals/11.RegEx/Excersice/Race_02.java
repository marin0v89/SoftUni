package Excersice;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Race_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        final String digitRegex = "\\d";
        final String letterRegex = "[A-Za-z]";

        Pattern digits = Pattern.compile(digitRegex);
        Pattern letters = Pattern.compile(letterRegex);

        String[] input = scan.nextLine().split(", ");

        List<String> contestants = new ArrayList<>(Arrays.asList(input));
        Map<String, Integer> race = new LinkedHashMap<>();

        String inputLine = scan.nextLine();
        while (!"end of race".equals(inputLine)) {
            StringBuilder sb = new StringBuilder();
            Matcher letterMatcher = letters.matcher(inputLine);
            while (letterMatcher.find()) {
                sb.append(letterMatcher.group());
            }
            if (contestants.contains(sb.toString())) {
                race.putIfAbsent(sb.toString(), 0);

                int km = race.get(sb.toString());

                Matcher digitMatcher = digits.matcher(inputLine);
                while (digitMatcher.find()) {
                    km += Integer.parseInt(digitMatcher.group());
                }
                race.put(sb.toString(), km);
            }
            inputLine = scan.nextLine();
        }
        List<String> output = new ArrayList<>();
        output.add("1st place: ");
        output.add("2nd place: ");
        output.add("3rd place: ");

        race
                .entrySet()
                .stream()
                .sorted((r1, r2) -> r2.getValue().compareTo(r1.getValue()))
                .limit(3)
                .forEach(r -> {
                    System.out.println(output.remove(0) + r.getKey());
                });

    }
}
