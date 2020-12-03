import java.util.Scanner;

public class SumNumbers_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        String input = scan.nextLine();

        while(!input.equals("Stop")){
            int newNumber = Integer.parseInt(input);
            sum +=newNumber;
            input = scan.nextLine();
        }
        System.out.println(sum);
    }
}
