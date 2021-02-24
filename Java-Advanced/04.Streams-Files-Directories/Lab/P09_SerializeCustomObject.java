package Lab;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class P09_SerializeCustomObject {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String fileName = "D:\\SoftUniExcercises\\Advanced Resources\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams";

        List<String> names = new ArrayList<>();

        names.add("Martin");
        names.add("Sasho");
        names.add("Niki");
        names.add("Nedko");

        ObjectOutputStream outputStream =
                new ObjectOutputStream(new FileOutputStream("list.txt"));

        outputStream.writeObject(names);
        outputStream.close();

        ObjectInputStream inputStream =
                new ObjectInputStream(new FileInputStream("list.txt"));

        List<String >readnames = (List<String>)inputStream.readObject();

        for (String name : readnames) {
            System.out.println(name);
        }
    }

}
