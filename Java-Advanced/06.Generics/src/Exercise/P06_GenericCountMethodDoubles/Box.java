package Exercise.P06_GenericCountMethodDoubles;

import java.util.ArrayList;
import java.util.List;

public class Box<E extends Comparable<E>> {
    private List<E> values;

    public Box() {
        this.values = new ArrayList<>();
    }

    public void add(E value) {
        this.values.add(value);
    }

    public long compareByValue(E toCompare) {
        return this.values.stream().filter(e -> e.compareTo(toCompare) > 0).count();
    }
}
