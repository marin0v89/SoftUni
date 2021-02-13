package C01.StacksAndQueues.Excercise;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class P02_BasiStackOperation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nToAdd = scan.nextInt();
        int sToPop = scan.nextInt();
        int xToFind = scan.nextInt();
        scan.nextLine();

        ArrayDeque<Integer> numbers = new ArrayDeque<>();

        int[] arr = Arrays.stream(scan.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        for (int i = 0; i < nToAdd; i++) {
            numbers.push(arr[i]);
        }
        for (int i = 0; i < sToPop; i++) {
            numbers.pop();
        }
        if (numbers.isEmpty()){
            System.out.println("0");
            return;
        }
        System.out.println(isFound(numbers,xToFind));
    }

    private static String isFound(ArrayDeque<Integer> numbers, int xToFind) {
        return !numbers.contains(xToFind)
                ? String.valueOf(getMin(numbers))
                :"true";
    }

    private static int getMin(ArrayDeque<Integer> numbers) {
        int min = Integer.MAX_VALUE;
        for (Integer number : numbers) {
            if (number<min){
                min=number;
            }
        }
        return min;
    }
}
