package Lab;

import java.util.Scanner;

public class RepeatString_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String string = scan.nextLine();
        int countTimes = Integer.parseInt(scan.nextLine());

        String endResult = stringRepeat(string,countTimes);
        System.out.println(endResult);
    }

    private static String stringRepeat(String string, int countTimes) {
        String str = "";
        for (int i = 0; i < countTimes; i++) {
            str +=string;
        }
        return str;
    }
}
