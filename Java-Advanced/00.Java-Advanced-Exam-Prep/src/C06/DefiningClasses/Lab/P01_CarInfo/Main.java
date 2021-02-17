package C06.DefiningClasses.Lab.P01_CarInfo;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        List<Car> listCar = new LinkedList<>();

        Car car;

        for (int i = 0; i < n; i++) {
            String[] input = scan.nextLine().split("\\s+");
            String brand = input[0];
            String model = input[1];
            int horsePower = Integer.parseInt(input[2]);
            car = new Car(brand, model, horsePower);
            listCar.add(car);
        }
        for (Car carOne : listCar) {
            System.out.println(carOne);
        }
    }
}
