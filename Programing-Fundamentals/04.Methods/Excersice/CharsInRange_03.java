package Excersice;

import java.util.Scanner;

public class CharsInRange_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char start = scan.nextLine().charAt(0);
        char end = scan.nextLine().charAt(0);

        printCharsBetween(start,end);

    }

    private static void printCharsBetween(char start, char end) {
            if (end<start){
                for (int i = end; i <start ; i++) {
                    if (i==end){
                        continue;
                    }
                    System.out.print((char)i+" ");
                }
            }
        for (int i = start; i <end; i++) {
            if (i == start){
                continue;
            }
            System.out.print((char)i+" ");
        }
    }
}
