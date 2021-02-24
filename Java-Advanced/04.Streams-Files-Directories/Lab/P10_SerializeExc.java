package Lab;

import java.io.*;
import java.util.List;

public class P10_SerializeExc {

    public static class Car implements Serializable{
        private String make;
        private String model;
        private int year;
        private int hp;

        public Car(String make, String model, int year, int hp) {
            this.make = make;
            this.model = model;
            this.year = year;
            this.hp = hp;
        }

        @Override
        public String toString() {
            return "Car{" +
                    "make='" + make + '\'' +
                    ", model='" + model + '\'' +
                    ", year=" + year +
                    ", hp=" + hp +
                    '}';
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String fileName =
                "D:\\SoftUniExcercises\\Advanced Resources" +
                        "\\04. Java-Advanced-Files-and-Streams-Lab-Resources" +
                        "\\Files-and-Streams";


        Car car = new Car("Lada","Niva",2003,120);

        ObjectOutputStream outputStream =
                new ObjectOutputStream(new FileOutputStream("list.txt"));

        outputStream.writeObject(car);
        outputStream.close();

        ObjectInputStream inputStream =
                new ObjectInputStream(new FileInputStream("list.txt"));

        Car outputCar = (Car) inputStream.readObject();
        System.out.println(outputCar);
    }
}

