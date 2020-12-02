import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String actorName = scan.nextLine();
        double academyPoints = Double.parseDouble(scan.nextLine());
        int jourey = Integer.parseInt(scan.nextLine());
        double nomination = academyPoints;
        double grade = 0;
        for (int i = 1; i <= jourey; i++) {

            String name = scan.nextLine();
            double points = Double.parseDouble(scan.nextLine());

            int nameLengts = Integer.parseInt(String.valueOf(name.length()));
            grade = (nameLengts * points) / 2;
            nomination += grade;
            if (nomination >= 1250.5){
                break;
            }
        }
        if (nomination>= 1250.5){
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!",actorName,nomination);
        }else{
            System.out.printf("Sorry, %s you need %.1f more!",actorName,1250.5 - nomination);
        }


    }
}
