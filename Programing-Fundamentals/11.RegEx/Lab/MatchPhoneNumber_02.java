package Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchPhoneNumber_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        String regex = "\\+359([ \\-])2\\1[0-9]{3}\\1[0-9]{4}\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        List<String> phoneBook = new ArrayList<>();
        while (matcher.find()){
            phoneBook.add(matcher.group());
        }
        System.out.print((phoneBook.toString()).replaceAll("[\\[\\]]",""));
    }
}
