package Lab;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class P06_SortLines  {
    public static void main(String[] args) throws IOException {
        String path = "D:\\Projects Java\\JavaAdvanced\\04.SetsFilesDirectories\\src\\Lab\\input.txt";

        List<String> lines = Files.readAllLines(Paths.get(path))
                .stream()
                .sorted(String::compareTo)
                .collect(Collectors.toList());

        Files.write(Paths.get("file.txt"),lines, Charset.defaultCharset());


    }
}
