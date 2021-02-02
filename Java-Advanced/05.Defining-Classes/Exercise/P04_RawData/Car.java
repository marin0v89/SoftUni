package Exercise.P04_RawData;

public class Car {
    private String model;
    private Engine engine;
    private Cargo cargo;
    private Tire[] tiers;

    public Car(String model, Engine engine, Cargo cargo, Tire[] tiers) {
        this.model = model;
        this.engine = engine;
        this.cargo = cargo;
        this.tiers = tiers;

    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public boolean hasTiresWithLessPressureThanOne() {
        for (Tire tier : tiers) {
            if (tier.getPressure() < 1) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return this.model;
    }
}
