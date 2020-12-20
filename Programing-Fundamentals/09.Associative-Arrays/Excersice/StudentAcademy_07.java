package Excersice;

import java.util.*;

public class StudentAcademy_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, List<Double>> students; students = new LinkedHashMap<>();

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            String name = scan.nextLine();
            double grade = Double.parseDouble(scan.nextLine());

            students.putIfAbsent(name,new ArrayList<>());
            students.get(name).add(grade);
        }
        students
                .entrySet()
                .stream()
                .filter(s->s.getValue().stream().mapToDouble(Double::doubleValue).average().orElse(0)>=4.50)
                .sorted((s1,s2)->{
                    double first = s1.getValue().stream().mapToDouble(Double::doubleValue).average().orElse(0);
                    double second = s2.getValue().stream().mapToDouble(Double::doubleValue).average().orElse(0);
                    return Double.compare(second,first);
                })
                .forEach(s-> System.out.println(String.format("%s -> %.2f",
                        s.getKey(),
                        s.getValue().stream().mapToDouble(Double::doubleValue).average().orElse(0)
                )));
    }
}
