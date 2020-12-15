package Students;

public class Student {
    String firstName;
    String lastName;
    int age;
    String city;


    public Student(String firstName, String lastName, int age, String city) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.city = city;
    }

    public String getCity() {

        return city;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
}
