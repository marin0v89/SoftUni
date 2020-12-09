package Excersice;

import java.util.Scanner;

class WaterOverFlow_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int tankCapacity = 0;

        for (int i = 0; i < n; i++) {
            int waterIn = Integer.parseInt(scan.nextLine());
            if (tankCapacity + waterIn <= 255) {
                tankCapacity += waterIn;
            } else {
                System.out.println("Insufficient capacity!");

            }

        }
        System.out.println(tankCapacity);
    }
}
