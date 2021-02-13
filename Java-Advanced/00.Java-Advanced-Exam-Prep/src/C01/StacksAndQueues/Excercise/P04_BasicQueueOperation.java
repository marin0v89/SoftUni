package C01.StacksAndQueues.Excercise;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class P04_BasicQueueOperation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nToOffer = scan.nextInt();
        int sToPoll = scan.nextInt();
        int xToFind = scan.nextInt();
        scan.nextLine();

        ArrayDeque<Integer> numQueue = new ArrayDeque<>();

        int[] arr = Arrays.stream(scan.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 0; i < nToOffer; i++) {
            numQueue.offer(arr[i]);
        }
        for (int i = 0; i < sToPoll; i++) {
            numQueue.poll();
        }
        if (numQueue.isEmpty()) {
            System.out.println(0);
            return;
        }
        System.out.println(findTheX(numQueue, xToFind));
    }

    private static String findTheX(ArrayDeque<Integer> numQueue, int xToFind) {
        return !numQueue.contains(xToFind)
                ? String.valueOf(minElement(numQueue))
                : "true";
    }

    private static int minElement(ArrayDeque<Integer> numQueue) {
        int min = Integer.MAX_VALUE;
        for (Integer integer : numQueue) {
            if (integer < min) {
                min = integer;
            }
        }
        return min;
    }
}
