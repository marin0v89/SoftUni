package Lab.P02_ArrayCreator;

public class Main {
    public static void main(String[] args) {

        Integer[] array = ArrayCreator.create(13, 13);
        String[] strings = ArrayCreator.create(String.class, 13, "Java");

        for (Integer integer : array) {
            System.out.println(integer);
        }

    }
}
