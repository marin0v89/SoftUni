package Lab;

import java.util.Scanner;

public class Substring_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String keyWord = scan.nextLine();
        String text = scan.nextLine();

        while (text.contains(keyWord)){
            text=text.replace(keyWord,"");
        }
        System.out.println(text);
    }
}
