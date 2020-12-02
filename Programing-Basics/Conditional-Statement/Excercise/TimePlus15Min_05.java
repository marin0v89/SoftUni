import java.util.Scanner;

public class TimePlus15Min_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hours = Integer.parseInt(scan.nextLine());
        int minutes = Integer.parseInt(scan.nextLine());
        int hoursInMinutes = hours * 60;
        int all = minutes + hoursInMinutes + 15;
        int hrs = all/60;
        int mins = all % 60;
        if (hrs ==24){
            hrs-=24;
        }
        System.out.printf("%d:%02d",hrs ,mins);
    }
}
