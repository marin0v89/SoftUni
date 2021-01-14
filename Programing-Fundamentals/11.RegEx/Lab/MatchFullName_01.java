package Lab;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchFullName_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine();

        String regex = "\\b[A-Z][a-z]+[\\ ][A-Z][a-z]+\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher output = pattern.matcher(text);

        while (output.find()){
            System.out.print(output.group()+" ");
        }
    }
}
