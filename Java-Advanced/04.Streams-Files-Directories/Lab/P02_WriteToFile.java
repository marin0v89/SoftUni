package Lab;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;

public class P02_WriteToFile {
    public static void main(String[] args) throws IOException {
        String path = "D:\\Projects Java\\JavaAdvanced\\04.SetsFilesDirectories\\src\\Lab\\input.txt";

        FileInputStream inputStream = new FileInputStream(path);
        FileOutputStream outputStream = new FileOutputStream("file.txt");

        PrintWriter writer = new PrintWriter(outputStream);

        int singleByte = inputStream.read();
        Set<Character>punctuations = new HashSet<>();
        punctuations.add(',');
        punctuations.add('.');
        punctuations.add('!');
        punctuations.add('?');

        while (singleByte > 0) {

            char symbol = (char) singleByte;
            if (!punctuations.contains(symbol)){
                writer.print(symbol);
            }

            singleByte = inputStream.read();
        }
        writer.close();
    }
}
