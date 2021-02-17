package C06.DefiningClasses.Exercise.P01_OppinionPoll;

import java.util.stream.Stream;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("%s - %d",this.name,this.age);
    }
}
