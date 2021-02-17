package C06.DefiningClasses.Lab.P01_CarInfo;

public class Car {
    private String brand;
    private String model;
    private int horsePower;

    public Car(String brand, String model, int horsePower) {
        this.brand = brand;
        this.model = model;
        this.horsePower = horsePower;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }

    public int getHorsePower() {
        return this.horsePower;
    }

    @Override
    public String toString() {
        return String.format("The car is: %s %s - %d HP.",this.brand,this.model,this.horsePower);
    }
}
