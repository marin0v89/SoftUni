package Students;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Student> stud = new ArrayList<>();

        String input = scan.nextLine();
        while (!"end".equals(input)) {
            String[] info = input.split(" ");

            String firstName = info[0];
            String lastName = info[1];
            int age = Integer.parseInt(info[2]);
            String city = info[3];

            Student student = new Student(firstName, lastName, age, city);
            stud.add(student);
            input = scan.nextLine();
        }
        String city = scan.nextLine();
        for (Student student : stud) {
            if (city.equals(student.getCity())) {
                System.out.printf("%s %s is %d years old%n", student.getFirstName(),
                        student.getLastName(), student.getAge());
            }
        }

    }
}
