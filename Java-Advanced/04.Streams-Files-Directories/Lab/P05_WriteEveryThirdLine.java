package Lab;

import javax.swing.*;
import java.io.*;

public class P05_WriteEveryThirdLine {
    public static void main(String[] args) throws IOException {
        String path = "D:\\Projects Java\\JavaAdvanced\\04.SetsFilesDirectories\\src\\Lab\\input.txt";

        BufferedReader reader =
                new BufferedReader(new FileReader(path));

        BufferedWriter writer =
                new BufferedWriter(new FileWriter("file.txt"));

        String line = reader.readLine();

        int lineNumber = 1;

        while (line != null) {
            lineNumber++;
            line = reader.readLine();
            if (lineNumber % 3 == 0) {
                writer.write(line);
                writer.newLine();
            }
        }
        writer.flush();
        writer.close();


    }
}
