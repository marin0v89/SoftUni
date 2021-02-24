package Lab;

import java.io.*;
import java.util.Scanner;

public class P04_ExtractIntegers {
    public static void main(String[] args) throws IOException {
        String path = "D:\\Projects Java\\JavaAdvanced\\04.SetsFilesDirectories\\src\\Lab\\input.txt";

        FileInputStream inputStream = new FileInputStream(path);
        FileWriter writer = new FileWriter("file.txt");

        Scanner scan = new Scanner(inputStream);

        while (scan.hasNext()){
            if(scan.hasNextInt()) {
                int number = scan.nextInt();
                writer.write(String.valueOf(number));
                writer.write(System.lineSeparator());
            }
            scan.next();
        }
        writer.flush();
        writer.close();
    }
}
