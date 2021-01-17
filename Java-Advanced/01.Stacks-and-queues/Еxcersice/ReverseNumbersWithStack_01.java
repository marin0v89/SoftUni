package Excercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class ReverseNumbersWithStack_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String []numbers = scan.nextLine().split("\\s+");

        ArrayDeque<String> numbersStack = new ArrayDeque<>();

        for (String number : numbers) {
            numbersStack.push(number);
        }

        while (!numbersStack.isEmpty()){
            System.out.print(numbersStack.pop()+" ");
        }
    }
}
