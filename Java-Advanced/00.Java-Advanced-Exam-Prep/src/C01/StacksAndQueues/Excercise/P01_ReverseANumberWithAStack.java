package C01.StacksAndQueues.Excercise;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class P01_ReverseANumberWithAStack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int []numbers = Arrays.stream(scan.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        ArrayDeque<Integer>numsReverse = new ArrayDeque<>();

        for (int number : numbers) {
            numsReverse.push(number);
        }

        for (Integer integer : numsReverse) {
            System.out.print(integer+" ");
        }
    }
}
