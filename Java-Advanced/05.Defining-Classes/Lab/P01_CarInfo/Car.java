package Lab.P01_CarInfo;

public class Car {
    private String car;
    private String model;
    private int horsePower;

    public Car(String car, String model, int horsePower) {
        this.car = car;
        this.model = model;
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return String.format("The car is: %s %s - %d HP.", this.car, this.model, this.horsePower);
    }
}
