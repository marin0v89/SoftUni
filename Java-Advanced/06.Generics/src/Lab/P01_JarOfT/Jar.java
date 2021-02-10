package Lab.P01_JarOfT;

import java.util.ArrayDeque;

public class Jar<T> {
    private ArrayDeque<T> element;

    public Jar() {
        this.element = new ArrayDeque<>();
    }
    public void add(T data){
        this.element.push(data);
    }
    public T remove(){
        return this.element.pop();
    }
}
