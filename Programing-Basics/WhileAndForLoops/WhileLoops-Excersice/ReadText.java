import java.util.Scanner;

public class ReadText {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int count = 0;
        while (!name .equals("Stop")){
            name = scan.nextLine();
            count ++;

        }
        System.out.println(count);
    }
}
