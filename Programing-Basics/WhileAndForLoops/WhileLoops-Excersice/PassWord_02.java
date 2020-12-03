import java.util.Scanner;

public class PassWord_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        String passWord = scan.nextLine();
        String imput = scan.nextLine();
        while (!imput.equals(passWord)){
            imput = scan.nextLine();
        }
        System.out.println("Welcome "+name+"!");
    }
}
