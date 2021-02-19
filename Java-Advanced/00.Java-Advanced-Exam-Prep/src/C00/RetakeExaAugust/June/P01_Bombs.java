package C00.RetakeExaAugust.June;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class P01_Bombs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayDeque<Integer> bombEffect = fillBombQueue(scan);
        ArrayDeque<Integer> bombCasing = fillBombStack(scan);

        int daturaBomb = 0;//40
        int cherryBomb = 0;//60
        int smokeDecoyBomb = 0;//120
        while (!bombEffect.isEmpty() && !bombCasing.isEmpty()) {
            int currentBombEffect = bombEffect.peek();
            int currentBombCasing = bombCasing.peek();

            if (currentBombEffect + currentBombCasing == 40) {
                daturaBomb++;
                checkForBomb(bombEffect, bombCasing);
            } else if (currentBombEffect + currentBombCasing == 60) {
                cherryBomb++;
                checkForBomb(bombEffect, bombCasing);
            } else if (currentBombEffect + currentBombCasing == 120) {
                smokeDecoyBomb++;
                checkForBomb(bombEffect, bombCasing);
            } else {
                bombCasing.push(bombCasing.pop() - 5);
            }
            if (checkTheBombs(daturaBomb, cherryBomb, smokeDecoyBomb)) {
                break;
            }
        }
        if (checkTheBombs(daturaBomb, cherryBomb, smokeDecoyBomb)) {
            System.out.println("Bene! You have successfully filled the bomb pouch!");
        } else {
            System.out.println("You don't have enough materials to fill the bomb pouch.");
        }


        if (!bombEffect.isEmpty()) {
            printBombQueue(bombEffect);

        } else {
            System.out.println("Bomb Effects: empty");
        }

        if (!bombCasing.isEmpty()) {
            printBombStack(bombCasing);

        } else {
            System.out.println("Bomb Casings: empty");
        }

        System.out.printf("Cherry Bombs: %d%n", cherryBomb);
        System.out.printf("Datura Bombs: %d%n", daturaBomb);
        System.out.printf("Smoke Decoy Bombs: %d%n", smokeDecoyBomb);
    }

    private static void printBombStack(ArrayDeque<Integer> bomb) {
        System.out.print("Bomb Casings: ");
        StringBuilder sb = new StringBuilder();
        for (int b : bomb) {
            sb.append(bomb.pop());
            if (!bomb.isEmpty()) {
                sb.append(", ");
            }
        }
        System.out.println(sb.toString().trim());

    }

    private static void printBombQueue(ArrayDeque<Integer> bombEffect) {
        System.out.print("Bomb Effects: ");
        StringBuilder sb = new StringBuilder();
        for (int bomb : bombEffect) {
            sb.append(bombEffect.poll());
            if (!bombEffect.isEmpty()) {
                sb.append(", ");
            }
        }
        System.out.println(sb.toString().trim());
    }


    private static void checkForBomb(ArrayDeque<Integer> bombEffect, ArrayDeque<Integer> bombCasing) {
        bombEffect.poll();
        bombCasing.pop();
    }

    private static boolean checkTheBombs(int daturaBomb, int cherryBomb, int smokeDecoyBomb) {
        return daturaBomb >= 3 && cherryBomb >= 3 && smokeDecoyBomb >= 3;
    }

    private static ArrayDeque<Integer> fillBombStack(Scanner scan) {
        ArrayDeque<Integer> bomb = new ArrayDeque<>();
        int[] arr = Arrays.stream(scan.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();
        for (int i : arr) {
            bomb.push(i);
        }

        return bomb;
    }

    private static ArrayDeque<Integer> fillBombQueue(Scanner scan) {
        ArrayDeque<Integer> bomb = new ArrayDeque<>();
        int[] arr = Arrays.stream(scan.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();
        for (int i : arr) {
            bomb.offer(i);
        }
        return bomb;
    }
}

