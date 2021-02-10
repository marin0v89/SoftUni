package Exercise.P08_CustomListSorter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CustomList<E extends Comparable<E>> {
    private List<E> value;

    public CustomList() {
        this.value = new ArrayList<>();
    }

    public void add(E item) {
        this.value.add(item);
    }

    public E remove(int index) {
        return this.value.remove(index);
    }

    public boolean contains(E element) {
        return this.value.contains(element);
    }

    public void swap(int indexOne, int indexTwo) {
        E firstElement = this.value.get(indexOne);
        this.value.set(indexOne, this.value.get(indexTwo));
        this.value.set(indexTwo, firstElement);
    }

    public long countGreater(E element) {
        return this.value
                .stream().filter(e -> e.compareTo(element) > 0).count();
    }

    public E getMax() {
        E maxEl = null;
        if (!this.value.isEmpty()) {
            maxEl = this.value.get(0);
            for (E e : this.value) {
                if (e.compareTo(maxEl) > 0) {
                    maxEl = e;
                }
            }
        }
        return maxEl;
    }

    public E getMin() {
        E maxEl = null;
        if (!this.value.isEmpty()) {
            maxEl = this.value.get(0);
            for (E e : this.value) {
                if (e.compareTo(maxEl) < 0) {
                    maxEl = e;
                }
            }
        }
        return maxEl;
    }
    public int size(){
        return this.value.size();
    }
    public E get(int index){
        return this.value.get(index);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (E e : this.value) {
            sb
                    .append(e)
                    .append(System.lineSeparator());
        }

        return sb.toString().trim();
    }
}
