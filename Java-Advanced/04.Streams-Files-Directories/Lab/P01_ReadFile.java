package Lab;

import java.io.FileInputStream;
import java.io.IOException;

public class P01_ReadFile {
    public static void main(String[] args) {
        String path = "D:\\Projects Java\\JavaAdvanced\\04.SetsFilesDirectories\\src\\Lab\\input.txt";
        try (FileInputStream fileStream = new FileInputStream(path)) {
            int oneByte = fileStream.read();
            while (oneByte > 0){
                System.out.printf("%s ",Integer.toBinaryString(oneByte));
                oneByte= fileStream.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
