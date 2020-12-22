package Excersice;

import java.util.Scanner;

public class ExtractFile_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] path = scan.nextLine().split("\\\\");
        String[] pathName = path[path.length - 1].split("\\.");

        System.out.println("File name: " + pathName[0]);
        System.out.println("File extension: " + pathName[1]);
    }
}
