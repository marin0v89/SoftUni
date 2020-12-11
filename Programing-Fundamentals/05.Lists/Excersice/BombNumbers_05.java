package Excersice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BombNumbers_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer>numbers = readIntList(scan);
        int []bombInfo = readInArray(scan);

        int bomb = bombInfo[0];
        int bombPower = bombInfo[1];

        while (numbers.contains(bomb)) {
            int index = numbers.indexOf(bomb);

            int leftBound = Math.max(index-bombPower,0);
            int rightBound = Math.min(index+bombPower,numbers.size()-1);
            for (int i = rightBound; i >=leftBound ; i--) {
                numbers.remove(i);
            }
        }
        int sum = sumList(numbers);
        System.out.println(sum);
    }

    private static int sumList(List<Integer> numbers) {
        int result = 0;
        for (Integer number : numbers) {
            result+=number;
        }
        return result;
    }

    private static int[] readInArray(Scanner scan) {
        String []data = scan.nextLine().split("\\s+");
        int []numbers = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            numbers[i] = Integer.parseInt(data[i]);
        }
        return numbers;
    }

    private static List<Integer> readIntList(Scanner scan) {
        List<Integer>numbers = new ArrayList<>();
        String[] parts = scan.nextLine().split("\\s+");
        for (String part : parts) {
            numbers.add(Integer.valueOf(part));
        }
        return numbers;
    }
}
