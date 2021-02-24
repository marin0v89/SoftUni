package Lab;

import java.io.File;
import java.io.IOException;

public class P08_NestedFolders {

    public static int foldersCount = 0;

    public static void main(String[] args) throws IOException {
        String fileName = "D:\\SoftUniExcercises\\Advanced Resources\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams";

        File file = new File(fileName);

        dfs(file);

        System.out.println(foldersCount + " folders");

    }

    public static void dfs(File file) {
        foldersCount++;
        for (File f : file.listFiles()) {
            if (f.isDirectory()) {
                dfs(f);
            }
        }
        System.out.println(file.getName());
    }
}
