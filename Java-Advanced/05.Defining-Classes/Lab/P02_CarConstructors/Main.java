package Lab.P02_CarConstructors;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Car> carInfo = new LinkedList<>();

        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            String[] tokens = scan.nextLine().split("\\s+");
            String brand = tokens[0];
            Car car = new Car(brand);
            if (tokens.length > 1) {
                String model = tokens[1];
                int horsePower = Integer.parseInt(tokens[2]);
                car = new Car(brand, model, horsePower);
            }
            carInfo.add(car);
        }
        carInfo.forEach(System.out::println);
    }
}
