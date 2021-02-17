package C06.DefiningClasses.Exercise.P01_OppinionPoll;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        List<Person> info= new LinkedList<>();

        for (int i = 0; i < n; i++) {
            String name = scan.next();
            int age = scan.nextInt();
            scan.nextLine();
            info.add(new Person(name,age));
        }
        info.stream().filter(a->a.getAge()>30)
                .sorted(Comparator.comparing(Person::getName))
                .forEach(System.out::println);
    }
}
