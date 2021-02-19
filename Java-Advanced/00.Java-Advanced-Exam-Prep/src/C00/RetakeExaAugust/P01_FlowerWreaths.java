package C00.RetakeExaAugust;

import java.util.*;

public class P01_FlowerWreaths {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayDeque<Integer> lily = fillStack(scan);
        ArrayDeque<Integer> roses = fillQueue(scan);
        int sum = 0;

        int wreathCount = 0;

        while (!lily.isEmpty() && !roses.isEmpty()) {
            int lilyCount = lily.peek();
            int rosesCount = roses.peek();
            if (lilyCount + rosesCount == 15) {
                wreathCount++;
                lily.pop();
                roses.poll();
            } else if (lilyCount + rosesCount > 15) {
                lily.push(lily.pop() - 2);
            } else if (lilyCount + rosesCount < 15) {
                sum += (lilyCount + rosesCount);
                lily.pop();
                roses.poll();
            }
        }
        System.out.println();
        wreathCount += (sum / 15);

        if (wreathCount >= 5) {
            System.out.printf("You made it, you are going to the competition with %d wreaths!%n", wreathCount);
        } else {
            System.out.printf("You didn't make it, you need %d wreaths more!%n", 5 - wreathCount);
        }

    }

    private static ArrayDeque<Integer> fillQueue(Scanner scan) {
        int[] lilyArr = Arrays.stream(scan.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i : lilyArr) {
            stack.offer(i);
        }
        return stack;
    }

    private static ArrayDeque<Integer> fillStack(Scanner scan) {
        int[] lilyArr = Arrays.stream(scan.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i : lilyArr) {
            stack.push(i);
        }
        return stack;
    }
}
