package Exercise.P01_GenericBox;

public class Box<E> {
    private E value;

    public Box(E value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.format("%s: %s", this.value.getClass().getName(), value);
    }
}
