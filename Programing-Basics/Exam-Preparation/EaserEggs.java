import java.util.Scanner;

public class EaserEggs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int eggs = Integer.parseInt(scan.nextLine());

        int redCounter = 0;
        int orangeCounter = 0;
        int blueCounter = 0;
        int greenCounter = 0;


        for (int i = 0; i < eggs; i++) {

            String colour = scan.nextLine();

            switch (colour) {
                case "red":
                    redCounter++;
                    break;
                case "orange":
                    orangeCounter++;
                    break;
                case "blue":
                    blueCounter++;
                    break;
                case "green":
                    greenCounter++;
            }
        }

        int max = redCounter;
        String color = "red";

        if (orangeCounter > max) {
            max = orangeCounter;
            color = "orange";
        }
        if (blueCounter > max) {
            max = blueCounter;
            color = "blue";
        }
        if (greenCounter > max) {
            max = greenCounter;
            color = "green";
        }

        System.out.println("Red eggs: " + redCounter);
        System.out.println("Orange eggs: " + orangeCounter);
        System.out.println("Blue eggs: " + blueCounter);
        System.out.println("Green eggs: " + greenCounter);
        System.out.printf("Max eggs: %d -> %s", max, color);
    }
}
