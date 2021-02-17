package C06.DefiningClasses.Lab.P02_CarConstructors;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        Car car = null;
        List<Car> carInfo = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = scan.nextLine().split("\\s+");
            if (tokens.length == 3) {
                String brand = tokens[0];
                String model = tokens[1];
                int horsePower = Integer.parseInt(tokens[2]);
                car = new Car(brand, model, horsePower);
                carInfo.add(car);
            } else if (tokens.length == 2) {
                String brand = tokens[0];
                String model = tokens[1];
                car = new Car(brand, model);
                carInfo.add(car);
            } else {
                String brand = tokens[0];
                car = new Car(brand);
                carInfo.add(car);
            }
        }
        for (Car cars : carInfo) {
            System.out.println(cars);
        }
    }
}
