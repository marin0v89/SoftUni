import java.util.Scanner;

public class FitnesCenter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int people = Integer.parseInt(scan.nextLine());

        //("Back", "Chest", "Legs", "Abs", "Protein shake" или "Protein bar")
        int backCounter = 0;
        int chestCounter = 0;
        int legsCounter = 0;
        int absCounter = 0;
        int proteinShakeCounter = 0;
        int proteinBarCounter = 0;

        for (int i = 0; i < people; i++) {
            String activity = scan.nextLine();
            switch (activity) {
                case "Back":
                    backCounter++;
                    break;
                case "Chest":
                    chestCounter++;
                    break;
                case "Legs":
                    legsCounter++;
                    break;
                case "Abs":
                    absCounter++;
                    break;
                case "Protein shake":
                    proteinShakeCounter++;
                    break;
                case "Protein bar":
                    proteinBarCounter++;
                    break;
            }

        }
        double trainPercent = (backCounter + chestCounter + legsCounter + absCounter) * 100.0 / people;
        double proteinPercent = (proteinShakeCounter + proteinBarCounter) * 100.0 / people;
        System.out.println(backCounter + " - back");
        System.out.println(chestCounter + " - chest");
        System.out.println(legsCounter + " - legs");
        System.out.println(absCounter + " - abs");
        System.out.println(proteinShakeCounter + " - protein shake");
        System.out.println(proteinBarCounter + " - protein bar");
        System.out.printf("%.2f%% - work out%n", trainPercent);
        System.out.printf("%.2f%% - protein", proteinPercent);
    }
}
