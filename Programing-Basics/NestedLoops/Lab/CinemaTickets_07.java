import java.util.Scanner;

public class CinemaTickets_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        int totalCount = 0;
        int countStandard = 0;
        int countStudent = 0;
        int countKids = 0;


        while (!input.equals("Finish")) {
            int freeSeats = Integer.parseInt(scan.nextLine());
            String type = scan.nextLine();
            int seatsTaken = 0;
            while (!type.equals("End")) {
                switch (type) {
                    case "standard":
                        countStandard++;
                        break;
                    case "student":
                        countStudent++;
                        break;
                    case "kid":
                        countKids++;
                        break;
                }
                totalCount++;
                seatsTaken++;
                if (freeSeats == seatsTaken){
                    break;
                }
                type = scan.nextLine();
            }
            double percent = seatsTaken * 1.0 / freeSeats * 100;
            System.out.printf("%s - %.2f%% full.%n", input, percent);

            input = scan.nextLine();
        }
        System.out.printf("Total tickets: %d%n",totalCount);

        double percentStudent = countStudent*1.0 / totalCount *100;
        System.out.printf("%.2f%% student tickets.%n",percentStudent);

        double percentStandart = countStandard *1.0/totalCount *100;
        System.out.printf("%.2f%% standard tickets.%n",percentStandart);

        double percentKids = countKids*1.0/totalCount*100;
        System.out.printf("%.2f%% kids tickets.%n",percentKids);
    }
}
